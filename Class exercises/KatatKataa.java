import java.util.Scanner;

public class KataKataa {
	public static void main (String... args ){
	
	for (int counter = 0; counter <10; counter++)
	
	boolean isCounterOdd= counter % 2 != 0;
	if (isCounterOdd) {

		System.out.println("skipped: "+counter);
		continue;
	}

	System.out.println (counter)
}
}