# Dia 06 — Stream API, Lambda e Optional: Java Moderno

🎯 **Objetivo do dia**: Substituir loops e `if/null` complexos por processamento funcional e seguro.

📖 **Conceito**
* **Lambda:** Função anônima. Sintaxe: `(parametros) -> expressao`.
* **Stream:** Pipeline encadeado de processamento de dados (`filter`, `map`, `reduce`, `collect`).
* **Optional:** Uma "caixa" que pode ou não conter um valor. Impede `NullPointerException` explícito obrigando você a tratar a ausência de valor.

🏦 **No RiskFlow**
Temos relatórios e buscas. Encontrar a maior transação do dia. Filtrar transações de alto risco.

✍️ **Escreva do zero**
1. Recrie a lista de `Operacao` do Dia 05.
2. Use a Stream API (`.stream()`) para:
   - Encontrar a operação de **maior valor** e retornar um `Optional<Operacao>`.
   - Filtrar apenas as operações "ativas" e `.collect(Collectors.toList())`.
3. Usando `Optional`, faça: Se existir a operação de maior valor, imprima. Se não (se a lista estivesse vazia e retornasse `Optional.empty()`), imprima "Nenhuma operação hoje".

⚖️ **Compare e justifique**
Loop tradicional (`for`) vs Stream. Stream é mais legível, mas sempre melhor? Quando Stream é overkill e prejudica performance ou debug?

🎤 **Entrevista Check**
"O que é Optional e por que é melhor que retornar null?"

🚫 **Anti-padrão do dia**
Fazer `Optional.get()` sem antes verificar `isPresent()`. Isso joga a mesma exceção do `null` normal, anulando todo o benefício do Optional.

📋 **Checklist**
* [ ] `filter` e `collect` dominados.
* [ ] Optional usado corretamente (via ifPresent ou orElseThrow).
* [ ] Compreensão da sintaxe Lambda.

🔗 **Próximo passo**: O que fazer quando as regras de negócios são quebradas. Tratamento de erros.
