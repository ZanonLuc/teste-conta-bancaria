package desafio.poo;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String cliente) {
        super ( cliente );
    }

    @Override
    public void imprimirExtrato() {
        System.out.println ("\n**** Extrato Conta Poupança ****" );
        super.extracted ( );
    }
}
