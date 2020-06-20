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
                case 3:
                    System.out.println("\n|--- Alterar Pedidos ---|");
                    System.out.println("\nDigite o ID do pedido que deseja modificar: ");
                    String id = scan.next();
                    for (int i = 0; i < pedidos.size(); i++) {
                        if (pedidos.get(i).getID().equals(id)) {
                            System.out.println("\n1 - Preparação");
                            System.out.println("2 - Saiu para entrega");
                            System.out.println("3 - Entregue");
                            System.out.println("4 - Devolvido");
                            System.out.println("\nDigite o novo estado do pedido: ");
                            int est = scan.nextInt();

                            switch(est) {
                                case 1:
                                    pedidos.get(i).setEstado(Estado.PREPARACAO);
                                    break;
                                case 2:
                                    pedidos.get(i).setEstado(Estado.SAIU_PARA_ENTREGA);
                                    break;
                                case 3:
                                    pedidos.get(i).setEstado(Estado.ENTREGUE);
                                    break;
                                case 4:
                                    pedidos.get(i).setEstado(Estado.DEVOLVIDO);
                            }
                        }
                        else
                            System.out.println("ID digitado não existe...");
                    }
                    break;
                case 0:
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
