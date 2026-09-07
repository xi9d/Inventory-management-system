# Inventory Management System (IMS)

A REST API for managing inventory operations — products, orders, customers, suppliers, and staff accounts — built with Spring Boot.

## Tech Stack

- Java 17
- Spring Boot 3.1.3 (Web, Data JPA, Data REST)
- MySQL
- Lombok
- Maven

## Prerequisites

- JDK 17+
- MySQL Server running locally (or accessible remotely)
- Maven (or use the included `mvnw` wrapper)

## Getting Started

1. Create a MySQL database for the project:
   ```sql
   CREATE DATABASE ims;
   ```

2. Configure your database connection in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/ims
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

   The API will start on `http://localhost:8080` by default.

## Project Structure

The codebase is organized by domain, with each package following a Controller → Service → Repository → Entity pattern:

- **Account** — staff/user accounts and roles (Admin, Manager, Salesperson, Warehouse Staff, Customer Support, Reporting Analyst, Guest, Super Admin)
- **Product** — inventory items
- **Order** — customer orders and their status (Pending, In Progress, Completed, Cancelled)
- **Customer** — customer records
- **Supplier** — supplier records

## API Endpoints

All resources expose standard CRUD operations under `/api/v1/`:

| Resource  | Base Path             |
|-----------|------------------------|
| Products  | `/api/v1/products`     |
| Orders    | `/api/v1/orders`       |
| Customers | `/api/v1/customers`    |
| Suppliers | `/api/v1/suppliers`    |
| Accounts  | `/api/v1/accounts`     |

Each resource supports:

- `GET /api/v1/{resource}` — list all
- `GET /api/v1/{resource}/{id}` — get by ID
- `POST /api/v1/{resource}` — create
- `PUT /api/v1/{resource}/{id}` — update
- `DELETE /api/v1/{resource}/{id}` — delete

Accounts additionally support:

- `GET /api/v1/accounts/username/{username}` — look up an account by username

## Running Tests

```bash
./mvnw test
```
