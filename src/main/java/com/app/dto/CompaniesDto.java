package com.app.dto;

import java.util.List;

public class CompaniesDto {

    private long id;
    private String name;
    private List<UnitDto> units;

    public CompaniesDto() {
    }

    public CompaniesDto(long id, String name, List<UnitDto> units) {
        this.id = id;
        this.name = name;
        this.units = units;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UnitDto> getUnits() {
        return units;
    }

    public void setUnits(List<UnitDto> units) {
        this.units = units;
    }
}
