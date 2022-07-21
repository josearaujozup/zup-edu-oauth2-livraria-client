package br.com.zup.edu.livrariaclient.client;

public class DetalheAutorResponse {

    private String nome;
    private String email;

    public DetalheAutorResponse(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
