# Intelligent Document Processing Platform (IDPP)

An enterprise-grade Java Spring Boot platform that automates document ingestion, OCR-based extraction, and validation using a microservice-oriented architecture.

## 🚀 Features

- 📄 Document Upload API (PDF, DOCX, Images)
- 🔍 Placeholder for OCR + BERT-based entity extraction
- 🔐 JWT-based authentication system
- 📨 Kafka integration for event-driven workflows
- ☁️ AWS S3-ready for document storage
- 🧱 Modular architecture using Spring Boot

## 🛠️ Tech Stack

- Java 17 + Spring Boot
- Spring Web, Spring Security, Spring Kafka
- JWT Authentication
- Kafka (for message queues)
- Docker (containerization ready)
- Maven (build tool)
- Swagger UI (API documentation)

## 📂 Project Structure

```
src/
├── main/
│   ├── java/com/example/idp/
│   │   ├── controller/      # REST controllers
│   │   ├── kafka/           # Kafka producers/services
│   │   ├── security/        # JWT configs and security
│   └── resources/
│       └── application.properties
pom.xml
```

## 🧪 How to Run

```bash
# Build the project
mvn clean install

# Run the Spring Boot app
mvn spring-boot:run
```

## 🔐 JWT Secret Config

Configure your secret key in `application.properties`:

```properties
jwt.secret=your_custom_secret_key
```

## 📦 Kafka Setup

Add Kafka bootstrap servers in `application.properties`:

```properties
kafka.bootstrap-servers=localhost:9092
```

## 📄 License

This project is for educational/demo purposes only. For production use, extend with security, OCR, and cloud integration.