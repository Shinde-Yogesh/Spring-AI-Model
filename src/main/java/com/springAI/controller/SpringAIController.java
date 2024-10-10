package com.springAI.controller;

import org.springframework.ai.image.ImageModel;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.stabilityai.api.StabilityAiImageOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
public class SpringAIController {

    @Autowired
    private ImageModel openaiImageModel;

    @GetMapping("/image")
    public ResponseEntity<byte[]> getImage(@RequestParam String prompt)
    {
        ImageResponse response = openaiImageModel.call(
                new ImagePrompt(prompt,
                        StabilityAiImageOptions.builder()
                                .withStylePreset("cinematic")
                                .withN(4)
                                .withHeight(1024)
                                .withWidth(1024).build())

        );
        //Decode Base64 String
        String base64Image = response.getResult().getOutput().getB64Json();
        byte[] imageBytes = Base64.getDecoder().decode(base64Image);

        //Set headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG); //adjust the media type
        return  new ResponseEntity<>(imageBytes,headers, HttpStatus.OK);
    }
}
