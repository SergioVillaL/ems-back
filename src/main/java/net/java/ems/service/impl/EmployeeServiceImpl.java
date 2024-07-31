package net.java.ems.service.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.java.ems.dto.EmployeeDto;
import net.java.ems.entity.Employee;
import net.java.ems.mapper.EmployeeMapper;
import net.java.ems.repository.EmployeeRepository;
import net.java.ems.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

}
