package me.sememorg.homework.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Slave {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String race;
    private String gender;
    private Integer age;
    private Integer weight;
    private Integer height;
    private BigDecimal cost;

    @OneToOne
    private Master master;

    public Slave() {
    }

    public Slave(Integer id, String name, String race, String gender, Integer age, Integer weight, Integer height, BigDecimal cost) {
        this(name, race,gender, age, weight, height, cost);
        this.id = id;
    }

    public Slave(String name, String race, String gender, Integer age, Integer weight, Integer height, BigDecimal cost) {
        this.name = name;
        this.race = race;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.cost = cost;
    }


    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }


    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}