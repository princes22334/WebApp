package com.app.dto;

public class AccessDto {

    private int id;
    private int empId;
    private int roleId;
    private int companyId;
    private int unitId;

    public AccessDto() {
    }

    public AccessDto(int id, int empId, int roleId, int companyId, int unitId) {
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
