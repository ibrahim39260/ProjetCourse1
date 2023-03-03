/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stema.javabeans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

/**
 *
 * @author Hp_pc
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class TranspondeurUtilise implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTranspondeurUtilise;
    private String numero;
    @ManyToOne
    private Concurrent concurrent;

    public TranspondeurUtilise() {
    }

    public int getIdTranspondeurUtilise() {
        return idTranspondeurUtilise;
    }

    public void setIdTranspondeurUtilise(int idTranspondeurUtilise) {
        this.idTranspondeurUtilise = idTranspondeurUtilise;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Concurrent getConcurrent() {
        return concurrent;
    }

    public void setConcurrent(Concurrent concurrent) {
        this.concurrent = concurrent;
    }
    
    
    
}
