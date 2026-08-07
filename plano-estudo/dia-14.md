# Dia 14 — Docker, Docker Compose e Deploy: Subindo Tudo

🎯 **Objetivo do dia**: Isolar suas aplicações, rodar o ambiente com um comando e entender a cultura DevOps básica.

📖 **Conceito**
* **Dockerfile:** A receita de bolo para criar a imagem da sua aplicação.
* **Multi-stage build:** No Java, primeiro você compila o Maven, depois copia o `.jar` para uma imagem final levinha apenas com o JRE.
* **Docker Compose:** Orquestra múltiplos containers (Banco, Redis, Backend, Frontend) definindo ordem de inicialização e redes internas.

🏦 **No RiskFlow**
Precisamos de um `docker-compose.yml` mestre que suba: `postgres`, `redis`, a `riskflow-api` e o `riskflow-web`. Tudo interconectado.

✍️ **Escreva do zero**
1. Crie o `Dockerfile` na raiz do backend (Multi-stage usando Maven + JDK 17, e depois Eclipse Temurin JRE).
2. Crie o `Dockerfile` na raiz do Angular (Multi-stage com Node para o `ng build`, copiando os arquivos para imagem do `nginx`).
3. Ajuste seu `docker-compose.yml` original para adicionar os serviços `api` e `web`.
4. Defina o `depends_on` (A API só sobe se o PostgreSQL estiver sadio usando `healthcheck`).
5. Substitua as credenciais e IPs do seu `application.properties` por variáveis de ambiente extraídas pelo Docker (`${SPRING_DATASOURCE_URL}`).
6. Destrua os containers antigos e rode `docker-compose up --build`.

⚖️ **Compare e justifique**
Configurar tudo manualmente na máquina de um colega vs clonar o repositório e rodar `docker-compose up`. Por que containers padronizaram o deploy no mercado?

🎤 **Entrevista Check**
"Como você containeriza uma aplicação Spring Boot? Como garante que a API não quebre tentando acessar um banco que ainda está iniciando?"

🚫 **Anti-padrão do dia**
Hardcodar credenciais de banco de dados e secrets de JWT no código ou no Dockerfile (devem vir do ambiente local via `.env`).

📋 **Checklist**
* [ ] Backend containerizado em Multi-stage.
* [ ] Frontend servido em Nginx.
* [ ] Comunicação entre containers na rede interna.

🎉 **FIM DO CICLO 1!** Respire. Não olhe o código antigo amanhã. Comece o Ciclo 2 e veja a fluência acontecer.
