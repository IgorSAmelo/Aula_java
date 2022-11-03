package Aula_java.Entidade;

import java.util.ArrayList;
import java.util.Date;

public class Conta {
    private int numero;
    private Cliente cliente;
    private Agencia agencia;
    private double saldo;
    private double limite;
    private boolean status;
    private ArrayList<Transacao> transacoes;

    public Conta() {
        this.transacoes = new ArrayList<Transacao>();
    }

    public Conta(int numero, Cliente cliente, Agencia agencia, double saldo, double limite, boolean status) {
        this.numero = numero;
        this.cliente = cliente;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        this.status = true;
        this.transacoes = new ArrayList<Transacao>();
    }

    public boolean sacar(double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
            Transacao trans = new Transacao(tipoTransacao.DÉBITO, new Date(), valor, this.getCliente(), '-');
            this.transacoes.add(trans);
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            Transacao trans = new Transacao(tipoTransacao.DEPOSITO, new Date(), valor, this.getCliente(), '+');
            this.transacoes.add(trans);
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Conta contaFav) {
        if (contaFav != null) {
            if (this.saldo + this.limite >= valor) {
                this.saldo -= valor;
                Transacao transEmitente = new Transacao(tipoTransacao.TRANSFERENCIA, new Date(), valor,
                        contaFav.getCliente(), '+');
                this.transacoes.add(transEmitente); // aqui a gente tá tirando o dinheiro da conta

                contaFav.saldo += valor;

                Transacao transFav = new Transacao(tipoTransacao.TRANSFERENCIA, new Date(), valor, this.getCliente(),
                        '+');
                contaFav.transacoes.add(transFav); // aqui a gente tá colocando o dinheiro na outra conta.
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toString() {
        return "Conta de " + this.cliente.getNome() + " de numero " + this.numero + " | " + this.cliente.toString()
                + " | ";
    }

    public String extrato() {
        String extrato = "";
        extrato += this.toString() + "\n";
        for (Transacao trans : transacoes) {
            extrato += trans.toString() + "\n";
        }
        extrato += "Saldo: R$" + this.saldo + "|" + "Saldo Disponível R$" + (this.saldo + this.limite);
        return extrato;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(ArrayList<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

}
