package br.maua;

import br.maua.Classes.Sistema;
import br.maua.Classes.Usuario;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Usuario user = new Usuario("Matheus", "email@hotmail.com", "123456");

        sistema.run();
    }
}
