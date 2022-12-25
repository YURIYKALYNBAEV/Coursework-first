import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    private static int counterId = 1;

    public Employee(String name, String department, double salary) {
        this.id = counterId++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public void setSalary(double salary) {
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
                ", ФИО " + name +
                ", отдел " + department +
                ", зарплата " + salary;
    }
}
