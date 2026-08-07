# Dia 00 — Setup do Ambiente

🎯 **Objetivo do dia**: Ter todo o ferramental instalado, configurado e rodando sem erros na sua máquina.

### 1. Java 17
* **Verifique:** Abra o terminal (cmd/powershell/wsl) e digite `java -version`.
* **Instale:** Se não tiver, baixe o **Eclipse Temurin JDK 17** em [adoptium.net](https://adoptium.net). Instale no Windows e configure a variável de ambiente `JAVA_HOME`.
* **Confirme:** `java -version` deve mostrar "openjdk version 17".

### 2. Maven
* **Verifique:** `mvn -version`
* **Instale:** Baixe em [maven.apache.org](https://maven.apache.org/download.cgi). Extraia a pasta e adicione a pasta `bin` ao PATH do Windows.
* **Confirme:** `mvn -version` deve retornar a versão do Maven.

### 3. Node.js 18
* **Verifique:** `node -v` e `npm -v`
* **Instale:** Baixe a versão **18.x LTS** em [nodejs.org](https://nodejs.org). O instalador já configura o PATH.

### 4. Angular CLI
* **Comando:** No terminal, rode `npm install -g @angular/cli`.
* **Confirme:** `ng version` (Deve mostrar Angular CLI 17.x).

### 5. Docker Desktop no WSL
* **IMPORTANTE:** NÃO instale Docker dentro do WSL via apt-get. Use o **Docker Desktop** integrado ao WSL2.
* **Passos:**
  1. No PowerShell, garanta que seu WSL é versão 2: `wsl -l -v`. Se for versão 1, rode: `wsl --set-version Ubuntu 2` (troque Ubuntu pelo nome da sua distro).
  2. Baixe o Docker Desktop em [docker.com](https://www.docker.com/products/docker-desktop).
  3. Na instalação, marque **"Use WSL 2 instead of Hyper-V"**.
  4. Após instalar e abrir, vá em Settings → Resources → WSL Integration → Habilite a chave da sua distro (ex: Ubuntu).
  5. Apply & Restart.
* **Confirme no WSL:** `docker --version`, `docker-compose --version`, e teste com `docker run hello-world`.

### 6. IDE e Ferramentas REST
* **IDE:** [IntelliJ IDEA Community](https://jetbrains.com/idea/download) (Recomendado).
* **API Client:** [Postman](https://www.postman.com/downloads/) ou [Insomnia](https://insomnia.rest/download).
* **Git:** Baixe em [git-scm.com](https://git-scm.com/download/win). Configure com:
  `git config --global user.name "Seu Nome"` e `git config --global user.email "seu@email.com"`

### 7. Gerar projeto Spring Boot (Backend)
1. Vá em [start.spring.io](https://start.spring.io).
2. Configure: **Maven**, **Java**, Spring Boot **3.2.x**, Packaging **Jar**, Java **17**.
3. Metadata: Group: `com.seunome`, Artifact/Name: `riskflow-api`.
4. Dependências: **Spring Web**, **Spring Data JPA**, **PostgreSQL Driver**, **Spring Data Redis**, **Spring Security**, **Validation**, **Lombok**, **Flyway**, **Spring Boot DevTools**.
5. Clique em **Generate**, extraia o ZIP na sua pasta de projetos.

### 8. Gerar projeto Angular (Frontend)
No terminal:
```bash
ng new riskflow-web --routing --style=css
```
Diga **No** para SSR (Server-Side Rendering). Entre na pasta `cd riskflow-web` e rode `ng serve`. Acesse `http://localhost:4200`.

### 9. Subir PostgreSQL e Redis com Docker
Crie o arquivo `docker-compose.yml` na raiz do projeto (fora do backend e frontend, ou na raiz do backend):
```yaml
version: '3.8'
services:
  postgres:
    image: postgres:16
    container_name: riskflow-postgres
    environment:
      POSTGRES_DB: riskflow
      POSTGRES_USER: riskflow
      POSTGRES_PASSWORD: riskflow123
    ports:
      - "5432:5432"
    volumes:
      - postgres_data:/var/lib/postgresql/data

  redis:
    image: redis:7
    container_name: riskflow-redis
    ports:
      - "6379:6379"

volumes:
  postgres_data:
```
Rode: `docker-compose up -d`. Verifique com `docker ps`.

### 10. Conectar Spring Boot
No `src/main/resources/application.properties` do seu backend:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/riskflow
spring.datasource.username=riskflow
spring.datasource.password=riskflow123
spring.data.redis.host=localhost
spring.data.redis.port=6379
```
