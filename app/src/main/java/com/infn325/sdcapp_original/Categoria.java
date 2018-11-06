package com.infn325.sdcapp_original;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private int ID;
    private String Descricao;

    public Categoria(int ID, String descricao) {
        this.ID = ID;
        Descricao = descricao;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public static ArrayList<Categoria> getAll(int q){
        ArrayList<Categoria> lst = new ArrayList<Categoria>();
        for(int i=0; i<q;i++){
            Categoria c = new Categoria(i+1, "Categoria " + Integer.toString(i+1));
            lst.add(c);
        }
        return lst;
    }
}
