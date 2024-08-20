package com.reto.retonttdata.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.reto.retonttdata.dto.Resultado;
import com.reto.retonttdata.entities.Usuario;
import reactor.core.publisher.Mono;

@Service
public class ApiService {

    private final WebClient webClient;


    public ApiService(WebClient.Builder webClientBuilder) {
            this.webClient = webClientBuilder.baseUrl("https://randomuser.me").build();
    }

    public List<Usuario> getDataFromApi(String endpoint) {
            // Hacemos la petición GET y esperamos la respuesta como String
            Mono<Resultado> response = this.webClient.get()
                    .uri(endpoint)
                    .retrieve()
                    .bodyToMono(Resultado.class);

            // Bloqueamos hasta obtener la respuesta (para el caso de uso síncrono)
            return response.block().getResults();
    }

}
