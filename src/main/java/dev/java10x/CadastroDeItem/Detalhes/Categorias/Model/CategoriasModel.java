package dev.java10x.CadastroDeItem.Detalhes.Categorias.Model;

import dev.java10x.CadastroDeItem.Itens.Model.ItemModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_categorias")
public class CategoriasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;

    @OneToMany(mappedBy = "categoria")
    private List<ItemModel> itens;

    public CategoriasModel(){}

    public CategoriasModel(String descricao_){
        this.descricao = descricao_;
    }

    //gets
    public Long getId(){
        return id;
    }
    public String getDescricao(){
        return descricao;
    }

    //set
    public void setDescricao(String descricao_){
        this.descricao = descricao_;
    }

}
