package br.ufrn.imd.controle;
import br.ufrn.imd.modelo.Pessoa;
public class GeradorImpostoRenda {
    private double totalTributo;

    private String calculaValorTotalTributo(Pessoa p){
        double valor = p.getImpostoTotal() + p.getConta().getImpostoTotal() + p.getSeguro().getImpostoSeguro();
        return "O total de impostos da pessoa " + p + "é : " + valor +
                "\n======================================================== \n";
    }
}
