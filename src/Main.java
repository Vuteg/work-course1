public class Main {

    public static Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        Employee employee = new Employee();

        Employee employee1 = employees[0] = new Employee("Медведев Дмитрий Анатольевич", 1, 20_500.0);
        Employee employee2 = employees[1] = new Employee("Песков Дмитрий Сергеевич", 1, 25_450.0);
        Employee employee3 = employees[2] = new Employee("Жириновский Владимир Вольфович", 2, 24_300.0);
        Employee employee4 = employees[3] = new Employee("Зюганов Геннадий Андреевич", 2, 30_901.5);
        Employee employee5 = employees[4] = new Employee("Лавров Сергей Викторович", 3, 30_069.0);
        Employee employee6 = employees[5] = new Employee("Матвиенко Валентина Ивановна", 3, 15_501.5);
        Employee employee7 = employees[6] = new Employee("Володин Вячеслав Викторович", 4, 10_201.1);
        Employee employee8 = employees[7] = new Employee("Мишустин Михаил Владимирович", 4, 35_300.0);
        Employee employee9 = employees[8] = new Employee("Шойгу Сергей Кужугетович", 5, 40_120.0);
        Employee employee10 = employees[9] = new Employee("Сечин Игорь Иванович", 5, 28_450.0);

        employee2.setSalary(9_500.0);
        employee8.setSalary(20050.5);
        employee1.setDepartment(4);

        System.out.println(employee7.getId());
        System.out.println(employee4.getSalary());
        System.out.println(employee10.getName());
        System.out.println(employee3.getDepartment());
        System.out.println();

        PrintAllEmployee();// список всех сотрудников со всеми имеющимися по ним данными
        System.out.println();

        System.out.println("Сумма всех зарплат за месяц, состовляет: " + PrintAllSumSalary() + " Рублей");//общая сумма затрат на зарплаты в месяц
        System.out.println();

        System.out.println("Среди всех сотрудников минимальная зарплата у " + PrintMinimumSalary() + " рублей ");//Сотрудник с минимальной зарплатой
        System.out.println("Минимальная зарплата: " + MinSalary() + " рублей");//Минимальная зарплпта
        System.out.println();

        System.out.println("Среди всех сотрудников максимальная зарплата у " +PrintMaximumSalary() + " рублей ");//Сотрудник с максимальной зарплатой
        System.out.println("Максимальная зарплата: " + MaxSalary() + " рублей");//Максимальная зарплата
        System.out.println();

        System.out.println("Среднее значение зарплат, " + PrintAverageSalary() + " рублей");//среднее значение зарплат
        System.out.println();

        PrintAllNameEmployees();// Ф. И. О. всех сотрудников


//    +    1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
//    +    2. Посчитать сумму затрат на зарплаты в месяц.
//    +    3. Найти сотрудника с минимальной зарплатой.
//    +    4. Найти сотрудника с максимальной зарплатой.
//    +    5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
//    +    6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
//

    }
    public static void PrintAllEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }
    public static double PrintAllSumSalary() {
        double allSalary = 0;
        for (int i = 0; i < employees.length; i++)
            allSalary += employees[i].getSalary();
        return allSalary;
    }

    public static String PrintMinimumSalary() {

        String nick = "";
        double min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++){
            if(employees[i].getSalary() < min){
                min = employees[i].getSalary();
                nick = employees[i].getName();
            }
        }
        return nick + ", " + min;
    }
    public static double MinSalary() {
        double min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    public static String PrintMaximumSalary() {
        String nick = "";
        double max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary() > max){
                max = employees[i].getSalary();
                nick = employees[i].getName();
            }
        }
        return nick + ", " + max;
    }
    public static double MaxSalary() {
        double max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    public static double PrintAverageSalary(){
        double averageMeaning = PrintAllSumSalary();
        averageMeaning /= employees.length;
        return averageMeaning;
    }
    public static void PrintAllNameEmployees(){
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }

}