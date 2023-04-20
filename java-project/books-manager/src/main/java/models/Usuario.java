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


}
