/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stema.managedbeans;

import com.stema.javabeans.Concurrent;
import com.stema.models.ConcurrentModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Hp_pc
 */
@Named
@SessionScoped
public class ConcurrentBean implements Serializable{
    @EJB
    private ConcurrentModel concurrentModel;
    private List<Concurrent> listeConcurrents = new ArrayList<>();
    private Concurrent c = new Concurrent();

    public ConcurrentBean() {
    }



    public List<Concurrent> getListeConcurrents() {
        listeConcurrents=concurrentModel.read();
        return listeConcurrents;
    }

    public void setListeConcurrents(List<Concurrent> listeConcurrents) {
        this.listeConcurrents = listeConcurrents;
    }

    public Concurrent getC() {
        return c;
    }

    public void setC(Concurrent c) {
        this.c = c;
    }
    
    public void edit() {

        concurrentModel.create(this.c);

        this.c = new Concurrent();
        
        

    }
    
    
    public void delete(Concurrent c) {
        concurrentModel.delete(c);
    }

    public void update(Concurrent c) {
        concurrentModel.update(this.c);
        
    }
    
}
