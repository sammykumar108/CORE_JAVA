package genericsClasses_Programs;
class A<T>
{
	T a;
	A(T a)
	{
		this.a=a;
	}
	void show()
	{
		System.out.println(a);
	}
}
public class Demo {
	public static void main(String[] args) {
		A<String> ob1=new A<String> ("deepak");
		ob1.show();
		
		A<Integer> ob2=new A<Integer>(101);
		ob2.show();
	}
}
