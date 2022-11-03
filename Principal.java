package Aula_java;
import java.util.Date;

import Aula_java.Entidade.Agencia;
import Aula_java.Entidade.Cliente;
import Aula_java.Entidade.Conta;
import Aula_java.Entidade.Endereco;

// classe que vai dá inicio ao projeto Sistema Bancário
public class Principal {
    public static void main(String[] args) {
        // System.out.println("Oi Mundo");
        Endereco endAgSenac = new Endereco("PE", "Recife", "Santo Amaro", "Pombal", 55, "Sala 201", "50050-050");
        Endereco endCliente = new Endereco("PE", "Recife", "Santo Amaro", "Manoel Carvalho", 70, "casa", ")50050-110");
        Agencia agFacSenac = new Agencia(0034, "8198877-2211", "agencia@hotmail.com", endAgSenac);
        Cliente clienteluis = new Cliente("Pedro Augusto", "117.471.264-38", "pedro@hotmail.com", "81998256149", new Date(1965, 5, 10), endCliente);
        Conta contaluis = new Conta(022, clienteluis, agFacSenac, 128.9, 1000.00, false);
        ContaCorrente contaDanilo = new ContaCorrente();
        
        //System.out.println(contaluis);
        //System.out.println(contaluis.getSaldo());

        contaluis.depositar(7500);
        contaluis.sacar(459);
        contaluis.sacar(1800);
        contaluis.depositar(1200);
        contaluis.sacar(4000);
        contaluis.sacar(130);
        System.out.println(contaluis.extrato());
}
}
