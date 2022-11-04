package Aula_java;
import java.util.Date;

import Aula_java.Entidade.Agencia;
import Aula_java.Entidade.Cliente;
import Aula_java.Entidade.Conta;
import Aula_java.Entidade.ContaCorrente;
import Aula_java.Entidade.Endereco;

// Classe que vai dar início ao projeto Sistema Bancário
public class Principal {
    // Método main semelhante ao C
    public static void main(String[] args) {
        // System.out.println("Olá mundo!");
        Endereco endAgSenac = new Endereco("PE", "Recife", "Santo Amaro", "Pombal", 55, "Sala 1201", "50050-050");
        Endereco endCliente = new Endereco("PE", "Recife", "Aflitos", "Manoel de Carvalho", 145, "1406", "51070-083");
        Agencia agFacSenac = new Agencia(0023, "8132314545", "faculdade@bancosenac.com.br", endAgSenac);
        Cliente clienteLuis = new Cliente("Luis Ernani", "111.222.333-00", "luis@gmail.com", "978787887", new Date(1986, 11, 18), endCliente);
        Conta contaLuis = new Conta(123, clienteLuis, agFacSenac, 128.90, 1000);
        Cliente clienteDeborah = new Cliente("Deborah Novaes", "111.222.444-00", "deborah@gmail.com", "978787899", new Date(1993, 11, 13), endCliente);
        ContaCorrente contaDeborah = new ContaCorrente(123, clienteDeborah, agFacSenac, 18120.00, 5000, 0.01);
        //System.out.println(contaLuis);
        //System.out.println(contaLuis.getSaldo());
        contaLuis.depositar(7500);
        contaLuis.sacar(1800);
        contaLuis.sacar(459);
        contaLuis.depositar(1200);
        contaLuis.sacar(4000);
        contaLuis.sacar(130);
        contaLuis.transferir(150, contaDeborah);
        contaDeborah.sacar(2000);
        System.out.println(contaLuis.extrato());
        System.out.println(contaDeborah.extrato());
    }
}
