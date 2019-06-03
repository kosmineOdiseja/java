import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FibonacioSekaRekursija {

	public static int fibSeka (int nr) {
		
		int fib_sk = 0;
		
		if ((nr==1) || (nr==2)) {
			
			fib_sk=1;
			
		} else{
			
			fib_sk=fibSeka (nr - 2) + fibSeka (nr - 1 );
			
		}
		
		return fib_sk;
	}	
	
	public static void main(String[] args) throws Exception {

		String thisLine = null;
		
		try {
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
			
			System.out.println ( "prasau iveskite skaiciu is fibonacio sekos: " );
			String skaicius_str = br.readLine ();
			
			int skaicius = Integer.parseInt ( skaicius_str );
						
			System.out.println ( "Ivestas skaicius : " + skaicius );
			

			
			System.out.println (" fibonacio sekos skaicius yra : " + fibSeka ( skaicius ) );
			

		} catch( Exception e ) {
				
			e.printStackTrace();
		}

	}			
}