package com.registros.estoque.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "categoria")
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_categoria;
    private String descricao;

    @OneToMany
    private List<Item> itens;

    public Categoria(){}
    public Categoria(String descricao_){
        this.descricao = descricao_;
    }

    public void setDescricao(String descricao_){
        this.descricao = descricao_;
    }

    public void setItens(List<Item> itens_){
        this.itens = itens_;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public int getId_categoria(){
        return this.id_categoria;
    }

    public List<Item> getItens() {
        return this.itens;
    }


}
