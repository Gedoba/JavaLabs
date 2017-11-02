import java.util.*;
public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> companyA = new ArrayList<Employee>();
		ArrayList<Employee> companyB = new ArrayList<Employee>();
		
		for(int x = 0; x<15 ; x++) {
			companyA.add(new Employee());
		}
		for(int x = 0; x<20 ; x++) {
			companyB.add(new Employee());
		}
		//System.out.println(companyA);
		//System.out.println(companyB);
		
		ArrayList<Employee> companyC = new ArrayList<Employee>();
		
		companyC = Employee.merge(companyA, companyB);
		
		//System.out.println(companyC);
		
		Collections.sort(companyC, new DepartComparator());
		System.out.println(companyC);
		
		Manager manager = new Manager();
		
		//add manager to good spot
		
		System.out.println(manager);
		
		//companyC.add(n, manager);
		System.out.println(companyC);
	}

}
