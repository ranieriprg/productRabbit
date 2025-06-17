package assisdev.productRabbit.controller;
import assisdev.productRabbit.messaging.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensagem")
public class MessageController {


    @Autowired
    private MessageProducer messageProducer;

    @PostMapping("/enviar")
    public String enviarMensagem(@RequestBody String mensagem) {
        messageProducer.sendMessage(mensagem);
        return "Mensagem enviada para a fila!";
    }
}
