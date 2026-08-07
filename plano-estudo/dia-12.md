# Dia 12 — Angular: Componentes, Serviços e Consumo de API

🎯 **Objetivo do dia**: Consumir sua API segura no frontend usando TypeScript, Componentes Standalone e Observables.

📖 **Conceito**
* **Componente:** O bloco visual (HTML + CSS + TypeScript).
* **Serviço:** Regras de negócio do frontend e chamadas HTTP.
* **Observable:** Fluxos de dados assíncronos (RxJS). O Angular os prefere a Promises.
* **Reactive Forms:** Formulários escaláveis definidos programaticamente no TypeScript.

🏦 **No RiskFlow**
O Dashboard do operador. Uma tela de login, um dashboard visual e um formulário para cadastrar a `Operacao`.

✍️ **Escreva do zero (no projeto Angular do Dia 0)**
1. Crie as interfaces TypeScript `OperacaoRequest` e `OperacaoResponse` idênticas aos DTOs do backend.
2. Crie o `OperacaoService` injetando `HttpClient` e fazendo `this.http.post()` e `.get()`. (Lembre de passar o JWT no Header).
3. Crie `NovaOperacaoComponent` usando `FormGroup` e `FormControl` para capturar os dados, validar no front e chamar o service no `onSubmit()`.
4. No template, exiba a lista usando `@for` (sintaxe nova do Angular 17) ou `*ngFor`.

⚖️ **Compare e justifique**
Template-driven forms vs Reactive Forms no Angular. Por que sistemas grandes usam Reactive Forms? (R: controle explícito de validações, testabilidade sem depender do DOM).

🎤 **Entrevista Check**
"O que é um Observable? Por que Angular usa isso extensivamente no HttpClient?"

🚫 **Anti-padrão do dia**
Não fazer o `unsubscribe()` de Observables contínuos (causa Memory Leak no navegador). *No caso do HttpClient ele completa sozinho, mas é bom saber.*

📋 **Checklist**
* [ ] Conexão Front -> Back completa.
* [ ] Reactive Form criado com validação.
* [ ] Entendimento básico de Observable.

🔗 **Próximo passo**: Sua API está síncrona. Em um banco real, isso não escala. Vamos enfileirar isso.
