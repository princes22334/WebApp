package com.app.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "companies")
public class Company {

    @Id
    @Column(name = "company_id")
    private int id;

    @Column(name = "company_name")
    private String companyName;

    @OneToMany(mappedBy = "company",
                cascade = CascadeType.ALL)
    private List<Unit> units;

    public Company() {
    }

    public Company(int id, String companyName, List<Unit> units) {
        this.id = id;
        this.companyName = companyName;
        this.units = units;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }
}
