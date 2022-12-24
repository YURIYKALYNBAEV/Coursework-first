import java.util.Objects;

public class Employee {
    private int id;
    private String employees;
    private String department;
    private int salary;

    public Employee(int id, String employees, String department, int salary) {
        this.id = id;
        this.employees = employees;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getEmployees() {
        return employees;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Сотрудник: " + "таб.№ " + id +
                ", ФИО " + employees +
                ", отдел " + department +
                ", зарплата " + salary;
    }
}
