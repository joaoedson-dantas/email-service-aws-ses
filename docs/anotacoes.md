# AWS SES (Simple Email Service) 

## Conceito
Tem como principal objetivo enviar e-mails, com esse objetivo, a AWS disponibiliza algumas 
apis e sdks para integrar com a aplicação. 

[USER] ==>  ( [APP] || [MOBILE] ) <- Instalar SDKS  ==> Conexão com o cloud do serviço SES 

> Exemplo: Toda vez que o usuário criei uma nova senha, é enviado para o SES enviar um email para o usuário 

Muito utilizado para envio de e-mail em massa. 
- Marketing
- Escalavel 
- Paga pelo que usa (Pela quantidade de dados e e-mails enviados)

Vantagens:

- Métricas de envio, rejeitados, span e etc...
- Email transacionais (Triggers) -> São os e-mails automáticos 
    - Ex: Toda vez que acontece algo na aplicação um e-mail é enviado (Troca de senha e etc...)
- P/dominio -> Pega um domínio exitente e configura o mesmo dentro da SES e utiliza esse domínio 
- Soft Limit 
    - É o limite de quantidade de envios que poderá ser enviado, mas é um limite soft, onde
    esse limite é definido pela própria AWS, a onde será possível abri um ticket solicitando 
    um aumento ou algo do tipo. 
- Não suporta POP e nem IMAP 


## Prática

