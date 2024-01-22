import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Fahima ", " Ahmadi", "Software Engineer", 221345.0);
        Employee e2 = new Employee("Safya ", "Hassani", "Al Developer", 2900000.00);
        Student s1 = new Student("Zarema", "Mohammadi ", 3.20);
        Student s2 = new Student("Darya ", "Qasimi ", 3.9);

        ArrayList<Person> people = new ArrayList<>();
        people.add(e1);
        people.add(e2);
        people.add(s1);
        people.add(s2);

        Collections.sort(people);

        printData(people);

    }

    public static void printData(Iterable<Person> people)
    {
        for (Person x : people)
        {
            System.out.println(x.toString() + " earns " + x.getPaymentAmount() + " tenge");
        }
    }
}
