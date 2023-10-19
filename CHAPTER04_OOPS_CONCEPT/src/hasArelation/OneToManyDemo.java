package hasArelation;
class Student 
{
	String id;
	String name;
	Courses[] courses;
	
	Student(String id1,String name1,Courses[] courses1) {
		id=id1;
		name=name1;
		courses=courses1;
	}
	void getStudentDetails()
	{
		System.out.println("Student ID:" +id);
		System.out.println("Student Name:" +name);
		System.out.println("Student Courses Details" );
		
		for(int i=0;i<courses.length;i++)
		{
			System.out.println("Course" +(i+1) +":" +"Course ID:" 
		+courses[i].courseid+"& Course Name:" +courses[i].coursename);
		}
		System.out.println("------------------------------------------");
	}
}
class Courses
{
	String courseid;
	String coursename;
	Courses(String courseid1,String coursename1) {
		courseid=courseid1;
		coursename=coursename1;
	}
}
public class OneToManyDemo {
	public static void main(String[] args) {
		Courses c1=new Courses("J1","Java Programming");
		Courses c2=new Courses("C1","C Programming");
		Courses c3=new Courses("P1","Python Programming");
		Courses[] courses1= {c1,c2,c3};
		
		Student s1=new Student("101", "deepak", courses1);
		s1.getStudentDetails();
		
		Courses c4=new Courses("Ph1", "PHP Programming");
		Courses c5=new Courses("H1", "HTML");
		
		Courses[] courses2={c4,c5};
		Student s2=new Student("102", "deepesh", courses2);
		s2.getStudentDetails();
	}
}
