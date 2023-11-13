package br.ufrn.imd.modelo;

public class Pessoa {
    private String nome;
    private double salario, impostoTotal, impostoSalario = 0.89;
    private ContaCorrente conta;
    private SeguroVida seguro;

    public double getImpostoTotal() {
        return impostoTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.impostoTotal = salario * 0.11;
        this.salario = (salario * impostoSalario);
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    public SeguroVida getSeguro() {
        return seguro;
    }

    public void setSeguro(SeguroVida seguro) {
        this.seguro = seguro;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", conta=" + conta +
                ", seguro=" + seguro +
                '}';
    }
}
