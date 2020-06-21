package br.maua.Classes;

import br.maua.Enumeracoes.Estado;
import br.maua.Enumeracoes.FormaDePagamento;

public class Pedido {
    private String ID;
    private String tipoPizza;
    private double valor;
    private FormaDePagamento formaDePagamento;
    private Estado estado;

    // Construtor
    public Pedido(String ID, String tipoPizza, double valor, FormaDePagamento formaDePagamento, Estado estado) {
        this.ID = ID;
        this.tipoPizza = tipoPizza;
        this.valor = valor;
        this.formaDePagamento = formaDePagamento;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "\nPedido {" +
                "ID: " + getID() +
                " | Tipo da Pizza: " + getTipoPizza() +
                " | Valor: " + getValor() +
                " | Pagamento: " + getFormaDePagamento() +
                " | Estado: " + getEstado() +
                "}";
    }

    public String getID() {
        return ID;
    }

    public String getTipoPizza() {
        return tipoPizza;
    }

    public double getValor() {
        return valor;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
