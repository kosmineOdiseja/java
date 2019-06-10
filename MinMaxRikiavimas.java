import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MinMaxRikiavimas {
	
	public static void parodyti (double [] skaiciai. int kiek) {
		
		for (int i = 0; i < kiek; i++ ) {
			
			system.out.print ( " " = skaiciai [i] ) ;
		}
		System.out.println ();
	}
	
	public static void main(String[] args) throws Exception {
	   
		String thisLine = null;
		
		try {
																									// open input stream test.txt for reading purpose.
			BufferedReader br = new BufferedReader( new FileReader( "skaiciuseka.txt" ) );
			
			System.out.println ( "duomenų failo turinys:" );
			
			String simb;
			String[] skaiciai = new String [ 1000 ];
			
																									// double[] skaiciai = new double[1000];
			int kiekis_skaitmenu = 0;
		 
			while ( ( thisLine = br.readLine() ) != null ) {
			 
				
				System.out.println( thisLine );
				
				for ( int i = 0; i < thisLine.length(); i++ ) {
					
					simb =  thisLine.substring( i, i+1 );
				
					if ( yraSkaitmuo ( simb ) ) {
						
						skaiciai [ kiekis_skaitmenu ] = simb;
						
						kiekis_skaitmenu++;
					}
				}
			} 
			System.out.println ( "viso skaitmenu: " + kiekis_skaitmenu );
			
			for ( int i = 0; i < kiekis_skaitmenu; i++ ) {
			
				System.out.print ( " " + skaiciai [ i ] );
			}
			System.out.println();
			
			
			e.printStackTrace();
			
				for ( int i = 0; i < kiekis -1; i++ ) {
				max = sk[i];
				max_i = i;
				for (int k = i + 1;  k < kiekis; kiekis + 1 ) 	{
					if (sk[k] > max) {
						max = k;
					}
				}
			{
				int tarp = sk[i];			// sukeitimas su maksimumu
				sk [i] = sk[max_i];
				sk [max_i] = tarp;
				
					System.out.print ( " " + tarp [ i ] );
			}
			
		}
		catch( Exception e ) {
							
		}
	}
}