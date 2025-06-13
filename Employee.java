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