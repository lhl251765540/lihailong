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
	
	System.out.println("��ӭ����Ա������ϵͳ");
	
	boolean flag=true;
	
	while(flag){
		
		 System.out.println("¼��Ա����1   ɾ��Ա����2  ����Ա����3  �鿴Ա����4");
		int userselect= s.nextInt();
		
		
		switch(userselect){
		
		case  1:
			System.out.println("������Ա���Ĺ���");
			String employeeno=s.next();
			Employee fe=getPostionEmployee(set,employeeno);
			if(fe==null){
				System.out.println("������Ա��������");
				String name=s.next();
				Employee newe=new Employee(employeeno,name);
				set.add(newe);
				
			}
			else{
				System.out.println("�������Ա�����Ѿ�����");
				
				
			}
		break;
		
		case 2:
			System.out.println("������Ҫɾ����Ա����");
			String employeeno1=s.next();
			Employee fe1=getPostionEmployee(set,employeeno1);
		if(fe1!=null){
			
			
			set.remove(fe1);
			
		}
		else{
			
			System.out.println("�������Ա���Ų�����");
			
			
		}
		break;
		case 3:
			System.out.println("������Ҫ���µ�Ա����");
			String employeeno2=s.next();
		
         Employee fe2= getPostionEmployee(set,employeeno2);
			
		if(fe2!=null){
			
			System.out.println("�������µ�Ա������");
			String newname=s.next();
			fe2.setEmployeename(newname);
			
		}
		else{
			
			System.out.println("�������Ա���Ų�����");
			
			
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
		
		System.out.println("�����밴1  �˳��������");
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