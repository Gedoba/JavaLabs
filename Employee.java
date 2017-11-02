import java.util.*;
public class Employee {
	private int ID;
	private double salary;
	private enum Dep {IT, HR, Accounting, Manufacturing, Sales, Maintanance};
	private Dep department;
	
	public static int idcount = 1;
	
	public Employee() {
		this.ID=idcount;
		idcount++;
		this.salary = Math.round(Math.random()*10000 * 100) / 100;
		this.department = Dep.values()[new Random().nextInt(Dep.values().length)];
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", salary=" + salary + ", department=" + department + "]\n";
	}
	
	public String getDepartment() {
		return department.name();
	}

	public static ArrayList<Employee> merge (ArrayList<Employee> a, ArrayList<Employee> b) { 
		ArrayList<Employee> C = new ArrayList<Employee>();
		C.addAll(a);
		C.addAll(b);
		
		a.clear();
		b.clear();
		
		return C;
	}
}
