package br.ufrn.imd.modelo;

public class SeguroVida {
    private int numero;
    private String beneficiado;
    private double valor;
    private double impostoSeguro = 31.50;

    public double getImpostoSeguro() {
        return impostoSeguro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBeneficiado() {
        return beneficiado;
    }

    public void setBeneficiado(String beneficiado) {
        this.beneficiado = beneficiado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = (valor - impostoSeguro);
    }

    @Override
    public String toString() {
        return "SeguroVida{" +
                "numero=" + numero +
                ", beneficiado='" + beneficiado + '\'' +
                ", valor=" + valor +
                ", impostoSeguro=" + impostoSeguro +
                '}';
    }
}
