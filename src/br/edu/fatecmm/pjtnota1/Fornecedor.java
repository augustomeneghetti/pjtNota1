package br.edu.fatecmm.pjtnota1;

public class Fornecedor {

    private int idForn;
    private String nome, contato, fone, email;

    public void imprimirFornecedor(){
        System.out.println("idForn = " + idForn);
        System.out.println("nome = " + nome);
        System.out.println("contato = " + contato);
        System.out.println("fone = " + fone);
        System.out.println("email = " + email);
    }

    @Override
    public String toString() {
        return nome;
    }

    public int getIdForn() {
        return idForn;
    }

    public void setIdForn(int idForn) {
        this.idForn = idForn;
    }

    public String getNome(String entrada) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato(String entrada) {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getFone(String entrada) {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail(String entrada) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
