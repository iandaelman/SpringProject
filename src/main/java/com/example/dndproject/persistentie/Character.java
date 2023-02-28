package com.example.dndproject.persistentie;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private int age;
    @OneToMany
    private List<Weapon> weapons;

    protected Character() {
    }

    public Character(String name, int age, ArrayList<Weapon> weapons) {
        this.name = name;
        this.age = age;
        this.weapons = weapons;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
