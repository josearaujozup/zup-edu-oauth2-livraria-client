package br.com.zup.edu.livrariaclient.client;

import java.time.LocalDate;

public class DetalheLivroResponse {

    private Long id;
    private String nome;
    private String descricao;
    private String isbn;
    private LocalDate publicadoEm;
    private Long autorId;

    public DetalheLivroResponse(Long id, String nome, String descricao, String isbn, LocalDate publicadoEm, Long autorId) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.isbn = isbn;
        this.publicadoEm = publicadoEm;
        this.autorId = autorId;
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

    public Long getAutorId() {
        return autorId;
    }
}
