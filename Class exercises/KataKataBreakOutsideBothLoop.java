public class KataKataBreakOutsideBothLoop {

	public static void main (String... args ) {

	a : for (int counter =0; counter <= 10; counter = counter + 1){
		for (int count = 0; count < 5; count = count +1 ){
		
			if ( count < 3 ) {
				System.out.println ("inner loop"+ count)
				
			}else break a;
		}
		System.out.println ();
		System.out.println("outer loop"+counter);
	}
}
}

// a: ------ is called lebel

//it is used to break out and in of a loop

// always end it with 'a' right after the break.