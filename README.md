🚂 Ticket Reservation System — Production-Ready DevOps Deployment
Overview

This project demonstrates an end-to-end DevOps deployment of a Java Spring Boot Ticket Reservation System using Docker, GitHub Actions, AWS EC2, Prometheus, and Grafana.

The application is automatically built, containerized, deployed, monitored, and validated using a complete CI/CD pipeline.

Features
Spring Boot Ticket Reservation System
MySQL Database
Docker Compose Deployment
GitHub Actions CI/CD
Docker Hub Image Registry
AWS EC2 Hosting
Nginx Reverse Proxy
Prometheus Monitoring
Grafana Dashboards
MySQL Exporter
Nginx Exporter
cAdvisor Metrics
Spring Boot Actuator
Health Checks
Automatic Deployment Validation
Project Structure
ticket-reservation/
│
├── docker-compose.yml
├── Dockerfile
├── nginx/
│   └── nginx.conf
├── prometheus.yml
├── .github/
│   └── workflows/
│       └── deploy.yml
├── src/
├── pom.xml
└── README.md
Architecture
Internet
     │
     ▼
DuckDNS
     │
     ▼
Nginx
     │
     ▼
Spring Boot
     │
     ▼
MySQL

Prometheus
     ▲
     │
Grafana

cAdvisor
MySQL Exporter
Nginx Exporter
Prerequisites
Docker
Docker Compose
Java 17
Maven
Git
AWS EC2
Docker Hub Account
Clone Repository
git clone https://github.com/YOUR_USERNAME/ticket-reservation.git
Configure Environment

Create a .env file:

MYSQL_ROOT_PASSWORD=
MYSQL_DATABASE=
MYSQL_USER=
MYSQL_PASSWORD=
APP_PORT=8000
DB_PORT=3306
GRAFANA_USER=admin
GRAFANA_PASSWORD=password
Start the Stack
docker compose up -d
Access Services
Service	URL
Application	http://SERVER_IP/TRSApp
Prometheus	http://SERVER_IP:9090
Grafana	http://SERVER_IP:3000
Monitoring

Prometheus scrapes:

Spring Boot Metrics
JVM Metrics
MySQL Metrics
Nginx Metrics
Docker Metrics
CI/CD

Every push to main automatically:

Build application
Build Docker image
Push image to Docker Hub
SSH into EC2
Pull latest image
Restart services
Validate deployment
Verify Prometheus
Verify Nginx
Future Improvements
Kubernetes
Helm
Terraform
AWS EKS
Loki
AlertManager
AWS CloudWatch
ArgoCD
