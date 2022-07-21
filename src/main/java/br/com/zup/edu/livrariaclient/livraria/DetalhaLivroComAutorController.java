package br.com.zup.edu.livrariaclient.livraria;

import br.com.zup.edu.livrariaclient.client.DetalheAutorResponse;
import br.com.zup.edu.livrariaclient.client.DetalheLivroResponse;
import br.com.zup.edu.livrariaclient.client.LivrariaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
public class DetalhaLivroComAutorController {

    @Autowired
    private LivrariaClient client;

    @GetMapping("/api/livros/{id}")
    public ResponseEntity<?> detalhaLivroComAutor(@PathVariable Long id){

        DetalheLivroResponse livro = client.detalhaLivro(id).orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Não existe livro com esse id"));

        DetalheAutorResponse autor = client.detalhaAutor(livro.getAutorId()).orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Não existe autor com esse id"));

        DetalheLivroComAutorResponse livroComAutor = new DetalheLivroComAutorResponse(livro, autor);

        return ResponseEntity.ok(livroComAutor);
    }

}
