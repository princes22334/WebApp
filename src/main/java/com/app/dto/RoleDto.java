package com.app.dto;

import java.util.List;

public class RoleDto {

    private long roleId;
    private String name;
    private List<CompaniesDto> companyList;

    public RoleDto() {
    }

    public RoleDto(long roleId, String name, List<CompaniesDto> companyList) {
        this.roleId = roleId;
        this.name = name;
        this.companyList = companyList;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CompaniesDto> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<CompaniesDto> companyList) {
        this.companyList = companyList;
    }
}
