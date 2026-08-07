# Dia 08 — Spring Boot: Inversão de Controle e Injeção de Dependência

🎯 **Objetivo do dia**: Entender a mágica do Spring e como o framework gerencia o ciclo de vida dos seus objetos.

📖 **Conceito**
* **Inversão de Controle (IoC):** Em vez de você criar os objetos (`new`), você delega essa responsabilidade ao container do Spring.
* **Injeção de Dependência (DI):** O Spring entrega ("injeta") as instâncias prontas nas suas classes. Prefira injeção via construtor a `@Autowired` em propriedades.
* Estereótipos: `@Component` (genérico), `@Service` (negócio), `@Repository` (banco), `@Controller` (API).

🏦 **No RiskFlow**
Abra o projeto Spring Boot gerado no Dia 0. O `OperacaoService` precisa de uma `CalculadoraDeRisco`. Não faremos `new`. O Spring fará.

✍️ **Escreva do zero**
1. Crie a interface `CalculadoraDeRisco` e a classe `CalculadoraDeRiscoPadrao` anotada com `@Service`.
2. Crie o `OperacaoService` (também `@Service`).
3. Faça a injeção da interface na service APENAS usando o construtor (sem `@Autowired` explícito se usar Spring moderno).
4. No arquivo principal (`@SpringBootApplication`), injete e rode o Service para ver funcionando.

⚖️ **Compare e justifique**
Fazer `new CalculadoraDeRiscoPadrao()` dentro do Service vs Injetar via construtor. Por que injeção é mil vezes melhor na hora de escrever testes unitários?

🎤 **Entrevista Check**
"O que é Inversão de Controle? E Injeção de Dependência? Qual a relação entre os dois?"

🚫 **Anti-padrão do dia**
Usar `@Autowired` diretamente em campos privados (field injection). Dificulta testes e acopla a classe ao framework.

📋 **Checklist**
* [ ] Entendeu `@Service`.
* [ ] Implementou DI via Construtor.
* [ ] Evitou `new` manual.

🔗 **Próximo passo**: Persistir esses objetos no banco de dados usando JPA.
