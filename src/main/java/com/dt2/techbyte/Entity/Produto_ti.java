package com.dt2.techbyte.Entity;
import jakarta.persistence.*;

@Entity
public class Produto_ti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double preco;
    private String nome;
    private String descricao;

    public Produto_ti(double preco, String descricao, String nome) {
        this.preco = preco;
        this.descricao = descricao;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }
}

