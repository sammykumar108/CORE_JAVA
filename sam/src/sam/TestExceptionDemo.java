package sam;

public class TestExceptionDemo {

	public static void main(String[] args) {
		try{
		    demoMethod();
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		foobar();
	}

	public static void demoMethod(){
		
	}
	
	public static void foobar() throws NullPointerException{
		
	}
}
