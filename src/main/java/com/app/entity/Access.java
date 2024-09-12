package com.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "access")
public class Access {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "emp_id")
    private int empId;

    @Column(name = "role_id")
    private int roleId;

    @Column(name = "company_id")
    private int companyId;

    @Column(name = "unit_id")
    private int unitId;

    public Access() {
    }

    public Access(int id, int empId, int roleId, int companyId, int unitId) {
        this.id = id;
        this.empId = empId;
        this.roleId = roleId;
        this.companyId = companyId;
        this.unitId = unitId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }
}
