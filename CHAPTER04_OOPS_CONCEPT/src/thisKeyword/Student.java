package thisKeyword;

public class Student {
	int rollNo;
	String name;
	Student(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	void show()
	{
		System.out.println("Student RollNo:" +rollNo);
		System.out.println("Student Name:" +name);
	}
	public static void main(String[] args) {
		Student s1=new Student(101,"deepak");
		s1.show();
	}
	
}
