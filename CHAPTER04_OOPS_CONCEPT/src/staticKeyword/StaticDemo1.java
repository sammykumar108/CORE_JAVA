package staticKeyword;

// If we declare any variable as 'static', it is known as static variable.
// ->static variables gets memory allocated in method area at the time of class loading.

class Employee
{
	int empId;
	String empName;
	static String empComName="Smart Programming";
	
	public Employee(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	void display()
	{
		System.out.println("--------Employee Details----------");
		System.out.println("Employee ID:" +empId);
		System.out.println("Employee Name:" +empName);
		System.out.println("Employee Company Name:" +empComName);
		System.out.println();
	}
}
public class StaticDemo1 {
	public static void main(String[] args) {
		Employee e1=new Employee(101, "Deepak");
		Employee e2=new Employee(102, "Deepesh");
		Employee e3=new Employee(103, "Rahul");
		
		e1.display();
		e2.display();
		e3.display();
				
	}
}
