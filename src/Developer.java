public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is writing code in " + programmingLanguage + ".");
    }
    @Override
    public double calculateBonus() {
        // Бонус за разработчици: 12% от заплатата
        return getSalary() * 0.12;
    }
}
