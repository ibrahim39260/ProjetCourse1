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

/**
 *
 * @author Hp_pc
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class EnseignantAdmin implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnseignantAdmin;
    private String identifiant;
    private String motDePasse;

    public EnseignantAdmin() {
    }

    public int getIdEnseignantAdmin() {
        return idEnseignantAdmin;
    }

    public void setIdEnseignantAdmin(int idEnseignantAdmin) {
        this.idEnseignantAdmin = idEnseignantAdmin;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    
}
