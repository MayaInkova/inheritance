public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }
    public double calculateBonus() {
        // Основен метод за изчисляване на бонус: 10% от заплатата
        return salary * 0.10;
    }

    public void addBonus() {
        double bonus = calculateBonus();
        salary += bonus;
        System.out.println(name + " received a bonus of " + bonus + ". New salary: " + salary);
    }
}
//ndn
