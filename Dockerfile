FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/Train-Ticket-ReservationSystem-SpringBoot-project-1.0.war train-reservation.war

RUN apt-get update && \
    apt-get install -y curl && \
    rm -rf /var/lib/apt/lists/*

EXPOSE 8000

CMD ["java", "-jar", "train-reservation.war"]