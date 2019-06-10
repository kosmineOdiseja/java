import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class skaiciavimasIsFailo {
	
	public static void main(String[]args) throws Exception {
			
		String thisLine = null;
		
		try {
			BufferedReader br = new BufferedReader( new FileReader( "duomenys.txt" ) );
			
			System.out.println ( "duomenu failo turinys:");
			double[] skaiciai = new double[10000];
			int kiekis = 0;
			
			while ( ( thisLine = br.readLine() ) != null) {
				
				System.out.println ( thisLine );
				
				String[] skaiciu_strs = thisLine.split (",");
				
				for ( int i=0; i < skaiciu_strs.length; i+=1) {
					
					skaiciai [ kiekis ] =
					
						Double.parseDouble (skaiciu_strs [i] );
					kiekis+=1;
				}
			}
			System.out.println("nuskaityta " + kiekis + " skaiciu " );
				
		} catch ( Exception e ) {
					
			e.printStackTrace();
			
		}
		 
	}
	
	 
}
				
				
					