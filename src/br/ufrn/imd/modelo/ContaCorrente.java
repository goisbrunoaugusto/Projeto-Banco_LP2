package br.ufrn.imd.modelo;

public class ContaCorrente {
    private String agencia, numero;
    private double saldo, impostoTotal, impostoCC = 0.9962;

    public double getImpostoTotal() {
        return impostoTotal;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.impostoTotal = (saldo * 0.0038);
        this.saldo = (saldo * impostoCC);
    }

    public boolean sacar(double valor){
        if(this.saldo < valor){
            System.out.println("Valor insuficiente \n");
            System.out.println("======================================================== \n");
            return false;
        }
        else{
            this.saldo -= valor;
            System.out.println("Valor depositado \n");
            System.out.println("======================================================== \n");
            return true;
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean transferir(double valor, ContaCorrente cc){
        if(this.saldo > valor){
            this.saldo -= valor;
            cc.depositar(valor);
            System.out.println("Valor transferido \n");
            System.out.println("======================================================== \n");
            return true;
        }
        else {
            System.out.println("Valor insuficiente");
            System.out.println("======================================================== \n");
            return false;
        }
    }

}
