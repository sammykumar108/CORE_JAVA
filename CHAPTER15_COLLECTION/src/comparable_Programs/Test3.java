package comparable_Programs;
//SORT BY ROLLNO
import java.util.TreeSet;

class Student1 implements Comparable
{
	int rollno;
	String name;
	public Student1(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	@Override
	public int compareTo(Object o)
	{
		Student1 st=(Student1) o;
		Integer i1=new Integer(this.rollno);
		Integer i2=new Integer(st.rollno);
//		if(i1>i2)
//		{
//			return 1;
//		}
//		else if(i1<i2)
//		{
//			return -1;
//		}
//		else
//		{
//			return 0;
//		}
		int val=i1.compareTo(i2);
		return -val;
	}
	@Override
	public String toString()
	{
		return rollno+"-"+name;
	}
}	
public class Test3 {
	public static void main(String[] args) {
		Student s1=new Student(101,"deepak");
		Student s5=new Student(105,"priya");
		Student s3=new Student(103,"rahul");
		Student s4=new Student(104,"amit");
		Student s2=new Student(102,"deepesh");
		
		
		TreeSet ts=new TreeSet();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		System.out.println(ts);
	}
}
