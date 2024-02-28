package estudos.java.testesRabbitMQ2.testesRabbitMQ2.consumer;

import estudos.java.testesRabbitMQ2.testesRabbitMQ2.entity.Pagamento;
import estudos.java.testesRabbitMQ2.testesRabbitMQ2.producer.PagamentoErroProdutor;
import estudos.java.testesRabbitMQ2.testesRabbitMQ2.producer.PagamentoSucessoProdutor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PagamentoRequestConsumidor {

    @Autowired
    private Pagamento pagamento;
    @Autowired
    private PagamentoErroProdutor erroProdutor;

    @Autowired
    private PagamentoSucessoProdutor sucessoProdutor;

    @RabbitListener(queues = {"pagamento-request-queue"})
    public void receberMensagem(@Payload Message message) {
        System.out.println(message);
        if (new Random().nextBoolean()) {
            sucessoProdutor.gerarResposta("   Mensagem de sucesso Pagamengo   "
                    + message);
        } else {
            erroProdutor.gerarResposta("   Mensagem de erro Pagamento   "
                    + message);
        }
    }

}

//@Payload Message message
//new Random().nextBoolean()
//System.out.println(message);