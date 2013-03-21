/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.quoteSystem;

/**
 *
 * @author Carol Pettirossi
 */
public class Produto {
    String nome;
    String descricao;
    Float valor;
    
    Produto (String nome) {
        this.nome = nome;
    }
    
    Produto (String nome, Float valor) {
        this.nome = nome;
        this.valor = valor;
    }
    
    Produto (String nome, String descricao, Float valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
      this.nome = nome;  
    } 
    
    public Float getValor() {
        return this.valor;
    }
    
    public void setValor(Float valor) {
      this.valor = valor;  
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
      this.descricao = descricao;  
    }
}
