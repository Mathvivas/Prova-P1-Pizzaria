package br.maua.Classes;

import br.maua.Enumeracoes.Estado;
import br.maua.Enumeracoes.FormaDePagamento;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sistema {
    Usuario usuario;
    Scanner scan = new Scanner(System.in);
    private ArrayList<Pedido> pedidos;

    public void run() {
        System.out.println("| ____________ | Pizzaria o Rato que Ri | ____________ |");
        System.out.println("|\t\t1 - Nova Venda                                 |");
        System.out.println("|\t\t2 - Verificar Pedidos                          |");
        System.out.println("|\t\t3 - Alterar Pedidos                            |");
        System.out.println("|\t\t0 - Sair                                       |");
        System.out.println("|______________________________________________________|");

        // __________________________________________________________________________________________________________________ //

        int resp;

        do {
            System.out.println("\nDigite o item desejado: ");
            resp = scan.nextInt();

            switch(resp) {
                case 1:
                    System.out.println("\n|--- Nova Venda ---|");
                    System.out.println("\nDigite sua senha: ");
                    String senha = scan.next();

                    if (usuario.getSenha().equals(senha)) {
                        String id = geradorID();
                        System.out.println("Digite a descrição do pedido: ");
                        String descricao = scan.next();
                        System.out.println("Digite o valor do pedido: ");
                        double valor = scan.nextDouble();

                        System.out.println("\n1 - Dinheiro");
                        System.out.println("2 - Débito");
                        System.out.println("3 - Crédito");
                        System.out.println("4 - Vale Alimentação");
                        System.out.println("5 - Vale Refeição");
                        System.out.println("\nDigite a forma de pagamento: ");
                        int pag = scan.nextInt();

                        switch(pag) {
                            case 1:
                                pedidos.add(new Pedido(id, descricao, valor, FormaDePagamento.DINHEIRO, Estado.REALIZADO));
                                break;
                            case 2:
                                pedidos.add(new Pedido(id, descricao, valor, FormaDePagamento.DEBITO, Estado.REALIZADO));
                                break;
                            case 3:
                                pedidos.add(new Pedido(id, descricao, valor, FormaDePagamento.CREDITO, Estado.REALIZADO));
                                break;
                            case 4:
                                pedidos.add(new Pedido(id, descricao, valor, FormaDePagamento.VALE_ALIMENTACAO, Estado.REALIZADO));
                                break;
                            case 5:
                                pedidos.add(new Pedido(id, descricao, valor, FormaDePagamento.VALE_REFEICAO, Estado.REALIZADO));
                                break;
                        }
                        break;
                    }
                case 2:
                    if (pedidos.isEmpty())
                        System.out.println("\nNenhum pedido foi registrado!");
                    else {
                        System.out.println("\n| ____________ | Lista de Pedidos | ____________ |");
                        pedidos.forEach((Pedido) -> System.out.println(Pedido));
                    }
                    break;
            }

        } while (resp != 0);
    }


    private String geradorID() {
        Random random = new Random();
        String IDGerado = "";
        for (int i = 0; i < 3; i++)
            IDGerado += random.nextInt(10);
        return IDGerado;
    }
}
