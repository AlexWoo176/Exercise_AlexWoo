package alex.employee;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, 10000000, "Woo", "Alex");
        System.out.println("Information of employee 1:  ");
        System.out.println("FullName: " + emp1.getFullName());
        System.out.println(emp1.toString());
        System.out.println("Salary up to: " + emp1.upToSalary(10));
    }
}
