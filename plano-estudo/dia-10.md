# Dia 10 — API REST e DTOs: Falando com o Mundo

🎯 **Objetivo do dia**: Criar portas de entrada HTTP para o seu sistema e entender que Entidade de banco NÃO sai na API.

📖 **Conceito**
* **REST:** Padrão arquitetural (GET buscar, POST criar, HTTP Status 200 OK, 201 Created).
* **DTO (Data Transfer Object):** Objeto que carrega dados do cliente para a API, e da API pro cliente. **Nunca devolva a `@Entity`**.
* **Validação:** `@Valid`, `@NotNull`, etc., barram dados sujos na porta.

🏦 **No RiskFlow**
Criar os endpoints para receber transações do frontend Angular.

✍️ **Escreva do zero**
1. Crie `OperacaoRequestDTO` (usando `record`) com anotações de validação (`@NotNull`, `@Positive`).
2. Crie `OperacaoResponseDTO`.
3. Crie `OperacaoController` anotado com `@RestController` e `@RequestMapping("/api/operacoes")`.
4. Crie o método `POST` recebendo `@RequestBody @Valid OperacaoRequestDTO`. O Controller mapeia DTO -> Entidade, chama o Service, pega o retorno e mapeia Entidade -> DTO de volta.

⚖️ **Compare e justifique**
O que acontece se amanhã adicionarmos a coluna "senha" na entidade `Conta` e estivermos devolvendo a própria Entidade no GET? Por que o DTO salva nossa vida nesse caso?

🎤 **Entrevista Check**
"Por que usar DTOs em vez de expor entidades JPA diretamente na API?"

🚫 **Anti-padrão do dia**
Retornar HTTP `200 OK` quando você criou um recurso. O correto é `201 Created`.

📋 **Checklist**
* [ ] Entende verbos HTTP e status adequados.
* [ ] Construiu o muro intransponível entre Controller e Service através do DTO.
* [ ] Usou Validation.

🔗 **Próximo passo**: Proteger essa API para que ninguém faça saques sem login.
