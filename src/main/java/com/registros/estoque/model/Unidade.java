package com.registros.estoque.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWarDeployment;

import java.util.List;

@Entity(name = "unidade")
@Table(name = "unidade")
public class Unidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_unidade;
    private String descricao;

    @OneToMany
    private List<Item> itens;

    public Unidade(){}
    public Unidade(String descricao){
        this.descricao = descricao;
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

    public int getId_unidade(){
        return this.id_unidade;
    }

    public List<Item> getItens() {
        return this.itens;
    }

}
