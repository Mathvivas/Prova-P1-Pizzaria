package br.maua;

import br.maua.Classes.Sistema;

/**
 * Classe responsável por iniciar a aplicação, instanciando a Classe Sistema.
 * Por meio dela, a aplicação é executada.
 *
 * @author Matheus Lopes Vivas - mathvivas@hotmail.com
 * @since 15/06/2020
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        sistema.run();
    }
}
