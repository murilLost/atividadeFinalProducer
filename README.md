# atividadeFinalProducer  
Projeto de Rabbit producer para atividade de Integration and Development Tools

Desenvolvido por:
<ul>
  <li>Murillo Lopes Fernandes</li>
  <li>Eduardo Freire Cotrim</li>
  <li>Ana Carolina Alves Cola</li>
  <li>Marco Antonio da Paz Couzin</li>
</ul>

Para a execução do projeto, irei listar abaixo o passo a passo das configurações necessárias.  

<ol>
  <li>Criar uma conta no CloudAMQP, link https://customer.cloudamqp.com/.</li>
  <li>Criar uma instância de RabbitMQ do CloudAMQP, pode ser qualquer nome e em qualquer país, de preferência no Brasil, pela baixa latência.</li>
  <li>Acessar as configurações da instância criada, ATENÇÃO, são as configurações da instância, não é o RabbitMQ Manager.</li>
  <li>Copiar a URL configurada na instância, por exemplo: amqps://teste:jdq08u41u89cb@jackal.rmq.cloudamqp.com/teste</li>
  <li>Baixar o projeto aqui do GIT, pode clonar ou baixar zipado.</li>
  <li>Possuir o Intellij IDE para configurar o projeto e roda-lo.</li>
  <li>Abrir o projeto no Intellij IDE, e builda-lo com Gradle.</li>
  <li>Utilizei o JDK 17 no projeto, sugiro utilizar o mesmo.</li>
  <li>Ir no arquivo application.yml, presente no caminho: src/main/resources</li>
  <li>colar a URL configurada na Instância, no campo addresses, substituindo o texto "<digite-aqui-a-URL>" pela URL copiada.</li>
  <li>Pronto, o projeto está pronto para ser executado.</li>
</ol>
  
  
Imagens do funcionamento da aplicação:  
![falha-validacao](https://user-images.githubusercontent.com/63795081/205514624-50f5a908-9d9a-4974-9285-b712d99de581.JPG)
![sucesso-postman](https://user-images.githubusercontent.com/63795081/205514638-6aa93304-8129-41e6-9ef0-b264f2363e84.JPG)
![console-Intellij](https://user-images.githubusercontent.com/63795081/205514639-3e8f11e5-5d1a-4b92-a654-9b73ac808e91.JPG)
![queue](https://user-images.githubusercontent.com/63795081/205514641-271c3776-9223-4be0-80e9-c0d131ceb284.JPG)
