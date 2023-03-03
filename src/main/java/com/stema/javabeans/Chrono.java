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
public class Chrono implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idChrono;
    private String tempsFinal;
    private String tempsPassage1;
    @ManyToOne
    private Course course;
    @ManyToOne
    private Concurrent concurrent;

    public Chrono() {
    }

    public int getIdChrono() {
        return idChrono;
    }

    public void setIdChrono(int idChrono) {
        this.idChrono = idChrono;
    }

    public String getTempsFinal() {
        return tempsFinal;
    }

    public void setTempsFinal(String tempsFinal) {
        this.tempsFinal = tempsFinal;
    }

    public String getTempsPassage1() {
        return tempsPassage1;
    }

    public void setTempsPassage1(String tempsPassage1) {
        this.tempsPassage1 = tempsPassage1;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Concurrent getConcurrent() {
        return concurrent;
    }

    public void setConcurrent(Concurrent concurrent) {
        this.concurrent = concurrent;
    }
    
    

}