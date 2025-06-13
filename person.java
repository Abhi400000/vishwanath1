import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
class Person {
private String name;
private Date dob;
private int age;
public Person(String name, String dob) throws ParseException {

this.name = name;
this.dob = new SimpleDateFormat(&quot;dd-MM-yyyy&quot;).parse(dob);
this.age = calculateAge();
}
private int calculateAge() {
Date today = new Date();
long ageInMillis = today.getTime() - dob.getTime();
return (int) (ageInMillis / (1000L * 60 * 60 * 24 * 365));
}
public void displayPersonDetails() {
System.out.println(&quot;Name: &quot; + name);
System.out.println(&quot;Date of Birth: &quot; + new SimpleDateFormat(&quot;dd-MM-
yyyy&quot;).format(dob));
System.out.println(&quot;Age: &quot; + age);
}
public static void main(String[] args) throws ParseException {
Person person = new Person(&quot;John Doe&quot;, &quot;10-05-1985&quot;);
person.displayPersonDetails();
}
}
class Employee extends Person {
private int empId;
private double salary;
public Employee(String name, String dob, int empId, double salary) throws
ParseException {
super(name, dob);
this.empId = empId;
this.salary = salary;
}
public void displayEmployeeDetails() {
displayPersonDetails();
System.out.println(&quot;Employee ID: &quot; + empId);
System.out.println(&quot;Salary: $&quot; + salary);
}
public static void main(String[] args) throws ParseException {
Employee emp = new Employee(&quot;Alice&quot;, &quot;15-08-1990&quot;, 101, 75000);
emp.displayEmployeeDetails();
}
}