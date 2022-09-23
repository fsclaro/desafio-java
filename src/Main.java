public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

        contaCorrente.imprimeSaldo();
        contaPoupanca.imprimeSaldo();

        contaCorrente.depositar(100);
        contaPoupanca.depositar(1000);

        contaCorrente.imprimeSaldo();
        contaPoupanca.imprimeSaldo();

        contaCorrente.sacar(10);
        contaPoupanca.transferir(400, contaCorrente);

        contaCorrente.imprimeSaldo();
        contaPoupanca.imprimeSaldo();
    }
}
