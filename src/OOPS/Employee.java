package OOPS;

public class Employee {
	
	 int empid;
	String empname;
	int salary;
	String address;
	
	void emp1()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(address);
	}

	public static void main(String[] args) {
	
		Employee e=new Employee();
		
		e.empid=123;
		e.empname="Navya";
		e.salary=20000;
		e.address="qweqwe jhcuaad";
		e.emp1();
		
		Employee e1=new Employee();
		e1.empid=1234;
		e1.empname="Navyaa";
		e1.salary=200000;
		e1.address="qweqwe jhcuaadyh";
		e1.emp1();

	}

}
