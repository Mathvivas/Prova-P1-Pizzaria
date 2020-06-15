package br.maua.Classes;

import br.maua.Enumeracoes.Estado;
import br.maua.Enumeracoes.FormaDePagamento;

public class Pedido {
    private String ID;
    private String descricao;
    private double valor;
    private FormaDePagamento formaDePagamento;
    private Estado estado;

    // Construtor
    public Pedido(String ID, String descricao, double valor, FormaDePagamento formaDePagamento, Estado estado) {
        this.ID = ID;
        this.descricao = descricao;
        this.valor = valor;
        this.formaDePagamento = formaDePagamento;
        this.estado = estado;
    }
}
