package threadPoolExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadTask2 implements Runnable
 {
	 public void run()
	 {
		 System.out.println(Thread.currentThread().getName());
		 try {
			 Thread.sleep(1000);
			 System.out.println("--------------------------------------");
		 }
		 catch (Exception e) {
			System.out.println(e);		
			
		 }
		 
	 }
 }
public class Test2 {
	public static void main(String[] args) {
		MyThreadTask2 mt=new MyThreadTask2();
//		Thread thread=new Thread(mt);
//		thread.start();
		
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		for(int i=1;i<=10;i++)
		{
			executorService.submit(mt);
			
		}
		executorService.shutdown();
	}
}
