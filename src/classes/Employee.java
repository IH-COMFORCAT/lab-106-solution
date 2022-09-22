package classes;

public class Employee {

    private final double MIN_SALARY = 24000;

    private double salary;
    private String name;
    private String department;

    public Employee(double salary, String name, String department) {
        setName(name);
        this.department = department;
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < MIN_SALARY) this.salary = MIN_SALARY;
        else this.salary = salary;
    }

    protected void setInternSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}' + "\n";
    }
}
