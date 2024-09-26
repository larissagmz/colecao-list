package br.edu.ifpr.lista.aplicacao;

import br.edu.ifpr.lista.modelo.PessoaFísica;
import br.edu.ifpr.lista.modelo.PessoaJurídica;
import br.edu.ifpr.lista.persistencia.PessoaFisicaPersistencia;

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

        ArrayList<PessoaFísica> listaPessoaFisica = new ArrayList<>();

        PessoaFísica pf1 = new PessoaFísica("Empresa A", LocalDate.of(1998, 1, 15), "Rua A", 101, "Bairro A", "Cidade A", "Estado A", "12345678", "11122233344");
        PessoaFísica pf2 = new PessoaFísica("Empresa B", LocalDate.of(2001, 2, 20), "Rua B", 202, "Bairro B", "Cidade B", "Estado B", "23456789", "22233344455");
        PessoaFísica pf3 = new PessoaFísica("Empresa C", LocalDate.of(2005, 3, 25), "Rua C", 303, "Bairro C", "Cidade C", "Estado C", "34567890", "33344455566");
        PessoaFísica pf4 = new PessoaFísica("Empresa D", LocalDate.of(2010, 4, 30), "Rua D", 404, "Bairro D", "Cidade D", "Estado D", "45678901", "44455566677");
        PessoaFísica pf5 = new PessoaFísica("Empresa E", LocalDate.of(2015, 5, 5), "Rua E", 505, "Bairro E", "Cidade E", "Estado E", "56789012", "55566677788");
        PessoaFísica pf6 = new PessoaFísica("Empresa F", LocalDate.of(2018, 6, 10), "Rua F", 606, "Bairro F", "Cidade F", "Estado F", "67890123", "66677788899");
        PessoaFísica pf7 = new PessoaFísica("Empresa G", LocalDate.of(2020, 7, 15), "Rua G", 707, "Bairro G", "Cidade G", "Estado G", "78901234", "77788899900");
        PessoaFísica pf8 = new PessoaFísica("Empresa H", LocalDate.of(2022, 8, 20), "Rua H", 808, "Bairro H", "Cidade H", "Estado H", "89012345", "88899900011");
        PessoaFísica pf9 = new PessoaFísica("Empresa I", LocalDate.of(2023, 9, 25), "Rua I", 909, "Bairro I", "Cidade I", "Estado I", "90123456", "99900011122");
        PessoaFísica pf10 = new PessoaFísica("Empresa J", LocalDate.of(2024, 10, 30), "Rua J", 1000, "Bairro J", "Cidade J", "Estado J", "01234567", "00011122233");

        listaPessoaFisica.add(pf1);
        listaPessoaFisica.add(pf2);
        listaPessoaFisica.add(pf3);
        listaPessoaFisica.add(pf4);
        listaPessoaFisica.add(pf5);
        listaPessoaFisica.add(pf6);
        listaPessoaFisica.add(pf7);
        listaPessoaFisica.add(pf8);
        listaPessoaFisica.add(pf9);
        listaPessoaFisica.add(pf10);

        PessoaFisicaPersistencia pesistencia = new PessoaFisicaPersistencia(listaPessoaFisica);


        listaPessoaFisica.forEach(System.out::println);

    }
}
