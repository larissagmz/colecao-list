package br.edu.ifpr.lista.Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Utils {




    public static String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);




    }




    public static String fomatCpf(String cpf) {
        int quantidadeDigitos = Utils.contadorDigitos(cpf);
        if(quantidadeDigitos != 11) {
            throw new IllegalArgumentException("quatidade de digitos invalido: " + quantidadeDigitos
                    + "  digitos necessarios: 11");
        }
        StringBuilder cpfFormatado = new StringBuilder();
        cpfFormatado.append(cpf, 0, 3).append(".")
                .append(cpf, 3, 6).append(".")
                .append(cpf, 6, 9).append("-")
                .append(cpf.substring(9));




        return cpfFormatado.toString();
    }




    public static String fomatCnpj(String cnpj) {


        int quantidadeDigitos = Utils.contadorDigitos(cnpj);
        if(quantidadeDigitos != 14) {
            throw new IllegalArgumentException("quatidade de digitos invalido: " + quantidadeDigitos
                    + " digitos necessarios: 14 ");
        }
        StringBuilder cpfFormatado = new StringBuilder();
        cpfFormatado.append(cnpj, 0, 2).append(".")
                .append(cnpj, 2, 5).append(".")
                .append(cnpj, 5, 8).append("/")
                .append(cnpj, 8, 12).append("-")
                .append(cnpj.substring(12));








        return cpfFormatado.toString();
    }
    public static String formatarCEP(String cep){
        StringBuilder cepFormatado = new StringBuilder();
        cepFormatado.append(cep, 0, 5 ).append("-").
                append(cep.substring(5));
        return cepFormatado.toString();
    }
    private static int contadorDigitos(String x){
        int contador = 0;
        for (int i = 0; i < x.length(); i++){


            contador++;
        }
        return contador;
    }
}
