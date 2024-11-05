<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<h1>🌟 Spring AI Chatbot 🌟</h1>

<p>This repository contains a Spring Boot application that connects to OpenAI's ChatGPT API. The application provides a REST API endpoint for generating conversational responses based on a user prompt.</p>

<h2>📜 Table of Contents</h2>
<ul>
  <li><a href="#features">Features</a></li>
  <li><a href="#technologies-used">Technologies Used</a></li>
  <li><a href="#installation">Installation</a></li>
  <li><a href="#usage">Usage</a></li>
  <li><a href="#project-structure">Project Structure</a></li>
  <li><a href="#configuration">Configuration</a></li>
  <li><a href="#license">License</a></li>
</ul>

<h2 id="features">✨ Features</h2>
<ul>
  <li>🔗 OpenAI API Integration: Connects with OpenAI’s ChatGPT API to process user input and return conversational responses.</li>
  <li>📡 REST API: Provides a <code>/chat</code> endpoint to interact with the ChatGPT model.</li>
  <li>🛠️ Spring Boot Configuration: Uses <code>@Configuration</code> and <code>@RestController</code> annotations to streamline API interactions.</li>
</ul>

<h2 id="technologies-used">💻 Technologies Used</h2>
<ul>
  <li>Spring Boot: Backend framework for API management.</li>
  <li>OpenAI API: ChatGPT API to generate responses.</li>
  <li>RestTemplate: Handles API requests to OpenAI.</li>
  <li>Lombok: Reduces boilerplate code by generating getters, setters, and constructors.</li>
</ul>

<h2 id="installation">⚙️ Installation</h2>
<ol>
  <li><strong>Clone the repository</strong>
    <pre><code>git clone https://github.com/Shinde-Yogesh/Spring-AI-Model.git
cd Spring-AI-Model</code></pre>
  </li>
  <li><strong>Add OpenAI API Key</strong>: Set your OpenAI API key and model parameters in <code>application.properties</code>:
    <pre><code>openai.api.key=YOUR_API_KEY
openai.model=text-davinci-003  # or your chosen model
openai.api.url=https://api.openai.com/v1/chat/completions</code></pre>
  </li>
  <li><strong>Build and Run the Application</strong>
    <pre><code>./mvnw clean install
./mvnw spring-boot:run</code></pre>
  </li>
</ol>

<h2 id="usage">🚀 Usage</h2>
<p>With the application running on <code>http://localhost:8080</code>, use the following endpoint:</p>

<ul>
  <li><strong>GET</strong> <code>/chat</code> - Pass a <code>prompt</code> parameter to receive a ChatGPT response.</li>
</ul>

<h3>Example Request</h3>
<pre><code>curl -X GET "http://localhost:8080/chat?prompt=Hello, how are you?"</code></pre>

<h3>Example Output</h3>
<p>Click <strong>Here</strong> to see the response.</p>
![image](https://github.com/user-attachments/assets/52a27228-ba58-4776-ad2a-9a5c61bfed6b)


<h2 id="project-structure">🗂 Project Structure</h2>
<pre><code>Spring-AI-Model/
├── src/
│   ├── main/java/com/springAI/
│   │   ├── config/                   # OpenAI API configuration
│   │   ├── controller/               # CustomBotController for handling chat requests
│   │   └── dto/                      # DTOs for ChatGPTRequest and ChatGptResponse
├── resources/
│   └── application.properties        # OpenAI API key and configuration settings
└── README.md                         # Project Documentation</code></pre>

<h2 id="configuration">⚙️ Configuration</h2>

<h3><code>OpenAIConfig</code> (in <code>com.springAI.config</code>)</h3>
<p>Configures <code>RestTemplate</code> with an authorization interceptor to pass the OpenAI API key.</p>

<h3><code>CustomBotController</code> (in <code>com.springAI.controller</code>)</h3>
<p>Defines the <code>/chat</code> endpoint, which sends a user’s prompt to the OpenAI API and returns the response.</p>

<h3><code>ChatGPTRequest</code> and <code>ChatGptResponse</code> (in <code>com.springAI.dto</code>)</h3>
<p>Defines data structures to handle request and response data for OpenAI API interactions.</p>

<h2 id="license">📜 License</h2>
<p>This project is licensed under the MIT License. See the <code>LICENSE</code> file for details.</p>

</body>
</html>
