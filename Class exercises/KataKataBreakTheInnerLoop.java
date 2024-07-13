public class KataKataBreakTheInnerLoop {

	public static void main (String... args ) {

	for (int counter =0; counter <= 10; counter = counter + 1){
		for (int count = 0; count < 5; count = count +1 ){
		
			if ( count < 3 ) {
				System.out.println ("inner loop"+ count)
				
			}else break;
		}
		System.out.println ();
		System.out.println("outer loop"+counter);
	}
}
}