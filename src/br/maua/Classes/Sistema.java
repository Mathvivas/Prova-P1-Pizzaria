package br.maua.Classes;

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
                    System.out.println("\n--- Nova Venda ---");
                    System.out.println("\nDigite sua senha: ");
                    String senha = scan.next();

                    if (usuario.getSenha().equals(senha)) {
                        String id = geradorID();
                    }
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
