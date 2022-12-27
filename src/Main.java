public class Main {

    private static Employee[] employees = {

            new Employee("Меншиков Александр Данилович ", "1", 90000),
            new Employee("Васильев Василий Васильевич", "2", 10000),
            new Employee("Быкова Елена Петровна", "3", 20000),
            new Employee("Петрова Зинаида Ивановна", "4", 30000),
            new Employee("Иванов Иван Иванович", "5", 40000),
            new Employee("Сидоров Петр Петрович", "1", 50000),
            new Employee("Петров Николай Алексеевич", "2", 60000),
            new Employee("Морозова Марья Ивановна", "3", 70000),
            new Employee("Потёмкин Григорий  Александрович ", "4", 100000),
            new Employee("Чухиль Светлана Дмитриевна", "5", 80000)
    };

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        String dept = "4"; // отдел
        int percentIndex = 20; // процент индексации
        double salaryComparison = 50000;

        System.out.println("а. Получение списка всех сотрудников");
        printEmployees();
        System.out.println("b. Расчет суммы затрат на зарплаты за месяц");
        double amountSalaryMonth = calculateSalaries();
        System.out.println(amountSalaryMonth);
        System.out.println("c. Нахождение сотрудника с минимальной зарплатой");
        Employee employeeMinSalary = findMinSalaryEmployees();
        System.out.println(employeeMinSalary);
        System.out.println("c. Нахождение сотрудника с максимальной зарплатой");
        Employee employeeMaxSalary = findMaxSalaryEmployees();
        System.out.println(employeeMaxSalary);
        System.out.println("e. Расчет средней зарплаты");
        double averageSalary = calculateAverageSalary();
        System.out.println(averageSalary);
        System.out.println("f. Печать ФИО всех сотрудников");
        printFullName();
        // методы для повышенной сложности
        System.out.println("1. Индексация зарплаты");
        indexSalary(percentIndex);
        System.out.println("2a. Нахождение сотрудника с минимальной зарплатой в разрезе отдела");
        Employee employeeMinSalaryDept = findMinSalaryEmployeesDept(dept);
        System.out.println(employeeMinSalaryDept);
        System.out.println("2b. Нахождение сотрудника с максимальной зарплатой в разрезе отдела");
        Employee employeeMaxSalaryDept = findMaxSalaryEmployeesDept(dept);
        System.out.println(employeeMaxSalaryDept);
        System.out.println("2c. Расчет суммы затрат на зарплаты за месяц в разрезе отдела");
        double amountSalaryMonthDept = calculateSalariesDept(dept);
        System.out.println(amountSalaryMonthDept);
        System.out.println("2d. Расчет средней зарплаты по отделу");
        double averageSalaryDept = calculateAverageSalaryDept(dept);
        System.out.println(averageSalaryDept);
        System.out.println("2e. Индексация зарплаты по отделу");
        indexSalaryDept(dept, percentIndex);
        System.out.println("2f. Получение списка всех сотрудников отдела");
        printEmployeesDept(dept);
        System.out.println("3a. Получение списка всех сотрудников c зарплатой меньше числа");
        compareSalaryLessThanNumber(salaryComparison);
        System.out.println("3b. Получение списка всех сотрудников c зарплатой больше числа");
        compareSalaryOverNumber(salaryComparison);
    }

    // а. Получение списка всех сотрудников
    public static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    // b. Расчет суммы затрат на зарплаты за месяц
    public static double calculateSalaries() {
        double amountSalaryMonth = 0;
        for (int i = 0; i < employees.length; i++) {
            amountSalaryMonth += employees[i].getSalary();
        }
        return amountSalaryMonth;
    }

    // c. Нахождение сотрудника с минимальной зарплатой
    public static Employee findMinSalaryEmployees() {
        Employee employeeMinSalary = employees[0];
        double minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (minSalary >= employees[i].getSalary()) {
                employeeMinSalary = employees[i];
                minSalary = employees[i].getSalary();
            }
        }
        return employeeMinSalary;
    }

    // d. Нахождение сотрудника с максимальной зарплатой
    public static Employee findMaxSalaryEmployees() {
        Employee employeeMaxSalary = employees[0];
        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary <= employees[i].getSalary()) {
                employeeMaxSalary = employees[i];
                maxSalary = employees[i].getSalary();
            }
        }
        return employeeMaxSalary;
    }

    // e. Расчет средней зарплаты
    public static double calculateAverageSalary() {
        return calculateSalaries() / (double) employees.length;
    }

    // f. Печать ФИО всех сотрудников
    public static void printFullName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }

    // Повышенная сложность
    // 1. Индексация зарплаты
    public static void indexSalary(int percent) {
        double indexationPercentage = (double) percent / 100;
        double newSalary = 0;
        for (int i = 0; i < employees.length; i++) {

            newSalary = employees[i].getSalary() + employees[i].getSalary() * indexationPercentage;
            System.out.println("Сотрудник: " + employees[i].getName() +
                    ", зарплата до индексации: " + employees[i].getSalary() +
                    ", сумма индексации: " + employees[i].getSalary() * indexationPercentage +
                    ", зарплата после индексации: " + newSalary);
            employees[i].setSalary(newSalary);
        }
    }

    // 2a. Нахождение сотрудника с минимальной зарплатой в разрезе отдела
    public static Employee findMinSalaryEmployeesDept(String unit) {
        Employee employeeMinSalary = null;
        double minSalary = Integer.MAX_VALUE;
        int membersUnit = 0;
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary() &&
                    unit.equals(employees[i].getDepartment())) {
                employeeMinSalary = employees[i];
                minSalary = employees[i].getSalary();
                membersUnit++;
            }
        }
        if (membersUnit == 0) {
            System.out.println("Массив сотрудников отдела пуст");
            return null;
        }
        return employeeMinSalary;
    }

    // 2b. Нахождение сотрудника с максимальной зарплатой в разрезе отдела
    public static Employee findMaxSalaryEmployeesDept(String unit) {
        Employee employeeMaxSalary = null;
        double maxSalary = Integer.MIN_VALUE;
        int membersUnit = 0;
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary <= employees[i].getSalary() &&
                    unit.equals(employees[i].getDepartment())) {
                employeeMaxSalary = employees[i];
                maxSalary = employees[i].getSalary();
                membersUnit++;
            }
        }
        if (membersUnit == 0) {
            System.out.println("Массив сотрудников отдела пуст");
            return null;
        }
        return employeeMaxSalary;
    }

    // 2c. Расчет суммы затрат на зарплаты за месяц в разрезе отдела
    public static double calculateSalariesDept(String unit) {
        double amountSalaryMonth = 0;
        int membersUnit = 0;
        for (int i = 0; i < employees.length; i++) {
            if (unit.equals(employees[i].getDepartment())) {
                amountSalaryMonth += employees[i].getSalary();
                membersUnit++;
            }
        }
        if (membersUnit == 0) {
            System.out.println("Массив сотрудников отдела пуст");
            return 0;
        }
        return amountSalaryMonth;
    }

    // 2d. Расчет средней зарплаты по отделу
    public static double calculateAverageSalaryDept(String unit) {
        double averageSalary = 0;
        double amountSalaryMonth = 0;
        int numberEmployeesDept = 0;
        for (int i = 0; i < employees.length; i++) {
            if (unit.equals(employees[i].getDepartment())) {
                amountSalaryMonth += employees[i].getSalary();
                numberEmployeesDept++;
            }
        }
        averageSalary = amountSalaryMonth / numberEmployeesDept;
        if (numberEmployeesDept == 0) {
            System.out.println("Массив сотрудников отдела пуст");
            return 0;
        }
        return averageSalary;
    }

    // 2e. Индексация зарплаты по отделу
    public static void indexSalaryDept( String unit, double indexPercent) {
        double indexationPercentage = (double) indexPercent / 100;
        double newSalary = 0;
        int numberEmployeesDept = 0;
        for (int i = 0; i < employees.length; i++) {
            if (unit.equals(employees[i].getDepartment())) {
                newSalary = employees[i].getSalary() + employees[i].getSalary() * indexationPercentage;
                System.out.println("Сотрудник: " + employees[i].getName() + ", отдел № " + unit +
                        ", зарплата до индексации: " + employees[i].getSalary() +
                        ", сумма индексации: " + employees[i].getSalary() * indexationPercentage +
                        ", зарплата после индексации: " + newSalary);
                employees[i].setSalary(newSalary);
                numberEmployeesDept++;
            }
        }
        if (numberEmployeesDept == 0) {
            System.out.println("Массив сотрудников отдела пуст");
            return;
        }
    }

    // 2f. Получение списка всех сотрудников отдела
    public static void printEmployeesDept(String unit) {
        int numberEmployeesDept = 0;
        for (int i = 0; i < employees.length; i++) {
            if (unit.equals(employees[i].getDepartment())) {
                System.out.println(employees[i].getId() + " " + employees[i].getName() + " " +
                        employees[i].getSalary());
                numberEmployeesDept++;
            }
        }
        if (numberEmployeesDept == 0) {
            System.out.println("Массив сотрудников отдела пуст");
            return;
        }
    }

    // 3a. Получение списка всех сотрудников c зарплатой меньше числа
    public static void compareSalaryLessThanNumber(double comparisonSalary) {
        System.out.println("Сотрудники с зарплатой меньше " + comparisonSalary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < comparisonSalary) {
                System.out.println(employees[i].getId() + " " + employees[i].getName() + " " +
                        employees[i].getSalary());
            }
        }
    }

    // 3b. Получение списка всех сотрудников c зарплатой больше числа
    public static void compareSalaryOverNumber(double comparisonSalary) {
        System.out.println("Сотрудники с зарплатой больше " + comparisonSalary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > comparisonSalary) {
                System.out.println(employees[i].getId() + " " + employees[i].getName() + " " +
                        employees[i].getSalary());
            }
        }
    }
}