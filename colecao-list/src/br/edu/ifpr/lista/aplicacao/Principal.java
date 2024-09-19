package br.edu.ifpr.lista.aplicacao;

import br.edu.ifpr.lista.modelo.PessoaJurídica;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Principal {


    public static void main(String[] args) {
        new Principal();
    }

    public Principal() {

        ArrayList<PessoaJurídica> pessoas = new ArrayList<>();

        PessoaJurídica pj1 = new PessoaJurídica("Empresa 1", LocalDate.of(2000, 1, 1), "Rua A", 123, "Bairro A", "Cidade A", "Estado A", "12345678", "11111111000111", "Nome Fantasia 1");

        PessoaJurídica pj2 = new PessoaJurídica("Empresa 2", LocalDate.of(2001, 2, 2), "Rua B", 234, "Bairro B", "Cidade B", "Estado B", "23456789", "22222222000222", "Nome Fantasia 2");

        PessoaJurídica pj3 = new PessoaJurídica("Empresa 3", LocalDate.of(2002, 3, 3), "Rua C", 345, "Bairro C", "Cidade C", "Estado C", "34567890", "33333333000333", "Nome Fantasia 3");

        PessoaJurídica pj4 = new PessoaJurídica("Empresa 4", LocalDate.of(2003, 4, 4), "Rua D", 456, "Bairro D", "Cidade D", "Estado D", "45678901", "44444444000444", "Nome Fantasia 4");

        PessoaJurídica pj5 = new PessoaJurídica("Empresa 5", LocalDate.of(2004, 5, 5), "Rua E", 567, "Bairro E", "Cidade E", "Estado E", "56789012", "55555555000555", "Nome Fantasia 5");

        pessoas.add(pj1);
        pessoas.add(pj2);
        pessoas.add(pj3);
        pessoas.add(pj4);
        pessoas.add(pj5);
        pessoas.forEach(System.out::println);

    }
}
