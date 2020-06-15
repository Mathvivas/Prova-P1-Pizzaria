package br.maua.Classes;

import java.util.Scanner;

public class Sistema {

    public void run() {
        System.out.println("| ____________ | Pizzaria o Rato que Ri | ____________ |");
        System.out.println("|\t\t1 - Nova Venda                                 |");
        System.out.println("|\t\t2 - Verificar Pedidos                          |");
        System.out.println("|\t\t3 - Alterar Pedidos                            |");
        System.out.println("|\t\t0 - Sair                                       |");
        System.out.println("|______________________________________________________|");

        // __________________________________________________________________________________________________________________ //

        Usuario usuario;
        Scanner scan = new Scanner(System.in);
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

                    }
            }

        } while (resp != 0);
    }
}
