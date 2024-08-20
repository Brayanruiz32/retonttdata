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

    public List<Usuario> obtenerDatos(String base) {
            Mono<Resultado> response = this.webClient.get()
                    .uri(base)
                    .retrieve()
                    .bodyToMono(Resultado.class);
            return response.block().getResults();
    }

}
