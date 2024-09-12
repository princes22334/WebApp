package com.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "unit")
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "unique_id")
    private int unique_id;

    @Column(name = "unit_id")
    private int unitId;

    @Column(name = "unit_name")
    private String unitName;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public Unit() {
    }

    public Unit( int unique_id, int unitId, String unitName, Company company) {
        this.unique_id = unique_id;
        this.unitId = unitId;
        this.unitName = unitName;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(int unique_id) {
        this.unique_id = unique_id;
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
