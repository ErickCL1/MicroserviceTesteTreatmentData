package estudos.java.testesRabbitMQ2.testesRabbitMQ2.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoErroProdutor {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void gerarResposta(String mensagem){
        amqpTemplate.convertAndSend(
                "pagamento-response-erro-exchange",
                "pagamento-response-erro-routing-key",
                mensagem);
    }
}
