import java.util.Comparator;

public class DepartComparator implements Comparator<Employee> {
	public int compare(Employee a, Employee b){
        int n = a.getDepartment().compareTo(b.getDepartment());
        if(n<0)
        	return -1;
        if(n>0)
        	return 1;
        return n;
	}
}
