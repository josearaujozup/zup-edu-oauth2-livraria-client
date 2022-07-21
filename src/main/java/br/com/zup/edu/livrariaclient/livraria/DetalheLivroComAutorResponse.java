package br.com.zup.edu.livrariaclient.livraria;

import br.com.zup.edu.livrariaclient.client.DetalheAutorResponse;
import br.com.zup.edu.livrariaclient.client.DetalheLivroResponse;

import java.time.LocalDate;

public class DetalheLivroComAutorResponse {

    private Long id;
    private String nome;
    private String descricao;
    private String isbn;
    private LocalDate publicadoEm;
    private DetalheAutorResponse autor;

    public DetalheLivroComAutorResponse(DetalheLivroResponse livro, DetalheAutorResponse autor) {
        this.id = livro.getId();
        this.nome = livro.getNome();
        this.descricao = livro.getDescricao();
        this.isbn = livro.getIsbn();
        this.publicadoEm = livro.getPublicadoEm();
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDate getPublicadoEm() {
        return publicadoEm;
    }

    public DetalheAutorResponse getAutor() {
        return autor;
    }
}
