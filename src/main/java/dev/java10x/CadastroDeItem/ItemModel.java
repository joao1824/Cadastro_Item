package dev.java10x.CadastroDeItem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "tb_itens")
public class ItemModel {
    @Id
    private Long id;
    private String descricao;
    private String unidade;
    private int quantidade;

    public ItemModel(){}
    public ItemModel(String descricao_, String unidade_, int quantidade_){
        this.descricao = descricao_;
        this.unidade = unidade_;
        this.quantidade = quantidade_;
    }
    //gets
    public Long getId(){
        return this.id;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public String getUnidade(){
        return this.unidade;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    //sets
    public void setDescricao(String descricao_){
        this.descricao = descricao_;
    }
    public void setUnidade(String unidade_){
        this.unidade = unidade_;
    }
    public void setQuantidade(int quantidade_){
        this.quantidade = quantidade_;
    }
}
