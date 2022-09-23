public abstract class Conta implements IConta {
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if (this.getSaldo() >= valor) {
            this.saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (this.getSaldo() >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public void imprimeSaldo() {
        if (this instanceof ContaCorrente) {
            System.out.println("Conta Corrente nº: " + this.getNumero() + "- Saldo: " + this.getSaldo());
        } else if (this instanceof ContaPoupanca) {
            System.out.println("Conta Poupança nº: " + this.getNumero() + " - Saldo: " + this.getSaldo());
        }
    }
}
