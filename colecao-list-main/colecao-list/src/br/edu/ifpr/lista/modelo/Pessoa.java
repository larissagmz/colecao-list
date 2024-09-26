package br.edu.ifpr.lista.modelo;

import br.edu.ifpr.lista.Utils.Utils;

import java.time.LocalDate;
import java.util.Objects;
public abstract class Pessoa {
    protected String    nome;
    protected LocalDate nascimento;
    private Endereço endereço ;
    public Pessoa() {}
    public Pessoa(String nome, LocalDate nascimento, String nomeRua, Integer numero, String bairro, String cidade, String estado, String CEP) {
        this.nome       = nome;
        this.nascimento = nascimento;
        this.endereço = Endereço.criarEndereço(nomeRua, numero, bairro, cidade, estado, CEP);
    }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public LocalDate getNascimento() {
        return nascimento;
    }
    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return " Pessoa nome = " + nome + ", nascimento = " + Utils.formatDate(nascimento) + endereço;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa outraPessoa = (Pessoa) obj;
        return Objects.equals(nascimento, outraPessoa.nascimento) && Objects.equals(nome, outraPessoa.nome)
                ;
    }
}
