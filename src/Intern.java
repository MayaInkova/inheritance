public class Intern extends Employee {
    private String mentorName;

    public Intern(String name, double salary, String mentorName) {
        super(name, salary);
        this.mentorName = mentorName;
    }

    public String getMentorName() {
        return mentorName;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working on training tasks under the guidance of " + mentorName + ".");
    }

    @Override
    public double calculateBonus() {
        // Бонус за стажанти: 5% от заплатата
        return getSalary() * 0.05;
    }
}