package br.com.zup.edu.livrariaclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(
        name = "livrariaClient",
        url = "http://localhost:8080/oauth2-resourceserver-livraria/"
)
public interface LivrariaClient {

    @GetMapping("/api/livros/{id}")
    public Optional<DetalheLivroResponse> detalhaLivro(@PathVariable Long id);

    @GetMapping("/api/autores/{id}")
    public Optional<DetalheAutorResponse> detalhaAutor(@PathVariable Long id);

}
