/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biancalins.projeto.persistence.dto;

import java.sql.Date;

/**
 *
 * @author biancalins
 */
public class PessoaNomeDataDTO {

    private String nome;
    private Date dt_nascimento;

    public PessoaNomeDataDTO(String nome, Date dt_nascimento) {
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the data de nascimento
     */
    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param email the data de nascimento to set
     */
    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

}
