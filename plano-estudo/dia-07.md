# Dia 07 — Tratamento de Erros e Exceções: Falhar com Elegância

🎯 **Objetivo do dia**: Capturar falhas sistêmicas e lançar falhas de negócio de propósito.

📖 **Conceito**
* **Checked Exceptions:** O compilador te OBRIGA a tratar (`try-catch` ou `throws`). Ex: `IOException`.
* **Unchecked Exceptions (RuntimeException):** O compilador não obriga. Geralmente falhas de lógica (ex: `NullPointerException`) ou regras de negócio.
* `try-with-resources`: Fecha arquivos, conexões e recursos automaticamente.

🏦 **No RiskFlow**
O motor de regras não retorna apenas `false` se a conta estiver bloqueada. Ele lança uma exceção com contexto detalhado para ser logado e auditado.

✍️ **Escreva do zero**
1. Crie a exceção customizada `OperacaoException` que herda de `RuntimeException`.
2. Crie duas filhas: `SaldoInsuficienteException` e `ContaBloqueadaException`.
3. No seu `ProcessadorDeOperacao`, adicione a lógica para lançar a exceção correta baseado no estado da Conta.
4. Na sua `Main`, coloque a chamada em um `try-catch`, capture `OperacaoException` e imprima apenas a `.getMessage()` de forma amigável.

⚖️ **Compare e justifique**
Retornar `boolean` `false` quando uma validação falha vs Lançar exceção customizada. Por que em sistemas financeiros usar Exceptions (controladas) é preferível?

🎤 **Entrevista Check**
"Qual a diferença entre exceção checked e unchecked? Quando criar uma custom?"

🚫 **Anti-padrão do dia**
Fazer `catch (Exception e) {}` (Engolir a exceção em silêncio). Você mascara o bug.

📋 **Checklist**
* [ ] Criação de RuntimeException customizada.
* [ ] Hierarquia de exceções.
* [ ] Bloco try-catch capturando a classe mãe polimorficamente.

🔗 **Próximo passo**: Amanhã, migramos do Java puro para o Spring Boot!
