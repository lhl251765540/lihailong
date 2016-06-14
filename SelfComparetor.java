package TEST1;

import java.util.Comparator;
import TEST.Employee;

public class SelfComparetor implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		String employeeno1=o1.getEmployeeno();
		String employeeno2=o2.getEmployeeno();
		
		
		int no1=Integer.parseInt(employeeno1);
		int no2=Integer.parseInt(employeeno2);
		
		
		
		if(no1>no2){
			
			return -1;
		}
		if(no1<no2){
			
			return 1;
		}
		
		
		
		
		
		
		return 0;
	}

	
	
	
}
