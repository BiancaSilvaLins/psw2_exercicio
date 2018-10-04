/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biancalins.projeto.entity;

import com.biancalins.model.dto.EntidadeBase;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author CAP
 */

@Entity
public class Fornecedor implements EntidadeBase {
	
    @Id
    @GeneratedValue        
    private Integer id;
    private String razao_social;
    private String nome_fantasia;
    private int id_produto;
    private int id_endereco;
    private int id_telefone;
    private int id_email;
    private int id_site;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the razao_social
     */
    public String getRazao_social() {
        return razao_social;
    }

    /**
     * @param razao_social the razao_social to set
     */
    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    /**
     * @return the nome_fantasia
     */
    public String getNome_fantasia() {
        return nome_fantasia;
    }

    /**
     * @param nome_fantasia the nome_fantasia to set
     */
    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    /**
     * @return the id_produto
     */
    public int getId_produto() {
        return id_produto;
    }

    /**
     * @param id_produto the id_produto to set
     */
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    /**
     * @return the id_endereco
     */
    public int getId_endereco() {
        return id_endereco;
    }

    /**
     * @param id_endereco the id_endereco to set
     */
    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }

    /**
     * @return the id_telefone
     */
    public int getId_telefone() {
        return id_telefone;
    }

    /**
     * @param id_telefone the id_telefone to set
     */
    public void setId_telefone(int id_telefone) {
        this.id_telefone = id_telefone;
    }

    /**
     * @return the id_email
     */
    public int getId_email() {
        return id_email;
    }

    /**
     * @param id_email the id_email to set
     */
    public void setId_email(int id_email) {
        this.id_email = id_email;
    }

    /**
     * @return the id_site
     */
    public int getId_site() {
        return id_site;
    }

    /**
     * @param id_site the id_site to set
     */
    public void setId_site(int id_site) {
        this.id_site = id_site;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fornecedor other = (Fornecedor) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
