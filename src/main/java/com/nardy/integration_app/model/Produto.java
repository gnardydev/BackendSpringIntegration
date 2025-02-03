package com.nardy.integration_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//entidade, tabela do banco de dados

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Criação de ID único
    private Long id;
    private String nome;
    private double preco;

    // Getters e Setters -> poderiam ser feitos com lombok (implementar/avisar Isaias)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
}
