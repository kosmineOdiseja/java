import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class darbuotojas {
	
	public static void main(String[] args) throws Exception {

		String thisLine = null;
		
		try {
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
			
			System.out.println ( "atlyginimas, kuris bus mokamas kas menesi?" );
			String atlyginimas_str = br.readLine ();
			
			double atlyginimas = Double.parseDouble ( atlyginimas_str );
						
			System.out.println ( "Ivestas atlyginimas : " + atlyginimas + " euru ");
			
			System.out.println ( "atlyginimas, kas menesi bus didinamas?" );
			
			String didinimas_str = br.readLine ();
			
			double didinimas = Double.parseDouble ( didinimas_str );
			
			System.out.println ( "ivestas atlyginimo didinamas : " + didinimas + " euru "  );
			
			
			for (int i=0; i< 12; i++) {
				
				double atlyginimas_did_men = atlyginimas += didinimas;
					
				System.out.println ( "atlyginimo didinimas per metus laiko: " + atlyginimas_did_men );
			}

		} catch( Exception e ) {
				
			e.printStackTrace();
		}

	}			
}