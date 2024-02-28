package estudos.java.testesRabbitMQ2.testesRabbitMQ2.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoSucessoProdutor {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void gerarResposta(String mensagem){
        amqpTemplate.convertAndSend(
                "pagamento-response-sucess-exchange",
                "pagamento-response-sucess-routing-key",
                mensagem);
    }
}
