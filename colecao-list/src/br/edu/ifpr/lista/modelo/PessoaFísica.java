package br.edu.ifpr.lista.modelo;

import br.edu.ifpr.lista.Utils.Utils;

import java.time.LocalDate;

public class PessoaFísica extends Pessoa {
    private String cpf;
    public PessoaFísica() { super(); }






    public PessoaFísica(String nome, LocalDate nascimento, String nomeRua, Integer numero, String bairro, String cidade, String estado, String CEP, String cpf, Endereço endereço) {
        super(nome, nascimento, nomeRua, numero, bairro, cidade, estado, CEP);
        this.cpf = cpf;
    }


    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public String toString() {
        return "PessoaFísica: cpf = " + Utils.fomatCpf(cpf) + super.toString() ;
    }


}



