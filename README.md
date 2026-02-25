# 📘 Spring Boot Application Guide

Dokumen ini menjelaskan langkah-langkah untuk menjalankan project Spring
Boot secara lokal.

------------------------------------------------------------------------

## 📌 1. Persiapan Awal

Pastikan sudah menginstall:

-   ☕ Java JDK 17+
-   📦 Maven atau gunakan Maven Wrapper (mvnw)
-   🐘 PostgreSQL (jika menggunakan database)
-   🐳 (Opsional) Docker

Cek versi Java:

``` bash
java -version
```

------------------------------------------------------------------------

## 📌 2. Clone Repository

``` bash
git clone https://github.com/username/nama-project.git
cd nama-project
```

------------------------------------------------------------------------

## 📌 3. Konfigurasi Environment

Edit file:

src/main/resources/application.properties

Contoh konfigurasi database PostgreSQL:

``` properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nama_database
spring.datasource.username=postgres
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Pastikan database sudah dibuat terlebih dahulu di PostgreSQL.

------------------------------------------------------------------------

## 📌 4. Build Project

Jika menggunakan Maven:

``` bash
mvn clean install
```

Atau jika menggunakan Maven Wrapper:

``` bash
./mvnw clean install
```

Windows:

``` bash
mvnw.cmd clean install
```

------------------------------------------------------------------------

## 📌 5. Menjalankan Aplikasi

### 🔹 Cara 1: Jalankan dengan Maven

``` bash
mvn spring-boot:run
```

### 🔹 Cara 2: Jalankan File JAR

Setelah build berhasil, file `.jar` ada di folder:

target/

Jalankan dengan:

``` bash
java -jar target/nama-project-0.0.1-SNAPSHOT.jar
```

------------------------------------------------------------------------

## 📌 6. Akses Aplikasi

Secara default aplikasi berjalan di:

http://localhost:8080

Jika menggunakan custom port:

``` properties
server.port=8081
```

------------------------------------------------------------------------

## 📌 7. Menjalankan dengan Docker (Opsional)

Build Docker image:

``` bash
docker build -t nama-project .
```

Run container:

``` bash
docker run -p 8080:8080 nama-project
```

------------------------------------------------------------------------

## 📌 8. Struktur Project

    src
     └── main
          ├── java/com/example/project
          │     ├── controller
          │     ├── service
          │     ├── repository
          │     └── entity
          └── resources
                ├── application.properties
                └── static

------------------------------------------------------------------------

## 📌 9. Troubleshooting

### ❌ Port Already in Use

Ubah port di:

``` properties
server.port=8081
```

### ❌ Database Connection Failed

-   Pastikan PostgreSQL berjalan
-   Cek username & password
-   Cek nama database

------------------------------------------------------------------------

## 📌 10. API Documentation (Jika Ada Swagger)

Akses:

http://localhost:8080/swagger-ui.html

atau

http://localhost:8080/swagger-ui/index.html

------------------------------------------------------------------------

# 🚀 Selesai!

Sekarang aplikasi Spring Boot sudah bisa dijalankan.
