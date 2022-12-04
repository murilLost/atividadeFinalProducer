# atividadeFinalProducer  
Projeto de Rabbit producer para atividade de Integration and Development Tools

Desenvolvido por:  
Murillo Lopes Fernandes  
Eduardo Freire Cotrim  
Ana Carolina Alves Cola  
Marco Antonio da Paz Couzin  

Para a execução do projeto, irei listar abaixo o passo a passo das configurações necessárias.  

01 - Criar uma conta no CloudAMQP, link https://customer.cloudamqp.com/.  
02 - Criar uma instância de RabbitMQ do CloudAMQP, pode ser qualquer nome e em qualquer país, de preferência no Brasil, pela baixa latência.  
03 - Acessar as configurações da instância criada, ATENÇÃO, são as configurações da instância, não é o RabbitMQ Manager.  
04 - Copiar a URL configurada na instância, por exemplo: amqps://teste:jdq08u41u89cb@jackal.rmq.cloudamqp.com/teste  
05 - Baixar o projeto aqui do GIT, pode clonar ou baixar zipado.  
06 - Possuir o Intellij IDE para configurar o projeto e roda-lo.  
07 - Abrir o projeto no Intellij IDE, e builda-lo com Gradle.  
08 - Utilizei o JDK 17 no projeto, sugiro utilizar o mesmo.  
09 - Ir no arquivo application.yml, presente no caminho: src/main/resources  
10 - colar a URL configurada na Instância, no campo addresses, substituindo o texto "<digite-aqui-a-URL>" pela URL copiada.  
11 - Pronto, o projeto está pronto para ser executado.  
