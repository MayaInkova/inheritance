public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing a team of " + teamSize + " people.");
    }
    @Override
    public double calculateBonus() {
        // Бонус за мениджъри: 15% от заплатата + 100 за всеки член на екипа
        return getSalary() * 0.15 + teamSize * 100;
    }
}