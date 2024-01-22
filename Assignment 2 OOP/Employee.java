public class Employee extends Person
{
    private String position;
    private double salary;

    @Override
    public String toString()
    {
        return "Employee: " + super.toString();
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public String getPosition()
    {
        return position;
    }

    public double getSalary()
    {
        return salary;
    }

    public Employee()
    {
        super();
    }

    public Employee(String name, String surname, String position, double salary)
    {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    public double getPaymentAmount()
    {
        return salary;
    }
}

