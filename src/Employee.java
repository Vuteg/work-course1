import java.util.Objects;

public class Employee {

    private String name;
    private int department;
    private double salary;
    private int id;
    public static int size = 1;
    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id=size;
        size++;
    }
    public Employee() {

    }
    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
    public int getId () {
        return id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary =  salary;
    }

    @Override
    public String toString() {
        return "Ф.И.О - " + name + ", отдел " + department + ", Зарплата " + salary + " Рублей" + ", id- " + id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employees = (Employee) o;
        return Objects.equals(name, employees.name);}
    @Override
    public int hashCode() {
        return Objects.hash(name);}
}
