package homework._26_06_2023.classStructure1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("Company_Name");

        company.addDepartment(Department.DEPARTMENT1);
        company.addDepartment(Department.DEPARTMENT2);
        company.addDepartment(Department.DEPARTMENT3);

        Employee employee1 = new Employee("Анна", Department.DEPARTMENT1, Position.POSITION1, 3000.0);
        Employee employee2 = new Employee("Мария", Department.DEPARTMENT2, Position.POSITION2, 4800.0);
        Employee employee3 = new Employee("Иван", Department.DEPARTMENT1, Position.POSITION3, 6200.0);
        Employee employee4 = new Employee("Ирина", Department.DEPARTMENT3, Position.POSITION1, 3800.0);
        Employee employee5 = new Employee("Андрей", Department.DEPARTMENT2, Position.POSITION1, 3700.0);
        Employee employee6 = new Employee("Алина", Department.DEPARTMENT3, Position.POSITION2, 5500.0);
        Employee employee7 = new Employee("Катерина", Department.DEPARTMENT1, Position.POSITION3, 5700.0);
        Employee employee8 = new Employee("Виталий", Department.DEPARTMENT2, Position.POSITION3, 7000.0);

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        company.addEmployee(employee4);
        company.addEmployee(employee5);
        company.addEmployee(employee6);
        company.addEmployee(employee7);
        company.addEmployee(employee8);


        Map<Position, List<String>> positionMap = new HashMap<>();
        positionMap.put(Position.POSITION1, Arrays.asList("Занимает должность POSITION1. Работает в компании меньше 2 лет"));
        positionMap.put(Position.POSITION2, Arrays.asList("Занимает должность POSITION2. Работает в компании от 2 до 6 лет"));
        positionMap.put(Position.POSITION3, Arrays.asList("Занимает должность POSITION3. Работает в компании больше 6 лет"));


        Info info1 = new Info(positionMap);


        System.out.println("Информация о сотруднике: " + info1.checker(employee1));
        System.out.println("Информация о сотруднике: " + info1.checker(employee2));

        System.out.println("Средняя зарплата в DEPARTMENT1: " + info1.avgSalary(Department.DEPARTMENT1, company) + " CHF");
        System.out.println("Средняя зарплата в DEPARTMENT2: " + info1.avgSalary(Department.DEPARTMENT2, company) + " CHF");
        System.out.println("Средняя зарплата в DEPARTMENT3: " + info1.avgSalary(Department.DEPARTMENT3, company) + " CHF");

        System.out.println("Информация о сотруднике в DEPARTMENT1: " + info1.maxSalary(Department.DEPARTMENT1, company));
        System.out.println("Информация о сотруднике в DEPARTMENT2: " + info1.maxSalary(Department.DEPARTMENT2, company));
        System.out.println("Информация о сотруднике в DEPARTMENT3: " + info1.maxSalary(Department.DEPARTMENT3, company));

        System.out.println("Информация о сотруднике в DEPARTMENT1: " + info1.minSalary(Department.DEPARTMENT1, company));
        System.out.println("Информация о сотруднике в DEPARTMENT2: " + info1.minSalary(Department.DEPARTMENT2, company));
        System.out.println("Информация о сотруднике в DEPARTMENT3: " + info1.minSalary(Department.DEPARTMENT3, company));

        System.out.println("Повышение для сотрудника employee1:");
        info1.getPromotion(employee1);

        System.out.println("Повышение для сотрудника employee6:");
        info1.getPromotion(employee8);
    }
}