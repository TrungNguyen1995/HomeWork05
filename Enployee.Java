public class Employee extends Person{
    private double exp;
    private String workPlace;

    public Employee(int id, String name, String address, int age, double exp, String workPlace) {
        super(id, name, address, age);
        this.exp = exp;
        this.workPlace = workPlace;
    }

    public Employee(String name, double exp, String workPlace) {
        super(name);
        this.exp = exp;
        this.workPlace = workPlace;
    }

    public Employee(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Employee{" + getId() + " - " + getName() + " - " + getAddress() + " - " + getAge() +
                "exp=" + exp +
                ", workPlace='" + workPlace + '\'' +
                '}';
    }
}
