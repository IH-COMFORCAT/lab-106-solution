package classes;

public class Intern extends Employee {
    private final double MAX_SALARY = 20000;

    private int numMonths;

    public Intern(double salary, String name, String department, int numMonths) {
        super(salary, name, department);
        this.numMonths = numMonths;
    }

    @Override
    public void setSalary(double salary) {
        if(salary > MAX_SALARY) {
            System.err.println("The salary of the intern "+ super.getName()
                    + " can't be higher than " + MAX_SALARY);
            super.setInternSalary(MAX_SALARY);
        } else super.setInternSalary(salary);
    }

    @Override
    public String toString() {
        return "Intern{" +
                "salary=" + super.getSalary() +
                ", name='" + super.getName() + '\'' +
                ", department='" + super.getDepartment() + '\'' +
                "numMonths=" + numMonths +
                '}' + "\n";
    }
}
