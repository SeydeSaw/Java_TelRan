package homework._26_06_2023.classStructure1;

import java.util.HashSet;
import java.util.Set;

class Company implements Comparable<Company> {
    private String name;
    private Set<Employee> employees;
    private Set<Department> departments;

    public Company(String name) {
        this.name = name;
        this.employees = new HashSet<>();
        this.departments = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public int compareTo(Company otherCompany) {
        return this.name.compareTo(otherCompany.getName());
    }
}