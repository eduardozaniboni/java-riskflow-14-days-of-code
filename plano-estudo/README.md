# 🚀 Fluência em Java: Do Leitor ao Escritor

Você lê código Java e entende o que faz (como quem lê inglês e entende a frase), mas **não consegue escrever do zero** e **não sabe justificar decisões arquiteturais**. Você tem trabalhado com manutenção e usa conceitos por "memória muscular".

Este plano não é sobre "terminar um projeto". É sobre ensinar você a **pensar em Java**.

O projeto laboratório será o **RiskFlow**: um sistema de rastreamento e validação de operações financeiras (backoffice bancário). Ele começará simples e evoluirá para uma **arquitetura orientada a eventos** com mensageria (Redis) e interface em Angular, simulando o ambiente real de fintechs e bancos.

## 🛠️ Tecnologias e Versões

| Tecnologia | Versão | Por que esta versão |
|---|---|---|
| **Java** | **17 (LTS)** | Versão estável, suporte longo, usada em 90% das empresas. Spring Boot 3 exige Java 17+. |
| **Spring Boot** | **3.2.x** | Spring Boot 3 exige Java 17+. Usa Jakarta EE (não javax). |
| **Angular** | **17** | Standalone components (sem NgModule), signals, melhor performance. Documentação madura. |
| **Node.js** | **18.x LTS** | Angular 17+ requer Node 18+. |
| **PostgreSQL** | **16** | Banco relacional padrão do mercado. |
| **Redis** | **7.x** | Fila e cache. Leve, rápido, padrão em fintechs. |
| **Docker** | **Última estável** | Para subir PostgreSQL, Redis e a aplicação. |
| **Maven** | **3.9+** | Gerenciamento de dependências Java (mais comum que Gradle em bancos). |
| **Git** | **Qualquer versão recente** | Controle de versão. |

## 📜 Regras do Plano (Siga rigorosamente)

1. **Regra nº 1 — IA é dicionário, não tradutor automático:** Use IA para explicar conceitos, esclarecer dúvidas e revisar o que VOCÊ escreveu. NUNCA peça para a IA escrever o código do exercício "Escreva do zero".
2. **Regra nº 2 — Um ciclo por vez, mas múltiplos ciclos:** O plano tem 14 dias + setup. Faça o Ciclo 1 para entender. Faça o Ciclo 2 (sem olhar o código do Ciclo 1) para lembrar. Faça o Ciclo 3 para dominar. Fluência vem de repetição, não de velocidade.
3. **Regra nº 3 — Commite o que você escreveu:** Mesmo errado. O histórico mostra evolução.
4. **Regra nº 4 — Não pule dias:** Cada dia é um degrau. Dia 3 sem o 2 é como tentar conjugar verbos sem saber pronomes.
5. **Regra nº 5 — Fale em voz alta:** Ao fazer "Entrevista Check", explique o conceito em voz alta. Se enrolar, revise.

---
## 🗺️ Roadmap de Ciclos

* **Dia 00**: Setup do Ambiente
* **Dias 01 a 07**: FASE 1 — Fundamentos e Arquitetura Core
* **Dias 08 a 14**: FASE 2 — Arquitetura Enterprise: Segurança, Mensageria, Testes e Deploy
