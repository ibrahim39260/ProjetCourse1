/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stema.models;

import com.stema.javabeans.Concurrent;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Hp_pc
 */
@Stateless
public class ConcurrentModel {

    @PersistenceContext
    private EntityManager em;

    public void create(Concurrent c) {

        em.persist(c);
    }

    public void update(Concurrent c) {

        em.merge(c);
    }

    public void delete(Concurrent c) {
        em.remove(em.merge(c));
    }

    public List<Concurrent> read() {
        Query query = em.createQuery("SELECT listeConcurrents FROM Concurrent as listeConcurrents");
        return query.getResultList();
    }
}