package br.maua.Classes;

import br.maua.Enumeracoes.Estado;
import br.maua.Enumeracoes.FormaDePagamento;

/**
 * Classe que representa o pedido do cliente da Pizzaria.
 *
 * @author Matheus Lopes Vivas - mathvivas@hotmail.com
 * @since 16/06/2020
 * @version 1.0
 */
public class Pedido {
    private String ID;
    private String tipoPizza;
    private double valor;
    private FormaDePagamento formaDePagamento;
    private Estado estado;

    /**
     * @param ID Gerado randomicamente para cada novo pedido.
     * @param tipoPizza Tipo da Pizza pedida.
     * @param valor Preço total da Pizza.
     * @param formaDePagamento Enumeração que define o método de pagamento do cliente.
     * @param estado Enumeração que define o estado em que a Pizza se encontra, a partir do pedido.
     */
    // Construtor
    public Pedido(String ID, String tipoPizza, double valor, FormaDePagamento formaDePagamento, Estado estado) {
        this.ID = ID;
        this.tipoPizza = tipoPizza;
        this.valor = valor;
        this.formaDePagamento = formaDePagamento;
        this.estado = estado;
    }

    /**
     * @return Método que retorna o objeto "Pedido" em forma de String.
     */
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

    /**
     * @return Getter para o ID do pedido.
     */
    public String getID() {
        return ID;
    }

    /**
     * @return Getter para o tipo de pizza.
     */
    public String getTipoPizza() {
        return tipoPizza;
    }

    /**
     * @return Getter para o preço da pizza.
     */
    public double getValor() {
        return valor;
    }

    /**
     * @return Getter para a Enumeração que define a forma de pagamento.
     */
    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    /**
     * @return Getter para a Enumeração que define o estado da pizza.
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Método Setter para a escolha de um novo estado para a pizza.
     *
     * @param estado Enumeração.
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
