# 📚 Dicionário Técnico para Entrevistas

> Definições afiadas, diretas, com o porquê importar e como aplicamos no RiskFlow. Use isso para treinar a sua fala.

* **JPA, Hibernate, ORM**
  * **Definição:** ORM mapeia tabelas para objetos Java. JPA é a especificação padrão do Java, Hibernate é o motor que executa isso por baixo.
  * **Importa:** É essencial para não escrever queries SQL cruas o tempo todo, aumentando produtividade e portabilidade.
  * **No RiskFlow:** Mapeamos `Conta` para o Postgres sem digitar `CREATE TABLE`, usando as anotações.

* **ACID, Transação, Isolamento**
  * **Definição:** Atomicidade (tudo ou nada), Consistência (regras sempre válidas), Isolamento (ações simultâneas não colidem), Durabilidade (salvo para sempre).
  * **Importa:** Garante que o dinheiro não evapore se a internet cair na metade de uma transferência.
  * **No RiskFlow:** O método de debitar usa `@Transactional` para garantir ACID.

* **SOLID**
  * **Definição:** Single Resp (uma função por classe), Open/Closed (fechado a modificação, aberto a extensão), Liskov Subst (filho substitui pai sem quebrar), Interface Segregation (interfaces pequenas), Dependency Inversion (depender de abstrações).
  * **Importa:** É o padrão ouro de manutenção escalável.
  * **No RiskFlow:** Injetamos a interface `CalculadoraDeRisco` (DIP) e separamos Controllers de Repositories (SRP).

* **IoC, DI, Bean, Container**
  * **Definição:** IoC (o framework controla), DI (injetar classes prontas), Bean (o objeto gerenciado), Container (a "caixa" do Spring que guarda tudo).
  * **Importa:** Reduz acoplamento e facilita absurdamente a criação de testes mockados.
  * **No RiskFlow:** O Spring entrega o Repository pronto no construtor do Service.

* **REST, DTO, JSON, HTTP Status Codes**
  * **Definição:** REST (arquitetura web baseada em recursos), DTO (objeto só para transportar dados), JSON (formato textual padrão de APIs), HTTP Status (200, 201, 400, 404).
  * **Importa:** É o idioma universal de comunicação entre microserviços e frontends.
  * **No RiskFlow:** O Angular posta um JSON (DTO), mapeado para uma Entidade, e recebe `201 Created`.

* **JWT, OAuth2, Stateless**
  * **Definição:** JWT é um token de acesso autossuficiente e Stateless (o servidor não precisa guardar em banco para saber quem é).
  * **Importa:** Permite que APIs escalem horizontalmente sem perder a sessão dos usuários.
  * **No RiskFlow:** O operador envia o JWT no header `Authorization` a cada requisição restrita.

* **Thread, Concorrência, Paralelismo, Deadlock**
  * **Definição:** Thread (linha de execução), Concorrência (disputa de recursos), Paralelismo (executar ao mesmo tempo em núcleos físicos), Deadlock (travamento mutuo de processos).
  * **Importa:** Em sistemas de alta carga financeira, ignorar threads resulta em dinheiro duplo sacado e travamentos no banco.
  * **No RiskFlow:** Diferentes requests na API acessam contas simultaneamente, precisamos proteger com transações e isolamento adequado.

* **Lazy Loading, Eager Loading, N+1**
  * **Definição:** Lazy (busca só ao acessar), Eager (busca tudo junto), N+1 (erro gravíssimo de perfomance ao buscar filhos de entidades em um loop sem JOIN FETCH).
  * **Importa:** Define se seu banco de dados suporta 10 requisições ou 10 mil requisições por segundo.
  * **No RiskFlow:** Todas as relações de `Operacao` com `Conta` são FetchType.LAZY.

* **Herança, Composição, Polimorfismo, Encapsulamento**
  * **Definição:** Herança (É UM), Composição (TEM UM), Polimorfismo (assumir múltiplas formas através de contratos genéricos), Encapsulamento (blindar estado interno).
  * **Importa:** Sem esses 4 pilares enraizados, é impossível programar em Java moderno de forma sustentável.
  * **No RiskFlow:** O saldo só muda por regras internas (Encapsulamento); preferimos delegar validação (Composição) a herdar classes gigantes (Herança).

* **Interface, Classe Abstrata, Record, Enum**
  * **Definição:** Interface (contrato puro), Classe Abstrata (contrato com lógica parcial, base), Record (dado imutável), Enum (lista fixa).
  * **Importa:** Saber quando usar qual demonstra maturidade e diminui chance de bugs arquiteturais.
  * **No RiskFlow:** RequestDTOs são Records. Regras são Interfaces. NiveisRisco são Enums.

* **Stream, Lambda, Optional**
  * **Definição:** Stream (pipeline de dados funcional), Lambda (função inline anônima), Optional (empacotador para evitar NullPointerException).
  * **Importa:** O Java moderno exige escrita funcional para manipulação de coleções, é código legível, limpo e à prova de nulos.
  * **No RiskFlow:** Filtramos logs, agrupamos alertas e lidamos com buscar contas no BD usando Optional.

* **Maven/Gradle, Dependência, Artifact**
  * **Definição:** Ferramentas de build que gerenciam dependências da internet, compilam seu código e geram o pacote final (jar/war).
  * **Importa:** Você nunca deve baixar "arquivos .jar" soltos pela internet e colocar na pasta; gerenciadores lidam com árvores complexas.
  * **No RiskFlow:** O `pom.xml` controla o JPA, PostgreSQL, Security, JWT, Lombok, etc.

* **Docker, Container, Imagem, Docker Compose**
  * **Definição:** Docker isola ambientes, Imagem é a receita de arquivos imutável, Container é a aplicação rodando, Compose orquestra vários containers juntos.
  * **Importa:** Elimina o clássico "na minha máquina funciona", garantindo que produção e local sejam idênticos.
  * **No RiskFlow:** Com um comando subimos BD, Cache, Backend e Frontend simultâneos.

* **DDD, Aggregate, Entity, Value Object, Repository**
  * **Definição:** DDD organiza por negócio. Aggregate (conjunto atômico), Entity (tem identidade ID), Value Object (identificado pelos seus valores), Repository (camada de persistência).
  * **Importa:** O DDD dita se a aplicação de hoje será o monolito indestrutível de amanhã ou não.
  * **No RiskFlow:** Pastas são separadas em Domínio, Aplicação e Infraestrutura.

* **Mensageria, Fila, Tópico, Broker, Producer, Consumer, Worker**
  * **Definição:** Mensageria desacopla envios. Fila (quem pegar primeiro, roda), Tópico (todos os inscritos recebem), Broker (carteiro), Producer (manda), Consumer (Worker, quem processa).
  * **Importa:** Onde a aplicação real se separa da de faculdade: Fintechs não suportam lentidão na API do cliente esperando motor síncrono.
  * **No RiskFlow:** Operações são postadas na API, caem no Redis, a API devolve 202 Accepted. Um Worker consome, julga e gera o alerta.

* **Redis, Pub/Sub, Redis Stream, Cache**
  * **Definição:** Redis é um banco de dados Em-Memória ultrarrápido (Chave-Valor) usado tanto como Cache (guardar respostas prontas) quanto Broker simples.
  * **Importa:** Escala a velocidade da aplicação e reduz brutalmente o stress no PostgreSQL central.
  * **No RiskFlow:** Usamos como mensageiro rápido e volátil entre as partes.

* **Evento de Domínio, Arquitetura Orientada a Eventos, Desacoplamento**
  * **Definição:** É quando a comunicação se dá por reações: "Algo aconteceu (evento), quem se interessar que trate". Desacoplamento = "Eu não sei quem você é, mas eu lanço a mensagem".
  * **Importa:** É a base para quebrar monolitos enormes em microserviços no futuro de modo que eles não quebrem em cascata.
  * **No RiskFlow:** O motor de Risco reage às operações que caem na fila.

* **Angular, Componente, Serviço, Módulo, Standalone, Observable, Reactive Forms**
  * **Definição:** Framework robusto front. Standalone (novo padrão sem NgModule para injetar dependências fácil), Reactive Forms (form configurado com TypeScript sem sujar HTML).
  * **Importa:** É como o frontend se mantém limpo usando Padrão MVC em vez de um mar de JavaScript "spaghetti".
  * **No RiskFlow:** O Dash é 100% responsivo, com formulário reativo se conectando com o backend.
