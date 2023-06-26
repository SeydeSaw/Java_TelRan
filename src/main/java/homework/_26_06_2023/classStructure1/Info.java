package homework._26_06_2023.classStructure1;

import java.util.Arrays;
import java.util.Map;
import java.util.List;

class Info {
    private Map<Position, List<String>> positionMap;

    public Info(Map<Position, List<String>> positionMap) {
        this.positionMap = positionMap;
    }

    public String checker(Employee employee) {
        Position employeePosition = employee.getPosition();
        List<String> positionInfo = positionMap.get(employeePosition);
        if (positionInfo != null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < positionInfo.size(); i++) {
                stringBuilder.append(positionInfo.get(i));
                if (i < positionInfo.size() - 1) {
                    stringBuilder.append(", ");
                }
            }
            return stringBuilder.toString();
        }
        return "Информация о позиции сотрудника не была найдена.";
    }

    public double avgSalary(Department department, Company company) {
        double totalSalary = 0;
        int employeeCount = 0;
        for (Employee employee : company.getEmployees()) {
            if (employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
                employeeCount++;
            }
        }
        if (employeeCount > 0) {
            return totalSalary / employeeCount;
        }
        return 0;
    }

    public String maxSalary(Department department, Company company) {
        double maxSalary = 0;
        String employeeName = "";
        for (Employee employee : company.getEmployees()) {
            if (employee.getDepartment() == department && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeName = employee.getName();
            }
        }
        if (maxSalary > 0) {
            return "Самая высокая зарплата: " + maxSalary + " CHF" + ", у сотрудника: " + employeeName;
        }
        return "Сотрудник с самой высокой зарплатой не найден.";
    }

    public String minSalary(Department department, Company company) {
        double minSalary = Double.MAX_VALUE;
        String employeeName = "";
        for (Employee employee : company.getEmployees()) {
            if (employee.getDepartment() == department && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeName = employee.getName();
            }
        }
        if (minSalary < Double.MAX_VALUE) {
            return "Минимальная зарплата: " + minSalary + " CHF" +  ", у сотрудника: " + employeeName;
        }
        return "Сотрудник с минимальной зарплатой не найден.";
    }

    public void getPromotion(Employee employee) {
        Position currentPosition = employee.getPosition();
        double currentSalary = employee.getSalary();

        Position[] positions = Position.values();
        int currentPositionIndex = Arrays.asList(positions).indexOf(currentPosition);

        if (currentPositionIndex < positions.length - 1) {
            Position nextPosition = positions[currentPositionIndex + 1];
            double newSalary = currentSalary * 1.25;

            employee.setPosition(nextPosition);
            employee.setSalary(newSalary);

            System.out.println("Новая должность: " + nextPosition + ". Новая зарплата: " + newSalary+ " CHF");
        } else {
            System.out.println("Повышение невозможно для данной должности.");
        }
    }
}