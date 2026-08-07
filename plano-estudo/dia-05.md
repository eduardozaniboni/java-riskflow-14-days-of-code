# Dia 05 — Coleções: O Vocabulário de Dados em Volume

🎯 **Objetivo do dia**: Escolher a estrutura de dados correta para cada situação (List vs Set vs Map).

📖 **Conceito**
* **List (ArrayList / LinkedList):** Coleção ordenada que aceita repetidos. ArrayList (mais rápido para ler/acessar índice O(1)). LinkedList (mais rápido para inserir/remover no meio, raramente usado na prática).
* **Set (HashSet):** Não aceita itens duplicados.
* **Map (HashMap):** Mapeia chave para um valor (`K, V`). A chave deve ser única.
* Iteração segura: modificar uma coleção no meio de um `for` clássico gera `ConcurrentModificationException`. Usa-se `Iterator`.

🏦 **No RiskFlow**
Precisamos armazenar histórico de operações (Lista), garantir que alertas sobre uma operação não fiquem duplicados (Set), e buscar contas rapidamente por número (Map).

✍️ **Escreva do zero**
1. Crie uma lista com 10 `Operacao` (algumas repetidas e com datas misturadas).
2. Crie um `Map<String, List<Operacao>>` para agrupar operações pela string da data (ex: "2023-10-01").
3. Implemente manualmente a lógica para agrupar e iterar pelo Map mostrando a data e o volume financeiro total daquele dia.
*Ainda não use Stream API.*

⚖️ **Compare e justifique**
`HashMap` vs `TreeMap`. No RiskFlow, por que `HashMap` é suficiente para buscar uma conta pelo número dela (ex: "12345-6")?

🎤 **Entrevista Check**
"Qual a diferença entre ArrayList e LinkedList? Em que cenário LinkedList é melhor?"

🚫 **Anti-padrão do dia**
Usar uma `List` quando você precisa realizar milhões de buscas `.contains()`. `HashSet` faz isso instantaneamente O(1).

📋 **Checklist**
* [ ] Sabe a diferença entre Set, List e Map.
* [ ] Popula e itera sobre um Map.
* [ ] Entende complexidade de tempo básica (O(1) vs O(n)).

🔗 **Próximo passo**: Fazer a iteração de hoje em apenas duas linhas com Stream API.
