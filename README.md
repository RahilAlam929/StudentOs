# StudentOS

AI-powered student productivity and career management platform. Plan studies, solve doubts, track projects and internships, and build your career from one dashboard.

## Features

- Study planner with AI-generated schedules
- AI doubt solver
- Career roadmaps with skill tracking
- Project management
- Internship tracker (Kanban + table views)
- Resume builder with AI improvements
- Notifications and admin dashboard

## Architecture

Monorepo with separate frontend and backend:

```
StudentOS/
├── frontend/     # Next.js (App Router) + TypeScript + Tailwind + shadcn/ui
├── backend/      # Spring Boot 3 + Java 21 + PostgreSQL + Redis
├── docker-compose.yml
└── .env.example
```

## Tech Stack

| Layer | Technologies |
|-------|-------------|
| Frontend | Next.js, TypeScript, Tailwind CSS, shadcn/ui, React Hook Form, Zod |
| Backend | Spring Boot, Spring Security, JWT, JPA/Hibernate, Flyway |
| Database | PostgreSQL |
| Cache | Redis |
| API Docs | Swagger/OpenAPI (springdoc) |

## Prerequisites

- Node.js 18+
- JDK 21
- Docker & Docker Compose

Install on macOS:

```bash
brew install openjdk@21
brew install --cask docker
```

## Environment Variables

Copy the example file and adjust values:

```bash
cp .env.example .env
```

See [`.env.example`](.env.example) for all variables.

## Local Setup

### 1. Start infrastructure

```bash
docker compose up -d
```

### 2. Backend

```bash
cd backend
./mvnw spring-boot:run
```

API: http://localhost:8080  
Swagger UI: http://localhost:8080/swagger-ui.html

### 3. Frontend

```bash
cd frontend
npm install
npm run dev
```

App: http://localhost:3000

## Database

PostgreSQL runs via Docker Compose on port `5432`. Flyway migrations run automatically on backend startup.

Default credentials (development only):

- Database: `studentos`
- User: `studentos`
- Password: `studentos`

## API Documentation

With the backend running, visit:

- Swagger UI: http://localhost:8080/swagger-ui.html
- OpenAPI JSON: http://localhost:8080/v3/api-docs

## Deployment

Production deployment instructions will be added in Phase 7. Use environment variables for all secrets — never commit API keys or JWT secrets.
# StudentOs
