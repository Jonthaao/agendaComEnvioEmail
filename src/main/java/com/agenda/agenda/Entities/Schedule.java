package com.agenda.agenda.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String identification;
    private String name;
    private boolean flOn;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Annotation annotations;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlOn() {
        return flOn;
    }

    public void setFlOn(boolean flOn) {
        this.flOn = flOn;
    }

    public Annotation getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Annotation annotations) {
        this.annotations = annotations;
    }

}
