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
