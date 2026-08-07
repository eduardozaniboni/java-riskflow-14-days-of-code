# Dia 11 — Spring Security e JWT: Protegendo o RiskFlow

🎯 **Objetivo do dia**: Implementar controle de acesso Stateless adequado para APIs e Fintechs.

📖 **Conceito**
* **JWT (JSON Web Token):** Token assinado, dividido em Header, Payload (onde ficam os dados/claims) e Signature. É Stateless (não fica salvo na memória do servidor).
* **BCrypt:** Hasheamento seguro com Salt automático. Nunca salva senha em plain text.
* **Filtros de Segurança:** O Spring Security intercepta as requisições antes de chegarem ao seu Controller.

🏦 **No RiskFlow**
Garantir que endpoints de `/operacoes` exijam o token JWT de um operador válido logado.

✍️ **Escreva do zero**
1. Crie uma classe `Usuario` (`@Entity`) com senha e `Role` (enum).
2. Configure o `SecurityFilterChain` usando um `@Bean`, definindo `permitAll` para `/auth/login` e `authenticated` para `/api/**`.
3. Crie o `JwtUtil` com métodos `gerarToken()` e `validarToken()` (use a biblioteca `jjwt`).
4. Crie um filtro `JwtAuthenticationFilter` que extrai o token do header `Authorization: Bearer <token>`, valida, e seta o usuário no contexto do Spring (`SecurityContextHolder`).
5. Teste no Postman: acesse `/api/operacoes` sem token e veja o 401 Unauthorized.

⚖️ **Compare e justifique**
JWT vs Sessão server-side. Se você tem 10 instâncias da sua API rodando por trás de um balanceador, por que Sessão tradicional causa problema e JWT brilha? (R: Stateless).

🎤 **Entrevista Check**
"Como você protege senhas em uma aplicação Java? Explique a estrutura do JWT e por que é stateless."

🚫 **Anti-padrão do dia**
Guardar o ID do banco ou dados sensíveis abertos dentro do JWT (ele é decodificável em base64 por qualquer um, apenas a assinatura é protegida).

📋 **Checklist**
* [ ] Filter Chain implementado sem uso de código deprecado.
* [ ] JWT Gerado, assinado e validado.
* [ ] Endpoints protegidos no Postman.

🔗 **Próximo passo**: É hora de sair do terminal e construir a interface visual com Angular.
