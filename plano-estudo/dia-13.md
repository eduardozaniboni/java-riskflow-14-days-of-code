# Dia 13 — Mensageria com Redis: Da Sincronia para Eventos

🎯 **Objetivo do dia**: Transformar a arquitetura síncrona tradicional em Orientada a Eventos para escala enterprise.

📖 **Conceito**
* **Síncrono:** O cliente espera o processamento total antes da resposta.
* **Assíncrono (Event-Driven):** O cliente envia, o servidor anota na fila e devolve "Recebido, aguarde". Um worker oculto processa depois.
* **Mensageria:** Fila (Queue), Producer (Quem envia pra fila), Consumer (Worker que consome a fila).

🏦 **No RiskFlow**
Quando o Angular envia a Operação, o endpoint `POST` agora não chama o `OperacaoService.processar()`. Ele envia os dados para uma fila no Redis, muda o status para PENDENTE e retorna imediatamente. Um Worker em background lê a fila e executa as regras pesadas de risco.

✍️ **Escreva do zero**
1. Configure `RedisTemplate` no backend.
2. Crie `OperacaoProducer` que recebe os dados da operação e envia para a chave da fila do Redis (`riskflow:fila:operacoes`).
3. Modifique o Controller para chamar o Producer. Retorne HTTP 202 Accepted.
4. Crie `OperacaoConsumer` (pode usar a anotação `@Scheduled(fixedDelay = 1000)` simulando um worker consumindo mensagens do Redis (`rightPop`)).
5. O Consumer, ao pegar a mensagem, chama a `CalculadoraDeRisco`, muda o status no DB para APROVADA ou NEGADA.

⚖️ **Compare e justifique**
Por que usar mensageria? O que acontece se o serviço do "Motor de Risco" cair numa arquitetura síncrona? E na baseada em filas? (R: Síncrono a requisição quebra e o cliente perde dinheiro. Na fila, acumula até o worker voltar).

🎤 **Entrevista Check**
"Por que usar mensageria em vez de processar tudo de forma síncrona? O que acontece se a fila crescer demais?"

🚫 **Anti-padrão do dia**
Não implementar DLQ (Dead Letter Queue) — uma fila paralela para jogar mensagens "venenosas" que fazem o worker quebrar sem parar (apenas conceitual por agora).

📋 **Checklist**
* [ ] Redis integrado no Spring.
* [ ] Publicador envia mensagem.
* [ ] Consumidor consome assincronamente.
* [ ] Arquitetura Event-Driven compreendida.

🔗 **Próximo passo**: Empacotar tudo isso para rodar como microsserviços.
