package com.registros.estoque.model;

import jakarta.persistence.*;

@Entity(name = "item")
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descricao;
    private int quantidade;

    @ManyToOne
    @JoinColumn(name = "id_unidade")
    private Unidade unidade;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;


}
