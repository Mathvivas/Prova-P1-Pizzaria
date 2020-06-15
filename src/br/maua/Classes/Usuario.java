package br.maua.Classes;

public class Usuario {
    private String nome;
    private String email;
    private String senha;

    // Construtor da Classe
    public void Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

}
