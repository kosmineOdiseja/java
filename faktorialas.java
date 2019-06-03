import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class faktorialas {
	
	public static void main(String[] args) throws Exception {

		String thisLine = null;
		
		try {
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
			
			System.out.println ( "prasau iveskite skaiciu: " );
			String skaicius_str = br.readLine ();
			
			int skaicius = Integer.parseInt ( skaicius_str );
						
			System.out.println ( "Ivestas skaicius : " + skaicius );
			
			int fakt = 1; 
			for ( int i = 1; i <=skaicius ; i++) {
					fakt = fakt * i;
			}	
		System.out.println (fakt);
			

		} catch( Exception e ) {
				
			e.printStackTrace();
		}

	}			
}