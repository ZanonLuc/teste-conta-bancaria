package desafio.poo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner ( System.in );
        Cliente cliente = new Cliente ( );

        System.out.println ( "Digite nome de usuário para saber o seu extrato: " );
        String novo = teclado.nextLine ( );

        Conta cc = new ContaCorrente ( novo );
        Conta poupanca = new ContaPoupanca ( novo );
        cliente.setNome ( novo );
        cc.imprimirExtrato ();
        poupanca.imprimirExtrato ();
    }
}
