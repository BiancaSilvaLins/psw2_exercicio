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
public class Telefone implements EntidadeBase {
    @Id
    @GeneratedValue
    private Integer id;
    private int id_cliente;
    private int num_ddd;
    private int num_telefone;
    private int tipo_telefone;

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
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the num_ddd
     */
    public int getNum_ddd() {
        return num_ddd;
    }

    /**
     * @param num_ddd the num_ddd to set
     */
    public void setNum_ddd(int num_ddd) {
        this.num_ddd = num_ddd;
    }

    /**
     * @return the num_telefone
     */
    public int getNum_telefone() {
        return num_telefone;
    }

    /**
     * @param num_telefone the num_telefone to set
     */
    public void setNum_telefone(int num_telefone) {
        this.num_telefone = num_telefone;
    }

    /**
     * @return the tipo_telefone
     */
    public int getTipo_telefone() {
        return tipo_telefone;
    }

    /**
     * @param tipo_telefone the tipo_telefone to set
     */
    public void setTipo_telefone(int tipo_telefone) {
        this.tipo_telefone = tipo_telefone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final Telefone other = (Telefone) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
