package program3.ch11_ex2.proxy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import program3.ch11_ex2.models.Payment;
import reactor.core.publisher.Mono;

@Component
public class PaymentProxy {
    private final WebClient webClient;

    @Value("${name.service.url}")
    private String url;

    public PaymentProxy(WebClient webClient){
        this.webClient = webClient;
    }

    public Mono<Payment> createPayment(
        String requestId,
        Payment payment
    ){
        return webClient.post()
                        .uri( url +"/payment")
                        .header("requestId", requestId)
                        .body(Mono.just(payment), Payment.class)
                        .retrieve()
                        .bodyToMono(Payment.class);
    }
}
