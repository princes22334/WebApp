package com.app.service.impl;

import com.app.dto.CompaniesDto;
import com.app.dto.RoleDto;
import com.app.dto.UserDto;
import com.app.entity.Access;

import java.util.List;

public interface UserService {

    List<UserDto> getAllEmployee();

    UserDto getEmployeeById(int id);

    List<RoleDto> getAllRoles();

    List<CompaniesDto> getAllCompanies();

    UserDto createEmployee(UserDto userDto);

    UserDto updateEmployee(int id, UserDto userDto);

    void addAccess(Access access);

    void deleteAccess(Access access);


}
