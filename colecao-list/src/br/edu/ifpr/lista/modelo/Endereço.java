package br.edu.ifpr.lista.modelo;

import br.edu.ifpr.lista.Utils.Utils;

import java.util.Objects;
public  class Endereço {
    private String nomeRua;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String CEP;







    private Endereço(String nomeRua, Integer numero, String bairro, String cidade, String estado, String CEP) {
        this.nomeRua = nomeRua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
    }


    public String getNomeRua() {
        return nomeRua;
    }




    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }




    public Integer getNumero() {
        return numero;
    }




    public void setNumero(Integer numero) {
        this.numero = numero;
    }




    public String getBairro() {
        return bairro;
    }




    public void setBairro(String bairro) {
        this.bairro = bairro;
    }




    public String getCidade() {
        return cidade;
    }




    public void setCidade(String cidade) {
        this.cidade = cidade;
    }




    public String getEstado() {
        return estado;
    }




    public void setEstado(String estado) {
        this.estado = estado;
    }




    public String getCEP() {
        return CEP;
    }




    public void setCEP(String CEP) {
        this.CEP = CEP;
    }




    public static Endereço criarEndereço(String nomeRua, Integer numero, String bairro, String cidade, String estado, String CEP){
        return new Endereço(nomeRua, numero, bairro, cidade, estado, CEP);
    }
    @Override
    public String toString() {
        return " Endereço: " +
                " nomeRua = '" + nomeRua + '\'' +
                ", numero = " + numero +
                ", bairro = '" + bairro + '\'' +
                ", cidade = '" + cidade + '\'' +
                ", estado = '" + estado + '\'' +
                ", CEP = '" + Utils.formatarCEP(CEP) + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Endereço outroEnderço = (Endereço) obj;




        return Objects.equals(nomeRua, outroEnderço.nomeRua) && Objects.equals(numero, outroEnderço.numero) &&
                Objects.equals(bairro, outroEnderço.bairro) && Objects.equals(cidade, outroEnderço.cidade) &&
                Objects.equals(estado, outroEnderço.estado) && Objects.equals(CEP, outroEnderço.CEP);
    }
}
