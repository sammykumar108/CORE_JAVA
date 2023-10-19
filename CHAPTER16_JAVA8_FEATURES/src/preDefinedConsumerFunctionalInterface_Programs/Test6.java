package preDefinedConsumerFunctionalInterface_Programs;

import java.util.function.Consumer;

public class Test6 {
	public static void main(String[] args) {
		Consumer<String> c=str->System.out.println("hi :" +str.concat("@gmail.com"));
		c.accept("deepak");
		c.accept("rahul");
	}
}
