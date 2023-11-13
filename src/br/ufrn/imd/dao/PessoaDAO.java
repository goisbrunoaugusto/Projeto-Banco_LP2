package br.ufrn.imd.dao;
import br.ufrn.imd.modelo.Pessoa;

import java.util.ArrayList;

public class PessoaDAO {
    private ArrayList<Pessoa> pessoa;
    double taxaSalario = 0.11, taxaCC = 0.038, taxaSeguroVida = 31.50, impostoTotal;

    public void cadastraPessoa(Pessoa novaPessoa){
        pessoa.add(novaPessoa);
    }
    public void removerPessoa(Pessoa pessoaExcluir){
        pessoa.remove(pessoaExcluir);
    }
    public void listaPessoas(){
        for(int i = 0 ; i < pessoa.size(); i++){
            System.out.println(pessoa.get(i));
        }
    }
    public String CalcularTributosPessoas(){
        double tributoTotal = 0;
        for(int i = 0; i < this.pessoa.size() ; i++) {
             tributoTotal += (pessoa.get(i).getImpostoTotal()) + (pessoa.get(i).getConta().getImpostoTotal()) +
                    taxaSeguroVida;
        return "Imposto da pessoa " +pessoa.get(i) +" é: " + tributoTotal;
        }
        return "========================================================\n";
    }
    public String imprimeImpostoTotal(){
        double maiorImposto = 0, maiorBeneficio = 0;
        Pessoa pessoaComMaiorImposto = new Pessoa();
        Pessoa pessoaComMaiorBeneficio = new Pessoa();

        for(int i = 0; i < this.pessoa.size() ; i++){
            double impostoAtual = 0, beneficioAtual = 0;
            impostoAtual += (pessoa.get(i).getImpostoTotal()) + (pessoa.get(i).getConta().getImpostoTotal()) +
                    taxaSeguroVida;

            impostoTotal += impostoAtual;
            beneficioAtual = pessoa.get(i).getSeguro().getValor();

            if(impostoAtual > maiorImposto){
                maiorImposto = impostoAtual;
                pessoaComMaiorImposto = pessoa.get(i);
            }
            if(beneficioAtual > maiorBeneficio){
                maiorBeneficio = beneficioAtual;
                pessoaComMaiorBeneficio = pessoa.get(i);
            }
        }

        return "O valor total de tributos é: " + impostoTotal + "\n" + "A pessoa que pagará o maior imposto é: "
                + pessoaComMaiorImposto + "\n" + "O beneficiado com o maior valor de seguro é: " +
                pessoaComMaiorBeneficio + "\n" + "========================================================\n";
    }
}
