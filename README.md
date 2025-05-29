# 🚀 Microservices Learning Journey

Welcome to the **Microservices with Spring Boot and Spring Cloud** project!

This repository is a comprehensive, hands-on learning resource for mastering microservices architecture using Spring Boot, Spring Cloud, Docker, Kubernetes, and related technologies.  

It is designed to guide you through building, deploying, and managing microservices with practical examples, real-world projects, and best practices.

---

## 🌟 Project Overview

| **Category** | **Description** |
|--------------|----------------|
| **Goal** | Build a deep understanding of microservices architecture, from design to deployment, using Spring Boot, Spring Cloud, Docker, Kubernetes, and cloud-native practices. |
| **Audience** | Beginners exploring microservices, developers transitioning to distributed systems, and professionals preparing for real-world microservices projects. |
| **Approach** | Structured lessons with concise explanations, code samples, demos, and hands-on assignments to ensure practical mastery. |
| **Structure** | Organized into 21 parts with 283 lectures, covering theory, implementation, and advanced topics, totaling 40 hours and 33 minutes. |

---

## 📚 What You'll Learn

| **Section** | **Topics Covered** |
|-------------|-------------------|
| **Introduction (Part 1)** | Monolithic vs SOA vs Microservices, Definition of Microservices, Introduction to Spring Boot, Funny Memes |
| **Spring Boot Basics (Part 2)** | IntelliJ IDEA, Creating Spring Boot Projects, REST APIs, H2 DB, YAML, Lombok, DTOs, CRUD APIs |
| **API Enhancements (Part 3)** | Exception Handling, Audit Columns, REST API Documentation with SpringDoc OpenAPI, Annotations |
| **Microservices Design (Part 4)** | Loans & Cards Microservices, Boundary Identification, Strangler Fig Pattern |
| **Docker & Containers (Part 5–6)** | Containers vs VMs, Docker Components, Dockerfile, Buildpacks, Docker Compose, Docker Hub |
| **Cloud-Native Apps (Part 7)** | Cloud-Native Characteristics, 15-Factor Methodology, Configuration Management |
| **Spring Cloud Config (Part 8)** | Config Server, Profiles, Externalized Configurations, Encryption, Spring Cloud Bus |
| **Database Integration (Part 9)** | MySQL Integration, Docker Networking, Service Discovery with Eureka |
| **API Gateway (Part 10)** | Spring Cloud Gateway, Custom Routing, Cross-Cutting Concerns (Tracing, Logging) |
| **Resiliency Patterns (Part 11)** | Circuit Breaker, Retry, Rate Limiter, Bulkhead Patterns |
| **Observability (Part 12)** | Centralized Logging (Grafana, Loki, Promtail), Metrics (Micrometer, Prometheus), Distributed Tracing (Tempo) |
| **Security (Part 13)** | OAuth2, OpenID Connect, KeyCloak, Client Credentials, Authorization Code Grant |
| **Event-Driven Architecture (Part 14)** | Spring Cloud Function, Spring Cloud Stream, RabbitMQ, Apache Kafka |
| **Kubernetes (Part 15–16)** | Kubernetes Architecture, Deployment, ConfigMap, Helm Charts, Kubernetes Dashboard |
| **Cloud Deployment (Part 17)** | Google Cloud Kubernetes, Ingress, Service Mesh, mTLS |
| **Optimization (Part 18–19)** | Spring Boot BOM, Shared Libraries |
| **Conclusion (Part 20–21)** | Recap, Congratulations, and Next Steps |

---

## 🗂️ Learning & Practice Roadmap

### 🏗️ Introduction to Microservices (Part 1)

**What:** Comparisons of Monolithic, SOA, and Microservices architectures, definition of microservices, introduction to Spring Boot, and light-hearted memes. 

**Why:** Understand the evolution of architectures and get familiar with Spring Boot as the foundation for microservices development.

---

### 🛠️ Spring Boot Basics (Part 2)

**What:** Setting up IntelliJ IDEA, creating Spring Boot projects, building REST APIs, configuring H2 database, using YAML, addressing Lombok issues, implementing DTOs, and creating CRUD APIs for the Accounts microservice.  

**Why:** Establish a solid foundation in Spring Boot for building microservices and interacting with databases.

---

### 📝 API Enhancements (Part 3)

**What:** Handling runtime exceptions, updating audit columns, documenting REST APIs using SpringDoc OpenAPI, and leveraging annotations like `@OpenAPIDefinition`, `@Tag`, `@Operation`, `@ApiResponse`, and `@Schema`.  

**Why:** Improve API robustness, maintainability, and developer experience through proper documentation and error handling.

---

### 🧩 Microservices Design (Part 4)

**What:** Building Loans and Cards microservices, identifying service boundaries, applying the Strangler Fig pattern, and sizing microservices with an e-commerce use case.  

**Why:** Learn to design modular, well-defined microservices for scalability and maintainability.

---

### 🐳 Docker & Containers (Parts 5–6)

**What:** Containers vs VMs, Docker architecture, creating Docker images (Dockerfile, Buildpacks, Jib), Docker Compose, Docker Hub, and Docker extensions like LogsExplorer.  

**Why:** Master containerization to package and deploy microservices efficiently in isolated environments.

---

### ☁️ Cloud-Native Applications (Part 7)

**What:** Characteristics of cloud-native apps, differences from traditional enterprise apps, and deep dive into the 15-factor methodology.  

**Why:** Understand the principles of building scalable, resilient, and cloud-ready microservices.

---

### ⚙️ Spring Cloud Config (Part 8)

**What:** Configuration management with Spring Cloud Config, profiles, externalized configurations, encryption/decryption, and runtime refresh with Spring Cloud Bus.  

**Why:** Centralize and dynamically manage configurations for microservices across environments.

---

### 🗄️ Database Integration (Part 9)

**What:** Replacing H2 with MySQL, Docker networking, service discovery with Eureka, and client-side load balancing. 

**Why:** Enable microservices to interact with production-grade databases and discover each other dynamically.

---

### 🌐 API Gateway (Part 10)

**What:** Building an Edge Server with Spring Cloud Gateway, custom routing, and implementing cross-cutting concerns like tracing and logging.  

**Why:** Centralize external communication, enhance security, and improve observability.

---

### 🛡️ Resiliency Patterns (Part 11)

**What:** Circuit Breaker, Retry, Rate Limiter, and Bulkhead patterns, implemented with Spring Cloud Gateway and Feign Client.  

**Why:** Ensure microservices are fault-tolerant and resilient to failures in distributed systems.

---

### 📊 Observability & Monitoring (Part 12)

**What:** Centralized logging (Grafana, Loki, Promtail), metrics with Micrometer and Prometheus, distributed tracing with OpenTelemetry and Tempo, and Grafana dashboards.  

**Why:** Monitor and troubleshoot microservices effectively in production environments.

---

### 🔒 Security (Part 13)

**What:** OAuth2, OpenID Connect, KeyCloak setup, Client Credentials, and Authorization Code grant flows for securing microservices.

**Why:** Protect microservices with industry-standard authentication and authorization mechanisms.

---

### 📡 Event-Driven Architecture (Part 14)

**What:** Event-driven models with Spring Cloud Function, Spring Cloud Stream, RabbitMQ, and Apache Kafka.

**Why:** Enable asynchronous communication for loosely coupled, scalable microservices.

---

### ☸️ Kubernetes (Parts 15–16)

**What:** Kubernetes architecture, local cluster setup, Helm charts, ConfigMap, deploying microservices, and Kubernetes Dashboard.

**Why:** Orchestrate containers at scale with Kubernetes for production-grade deployments.

---

### ☁️ Cloud Deployment (Part 17)

**What:** Deploying microservices on Google Cloud Kubernetes, Kubernetes Ingress, Service Mesh, and mTLS.

**Why:** Learn to deploy and manage microservices in a cloud environment with advanced networking and security.

---

### 🛠️ Optimization (Parts 18–19)

**What:** Optimizing development with Spring Boot BOM and shared libraries.

**Why:** Streamline microservices development for consistency and maintainability.

---

### 🎉 Conclusion (Parts 20–21)

**What:** Recap of key concepts, congratulations, and guidance on next steps.

**Why:** Consolidate learning and prepare for real-world microservices projects.

---

## 💡 How to Use This Repository

- Explore each part folder for detailed notes, code samples, and demos.

- Complete the assignments and hands-on projects (e.g., Loans and Cards microservices) to reinforce learning.

- Use summary tables for quick revision before interviews or certifications.

- Follow best practices and modern tools (Spring Boot, Docker, Kubernetes) for production-ready microservices.

---

## 📬 Feedback & Contribution

Feel free to fork, star, or open issues for suggestions and improvements!  
Let's build scalable, resilient microservices together.

Happy coding and learning! 🌈✨