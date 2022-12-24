public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        int[] counterID = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Employee[] employees = new Employee[10];
        String dept = "4"; // отдел
        double percentIndex = 0.2; // процент индексации
        double salaryComparison = 50000;

        employees[0] = new Employee(counterID[0], "Меншиков Александр Данилович ", "1",
                90000);
        employees[1] = new Employee(counterID[1], "Васильев Василий Васильевич", "2",
                10000);
        employees[2] = new Employee(counterID[2], "Быкова Елена Петровна", "3",
                20000);
        employees[3] = new Employee(counterID[3], "Петрова Зинаида Ивановна", "4",
                30000);
        employees[4] = new Employee(counterID[4], "Иванов Иван Иванович", "5",
                40000);
        employees[5] = new Employee(counterID[5], "Сидоров Петр Петрович", "1",
                50000);
        employees[6] = new Employee(counterID[6], "Петров Николай Алексеевич", "2",
                60000);
        employees[7] = new Employee(counterID[7], "Морозова Марья Ивановна", "3",
                70000);
        employees[8] = new Employee(counterID[8], "Потёмкин Григорий  Александрович ", "4",
                100000);
        employees[9] = new Employee(counterID[9], "Чухиль Светлана Дмитриевна", "5",
                80000);

        printEmployees(employees);
        System.out.println();
        calculateSalaries(employees);
        System.out.println();
        findMinSalaryEmployees(employees);
        System.out.println();
        findMaxSalaryEmployees(employees);
        System.out.println();
        calculateAverageSalary(employees);
        System.out.println();
        printFullName(employees);
        System.out.println();

        // методы для повышенной сложности
        indexSalary(employees);
        System.out.println();
        findMinSalaryEmployeesDept(employees, dept);
        System.out.println();
        findMaxSalaryEmployeesDept(employees, dept);
        System.out.println();
        calculateSalariesDept(employees, dept);
        System.out.println();
        calculateAverageSalaryDept(employees, dept);
        System.out.println();
        indexSalaryDept(employees, dept, percentIndex);
        System.out.println();
        printEmployeesDept(employees, dept);
        System.out.println();
        compareSalaryLessThanNumber(employees, salaryComparison);
        System.out.println();
        compareSalaryOverNumber(employees, salaryComparison);
    }

    // а. Получение списка всех сотрудников
    public static void printEmployees(Employee[] staffers) {
        System.out.println("а. Получение списка всех сотрудников");
        for (int i = 0; i < staffers.length; i++) {
            System.out.println(staffers[i]);
        }
    }

    // b. Расчет суммы затрат на зарплаты за месяц
    public static void calculateSalaries(Employee[] staffers) {
        System.out.println("b. Расчет суммы затрат на зарплаты за месяц");
        double amountSalaryMonth = 0;
        for (int i = 0; i < staffers.length; i++) {
            amountSalaryMonth += staffers[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты за месяц составила " + amountSalaryMonth + " рублей");
    }

    // c. Нахождение сотрудника с минимальной зарплатой
    public static void findMinSalaryEmployees(Employee[] staffers) {
        System.out.println("c. Нахождение сотрудника с минимальной зарплатой");
        String employeeMinSalary = "";
        double minSalary = staffers[0].getSalary();
        for (int i = 0; i < staffers.length; i++) {
            if (minSalary >= staffers[i].getSalary()) {
                employeeMinSalary = staffers[i].getEmployees();
                minSalary = staffers[i].getSalary();
            }
        }
        System.out.println("Минимальную зарплату - " + minSalary +
                " получает сотрудник " + employeeMinSalary);
    }

    // d. Нахождение сотрудника с максимальной зарплатой
    public static void findMaxSalaryEmployees(Employee[] staffers) {
        System.out.println("c. Нахождение сотрудника с максимальной зарплатой");
        String employeeMaxSalary = "";
        double maxSalary = staffers[0].getSalary();
        for (int i = 0; i < staffers.length; i++) {
            if (maxSalary <= staffers[i].getSalary()) {
                employeeMaxSalary = staffers[i].getEmployees();
                maxSalary = staffers[i].getSalary();
            }
        }
        System.out.println("Максимальную зарплату - " + maxSalary +
                " получает сотрудник " + employeeMaxSalary);
    }

    // e. Расчет средней зарплаты
    public static void calculateAverageSalary(Employee[] staffers) {
        System.out.println("e. Расчет средней зарплаты");
        double averageSalary = 0;
        double amountSalaryMonth = 0;
        for (int i = 0; i < staffers.length; i++) {
            amountSalaryMonth += staffers[i].getSalary();
        }
        averageSalary = (double) amountSalaryMonth / staffers.length;
        System.out.println("Средняя зарплата за месяц составляет - " +
                averageSalary);
    }

    // f. Печать ФИО всех сотрудников
    public static void printFullName(Employee[] staffers) {
        System.out.println("f. Печать ФИО всех сотрудников");
        for (int i = 0; i < staffers.length; i++) {
            System.out.println(staffers[i].getEmployees());
        }
    }

    // Повышенная сложность
    // 1. Индексация зарплаты
    public static void indexSalary(Employee[] staffers) {
        System.out.println("1. Индексация зарплаты");
        double indexationPercentage = (double) 10 / 100;
        double newSalary = 0;
        for (int i = 0; i < staffers.length; i++) {

            newSalary = staffers[i].getSalary() + staffers[i].getSalary() * indexationPercentage;
            System.out.println("Сотрудник: " + staffers[i].getEmployees() +
                    ", зарплата до индексации: " + staffers[i].getSalary() +
                    ", сумма индексации: " + staffers[i].getSalary() * indexationPercentage +
                    ", зарплата после индексации: " + newSalary);
            staffers[i].setSalary(newSalary);
        }
    }

    // 2a. Нахождение сотрудника с минимальной зарплатой в разрезе отдела
    public static void findMinSalaryEmployeesDept(Employee[] staffers, String unit) {
        System.out.println("2a. Нахождение сотрудника с минимальной зарплатой в разрезе отдела");
        String employeeMinSalary = "";
        double minSalary = staffers[0].getSalary();
        for (int i = 0; i < staffers.length; i++) {
            if (minSalary >= staffers[i].getSalary() &&
                    unit.equals(staffers[i].getDepartment())) {
                employeeMinSalary = staffers[i].getEmployees();
                minSalary = staffers[i].getSalary();
            }
        }
        System.out.println("В отделе № " + unit + " минимальную зарплату - " + minSalary +
                " получает сотрудник " + employeeMinSalary);
    }

    // 2b. Нахождение сотрудника с максимальной зарплатой в разрезе отдела
    public static void findMaxSalaryEmployeesDept(Employee[] staffers, String unit) {
        System.out.println("2b. Нахождение сотрудника с максимальной зарплатой в разрезе отдела");
        String employeeMaxSalary = "";
        double maxSalary = 0;
        for (int i = 0; i < staffers.length; i++) {
            if (maxSalary <= staffers[i].getSalary() &&
                    unit.equals(staffers[i].getDepartment())) {
                employeeMaxSalary = staffers[i].getEmployees();
                maxSalary = staffers[i].getSalary();
            }
        }
        System.out.println("В отделе № " + unit + " максимальную зарплату - " + maxSalary +
                " получает сотрудник " + employeeMaxSalary);
    }

    // 2c. Расчет суммы затрат на зарплаты за месяц в разрезе отдела
    public static void calculateSalariesDept(Employee[] staffers, String unit) {
        System.out.println("2c. Расчет суммы затрат на зарплаты за месяц в разрезе отдела");
        double amountSalaryMonth = 0;
        for (int i = 0; i < staffers.length; i++) {
            if (unit.equals(staffers[i].getDepartment())) {
                amountSalaryMonth += staffers[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты за месяц в отделе № " +
                unit+ " составила " + amountSalaryMonth + " рублей");
    }

    // 2d. Расчет средней зарплаты по отделу
    public static void calculateAverageSalaryDept(Employee[] staffers, String unit) {
        System.out.println("2d. Расчет средней зарплаты по отделу");
        double averageSalary = 0;
        double amountSalaryMonth = 0;
        int numberEmployeesDept = 0;
        for (int i = 0; i < staffers.length; i++) {
            if (unit.equals(staffers[i].getDepartment())) {
                amountSalaryMonth += staffers[i].getSalary();
                numberEmployeesDept++;
            }
        }
        averageSalary = (double) amountSalaryMonth / numberEmployeesDept;
        System.out.println("Средняя зарплата за месяц в отделе № " + unit +
                " составляет - " + averageSalary);
    }

    // 2e. Индексация зарплаты по отделу
    public static void indexSalaryDept(Employee[] staffers, String unit, double indexPercent) {
        System.out.println("2e. Индексация зарплаты по отделу");
        double newSalary = 0;
        for (int i = 0; i < staffers.length; i++) {
            if (unit.equals(staffers[i].getDepartment())) {
                newSalary = staffers[i].getSalary() + staffers[i].getSalary() * indexPercent;
                System.out.println("Сотрудник: " + staffers[i].getEmployees() + ", отдел № " + unit +
                        ", зарплата до индексации: " + staffers[i].getSalary() +
                        ", сумма индексации: " + staffers[i].getSalary() * indexPercent +
                        ", зарплата после индексации: " + newSalary);
                staffers[i].setSalary(newSalary);
            }
        }
    }

    // 2f. Получение списка всех сотрудников отдела
    public static void printEmployeesDept(Employee[] staffers, String unit) {
        System.out.println("2f. Получение списка всех сотрудников отдела");
        for (int i = 0; i < staffers.length; i++) {
            if (unit.equals(staffers[i].getDepartment())) {
                System.out.println(staffers[i].getId() + " " + staffers[i].getEmployees() + " " +
                        staffers[i].getSalary());
            }
        }
    }

    // 3a. Получение списка всех сотрудников c зарплатой меньше числа
    public static void compareSalaryLessThanNumber(Employee[] staffers, double comparisonSalary) {
        System.out.println("3a. Получение списка всех сотрудников c зарплатой меньше числа");
        System.out.println("Сотрудники с зарплатой меньше " + comparisonSalary);
        for (int i = 0; i < staffers.length; i++) {
            if (staffers[i].getSalary() < comparisonSalary) {
                System.out.println(staffers[i].getId() + " " + staffers[i].getEmployees() + " " +
                        staffers[i].getSalary());
            }
        }
    }

    // 3b. Получение списка всех сотрудников c зарплатой больше числа
    public static void compareSalaryOverNumber(Employee[] staffers, double comparisonSalary) {
        System.out.println("3b. Получение списка всех сотрудников c зарплатой больше числа");
        System.out.println("Сотрудники с зарплатой больше " + comparisonSalary);
        for (int i = 0; i < staffers.length; i++) {
            if (staffers[i].getSalary() > comparisonSalary) {
                System.out.println(staffers[i].getId() + " " + staffers[i].getEmployees() + " " +
                        staffers[i].getSalary());
            }
        }
    }
}