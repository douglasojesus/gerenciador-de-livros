package models;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String telefone;
    private ArrayList<Livro> historicoLivros;
    private boolean isComLivro;
    private int id;

    public int getId(){
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Livro> getHistoricoLivros() {
        return historicoLivros;
    }

    public void setHistoricoLivros(ArrayList<Livro> historicoLivros) {
        this.historicoLivros = historicoLivros;
    }

    public boolean isComLivro() {
        return isComLivro;
    }

    public void setComLivro(boolean comLivro) {
        isComLivro = comLivro;
    }

    public void setId(int id) {
        this.id = id;
    }
}
