package br.maua.Classes;

/**
 * Classe concreta que representa o funcionário (usuário).
 *
 * @author Matheus Lopes Vivas - mathvivas@hotmail.com
 * @since 16/06/2020
 * @version 1.0
 */

public class Usuario {
    private String nome;
    private String email;
    private String senha;

    /**
     * @param nome Nome do funcionário da Pizzaria.
     * @param email Email do funcionário da Pizzaria.
     * @param senha Senha do funcionário da Pizzaria.
     */

    // Construtor da Classe
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    /**
     * @return Getter para a senha do funcionário (usuário).
     */

    public String getSenha() {
        return senha;
    }

}
