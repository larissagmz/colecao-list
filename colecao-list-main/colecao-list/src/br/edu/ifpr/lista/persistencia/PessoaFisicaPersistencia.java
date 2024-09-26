package br.edu.ifpr.lista.persistencia;
import br.edu.ifpr.lista.modelo.PessoaFísica;

import java.util.ArrayList;
import java.util.List;

public class PessoaFisicaPersistencia {
    private List<PessoaFísica> pessoaFísicas;

    public PessoaFisicaPersistencia() {
        this.pessoaFísicas = new ArrayList<>();
    }

    public int insertPessoaFisica(PessoaFísica pessoa){
        for (PessoaFísica x : pessoaFísicas){
            if(x.getCpf().equals(pessoa.getCpf())){
                return 0;
            }
        }
        pessoaFísicas.add(pessoa);

        return 1;
    }

    public int updatePessoaFisica(PessoaFísica pessoa){
        // colocar "pessoa" na mesma posição da pessoa existente
        boolean removed = pessoaFísicas.removeIf(u -> u.getCpf().equals(pessoa.getCpf()));
        if (removed) {
            pessoaFísicas.add(pessoa);
            return 1;
        }
        return 0;
    }
    public PessoaFísica selectPessoaFísica(String cpf){
        for (PessoaFísica x : pessoaFísicas){
            if(x.getCpf().equals(cpf)){
                return x;
            }
        }
        return null;
    }
    public int deletePessoaFísica(String cpf){
       boolean removed = pessoaFísicas.removeIf(u -> u.getCpf().equals(cpf));
       if (removed){
           return 1;
       }
       return 0;
    }
    public int delete(){
        int total = pessoaFísicas.size();
        pessoaFísicas.clear();
        return total;
    }
    public ArrayList<PessoaFísica> selectTodasPessoaFísica(){
        return new ArrayList<>(pessoaFísicas);
    }
}


