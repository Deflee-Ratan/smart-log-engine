# 🚀 Smart Log Engine

A real-time, extensible log processing system built in Java using the **Decorator Design Pattern**. The engine allows dynamic composition of log features such as encryption, compression, redaction, persistence, notifications, and tracing — tailored for modern microservice and DevOps environments.

---

## ✨ Key Features

- 🧱 **Decorator Pattern** for modular, pluggable logging components
- 🔒 AES-256 **Encryption** of sensitive log payloads
- 📦 GZIP **Compression** to reduce storage size
- 🛡️ **Redaction** of configurable sensitive fields (e.g., passwords, tokens)
- 💾 **Persistence** to disk or database (e.g., PostgreSQL, MongoDB)
- 📣 **Notification system** (console, email, webhook) on ERROR/CRITICAL logs
- 🧭 **Tracing Support** – includes trace IDs or user session info

---

## 🛠️ Tech Stack

- **Java 17+**
- **Maven** – build and dependency management
- **JUnit 5** – testing
- **SLF4J** – base logging interface
- **Java Cryptography Extension (JCE)** – AES encryption
- **GZIP** – built-in Java compression


