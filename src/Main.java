public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        int[] counterID = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Employee[] employees = new Employee[10];

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
        int amountSalaryMonth = 0;
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
        int amountSalaryMonth = 0;
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
}