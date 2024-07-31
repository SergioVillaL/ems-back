package net.java.ems.mapper;

import net.java.ems.dto.EmployeeDto;
import net.java.ems.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail());
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        // Crear un nuevo objeto Employee
        Employee employee = new Employee();

        // Establecer los campos excepto el id
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEmail(employeeDto.getEmail());

        // No establecer el id, ya que se generará automáticamente si es nulo
        return employee;
    }
}
