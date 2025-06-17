package assisdev.productRabbit.messaging.producer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String mensagem) {
        rabbitTemplate.convertAndSend("minha-fila", mensagem);
        System.out.println("Mensagem enviada: " + mensagem);
    }
}
