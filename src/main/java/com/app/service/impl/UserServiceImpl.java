package com.app.service.impl;

import com.app.dto.CompaniesDto;
import com.app.dto.RoleDto;
import com.app.dto.UserDto;
import com.app.entity.Access;
import com.app.entity.Company;
import com.app.entity.Role;
import com.app.entity.User;
import com.app.repository.*;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final ModelMapper modelMapper;
    private UserRepository userRepository;
    private UnitRepository unitRepository;
    private AccessRepository accessRepository;
    private RoleRepository roleRepository;
    private CompanyRepository companyRepository;

    public UserServiceImpl(UserRepository userRepository,
                           UnitRepository unitRepository,
                           AccessRepository accessRepository,
                           RoleRepository roleRepository,
                           CompanyRepository companyRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.unitRepository = unitRepository;
        this.accessRepository = accessRepository;
        this.roleRepository = roleRepository;
        this.companyRepository = companyRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<UserDto> getAllEmployee() {

        return List.of();
    }

    @Override
    public UserDto getEmployeeById(int id) {
        return null;
    }

    @Override
    public List<RoleDto> getAllRoles() {
       List<Role> roles = roleRepository.findAll();
       return roles.stream().map(role -> mapToDto(role)).collect(Collectors.toList());
    }

    @Override
    public List<CompaniesDto> getAllCompanies() {
        List<Company> companies = companyRepository.findAll();
        return companies.stream().map(company -> mapToDto(company)).collect(Collectors.toList());
    }

    @Override
    public UserDto createEmployee(UserDto userDto) {
        User user = userRepository.save(mapToEntity(userDto));
        return mapToDto(user);
    }

    @Override
    public UserDto updateEmployee(int id, UserDto userDto) {
        return null;
    }

    @Override
    public void addAccess(Access access) {

    }

    @Override
    public void deleteAccess(Access access) {

    }

    private UserDto mapToDto(User user){
        return modelMapper.map(user, UserDto.class);
    }
    private User mapToEntity(UserDto dto){
        return modelMapper.map(dto, User.class);
    }
    private RoleDto mapToDto(Role role){
        return modelMapper.map(role, RoleDto.class);
    }
    private Role mapToEntity(RoleDto dto){
        return modelMapper.map(dto, Role.class);
    }
    private CompaniesDto mapToDto(Company company){
        return modelMapper.map(company, CompaniesDto.class);
    }
    private Company mapToEntity(CompaniesDto dto){
        return modelMapper.map(dto, Company.class);
    }




}
