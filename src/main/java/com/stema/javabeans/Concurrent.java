/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stema.javabeans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Hp_pc
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Concurrent extends Personne {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConcurrent;
    private String niveauScolaire;
    @ManyToOne
    private Ecole ecole;
    @OneToMany
    private List<Chrono> chrono;
    @OneToMany
    private List<TranspondeurLive> transpondeurLive;
    @OneToMany
    private List<TranspondeurUtilise> transpondeurUtilise;

    public Concurrent() {
    }

    public int getIdConcurrent() {
        return idConcurrent;
    }

    public void setIdConcurrent(int idConcurrent) {
        this.idConcurrent = idConcurrent;
    }

    public String getNiveauScolaire() {
        return niveauScolaire;
    }

    public void setNiveauScolaire(String niveauScolaire) {
        this.niveauScolaire = niveauScolaire;
    }

    public Ecole getEcole() {
        return ecole;
    }

    public void setEcole(Ecole ecole) {
        this.ecole = ecole;
    }

    public List<Chrono> getChrono() {
        return chrono;
    }

    public void setChrono(List<Chrono> chrono) {
        this.chrono = chrono;
    }

    public List<TranspondeurLive> getTranspondeurLive() {
        return transpondeurLive;
    }

    public void setTranspondeurLive(List<TranspondeurLive> transpondeurLive) {
        this.transpondeurLive = transpondeurLive;
    }

    public List<TranspondeurUtilise> getTranspondeurUtilise() {
        return transpondeurUtilise;
    }

    public void setTranspondeurUtilise(List<TranspondeurUtilise> transpondeurUtilise) {
        this.transpondeurUtilise = transpondeurUtilise;
    }
    
    
    
    
}
