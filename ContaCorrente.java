package Aula_java;

import Aula_java.Entidade.Conta;

public class ContaCorrente extends Conta{
    
    private double taxaManutencao;

    @Override  //está escrevendo por cima do sacar aqui no caso
    public boolean sacar(double valor) {
        // TODO Auto-generated method stub
        double saldoAtual = this.getSaldo();
        saldoAtual -= this.taxaManutencao * valor;
        
        return super.sacar(valor);
    }
}
