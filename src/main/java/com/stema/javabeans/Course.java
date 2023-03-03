/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stema.javabeans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Hp_pc
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Course implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCourse;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DateCourse;
    private String lieu;
    @OneToMany
    private List<Chrono> chrono;

    public Course() {
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public Date getDateCourse() {
        return DateCourse;
    }

    public void setDateCourse(Date DateCourse) {
        this.DateCourse = DateCourse;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public List<Chrono> getChrono() {
        return chrono;
    }

    public void setChrono(List<Chrono> chrono) {
        this.chrono = chrono;
    }
    
    
}
