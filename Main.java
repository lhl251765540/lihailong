package TEST2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import TEST.Employee;
import TEST1.SelfComparetor;

public class Main {
	
	public static void main(String[] args){
	
	Scanner s=new Scanner(System.in);
	
	SelfComparetor sf=new SelfComparetor();
	
	TreeSet<Employee> set=new TreeSet<Employee>(sf);
	
	System.out.println("欢迎来到员工管理系统");
	
	boolean flag=true;
	
	while(flag){
		
		 System.out.println("录入员工按1   删除员工按2  更新员工按3  查看员工按4");
		int userselect= s.nextInt();
		
		
		switch(userselect){
		
		case  1:
			System.out.println("请输入员工的工号");
			String employeeno=s.next();
			Employee fe=getPostionEmployee(set,employeeno);
			if(fe==null){
				System.out.println("请输入员工的名字");
				String name=s.next();
				Employee newe=new Employee(employeeno,name);
				set.add(newe);
				
			}
			else{
				System.out.println("您输入的员工号已经存在");
				
				
			}
		break;
		
		case 2:
			System.out.println("请输入要删除的员工号");
			String employeeno1=s.next();
			Employee fe1=getPostionEmployee(set,employeeno1);
		if(fe1!=null){
			
			
			set.remove(fe1);
			
		}
		else{
			
			System.out.println("您输入的员工号不存在");
			
			
		}
		break;
		case 3:
			System.out.println("请输入要更新的员工号");
			String employeeno2=s.next();
		
         Employee fe2= getPostionEmployee(set,employeeno2);
			
		if(fe2!=null){
			
			System.out.println("请输入新的员工名字");
			String newname=s.next();
			fe2.setEmployeename(newname);
			
		}
		else{
			
			System.out.println("您输入的员工号不存在");
			
			
		}
		break;
		
		case 4:
			for(Employee e:set){
	    	    System.out.println("--------------");
	    	    System.out.println(e.getEmployeeno());
	    	    System.out.println(e.getEmployeename());
	    	    System.out.println("--------------");
	    	    
	    	  
	    	  
	    	  
	      }
	   break;
		
		}
		
		System.out.println("继续请按1  退出按任意键");
		String  use=s.next();
		if(!use.equals("1")){
			
			break;
			
		}
		
		
		
	}
	
	
	

}
	public static Employee getPostionEmployee(TreeSet<Employee> set,String employeeno){
		
		Employee e=null;
		Iterator<Employee> iter=set.iterator();
		
		while(iter.hasNext()){
			
			Employee emp=iter.next();
			
			
			if(emp.getEmployeeno().equals(employeeno)){
				
				
				e=emp;
				
				break;
			}
			
		}
		return e;
		
	}
	
	
	
	
	
	
	
	
}