package comperator_Programs;

import java.util.Comparator;
import java.util.TreeSet;

class Student
{
	int rollno;
	String name;
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	@Override
	public String toString()
	{
		return rollno+"-"+name;
	}
}
class SortByName implements Comparator
{
	@Override
	public int compare(Object o1,Object o2)
	{
		Student ss=(Student) o1;
		Student sss=(Student) o2;
		int i=ss.name.compareTo(sss.name);
		return -i;
	}
}
class SortByRollno implements Comparator
{
	@Override
	public int compare(Object o1,Object o2)
	{
		Student ss=(Student) o1;
		Student sss=(Student) o2;
		Integer i1=new Integer(ss.rollno);
		Integer i2=new Integer(sss.rollno);
		int i=i1.compareTo(i2);
		return -i;
	}
}
public class Test4 {
	public static void main(String[] args) 
	{
		Student s1=new Student(101,"deepak");
		Student s2=new Student(102,"deepeesh");
		Student s3=new Student(103,"rahul");
		Student s4=new Student(104,"amit");
		Student s5=new Student(105,"priya");
		
		TreeSet ts= new TreeSet(new SortByName());
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		System.out.println(ts);
		
		TreeSet ts1= new TreeSet(new SortByRollno());
		ts1.add(s1);
		ts1.add(s2);
		ts1.add(s3);
		ts1.add(s4);
		ts1.add(s5);
		System.out.println(ts1);
		
		
	}
}
