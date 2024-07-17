package models;

public class Conta {
    private final int numeroConta;
    private final String agencia;
    private String nomeCliente;
    private double saldo;

    public Conta(int numeroConta, String agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
    }

    public int getConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public boolean deposito(double valor) {
        if(valor <= 0) {
            return false;
        }
        this.saldo += valor;
        return true;
    }

    public boolean saque(double valor) {
        if(saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }
}
