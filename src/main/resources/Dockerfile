# Base image được sử dụng để build image
FROM --platform=linux/amd64 openjdk:17.0.2-oraclelinux8

# Thông tin tác giả
LABEL maintainer="hongpook"

# Đặt working directory trong container
WORKDIR /app

# Copy file JAR từ thư mục build vào working directory trong container
COPY target/*.jar app.jar

# Mở port mà ứng dụng sử dụng
EXPOSE 8080

# Chỉ định command để chạy ứng dụng khi container khởi chạy
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
