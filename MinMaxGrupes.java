import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MinMaxGrupes {
	
	public static void parodyti2  ( double [] skaiciai, int kiek) {
		
		for ( int i = 0 ; i < kiek; i+=2) {
			
			double suma = skaiciai [ i ] + skaiciai [ i + 1];
			
			System.out.print ( "[" + skaiciai [ i ] + " + " + skaiciai [ i + 1 ] + "=" + String.format ("%5.2f", suma) +"]" );
			
			}
					
		System.out.println ();
						
	}	
	
	
	public static void parodyti  ( double [] skaiciai, int kiek) {
		
		for ( int i = 0 ; i < kiek; i++) {
			
			System.out.print ( " " + skaiciai [ i ] );
		}
		System.out.println ();
	}
	
	
	public static void main(String[] args) throws Exception {
	   
		String thisLine = null;
		
		try {
																									// open input stream test.txt for reading purpose.
			BufferedReader br = new BufferedReader( new FileReader( "skaiciuseka.txt" ) );
			
			System.out.println ( "duomenų failo turinys:" );
			
			double[] skaiciai = new double[10000];
			int kiekis = 0;
			double suma = 0, vid = 0;
		 
			while ( ( thisLine = br.readLine() ) != null ) {
			 
				
				System.out.println( thisLine );
				String[] skaiciu_strs = thisLine.split ( "," );
				
				
				for ( int i=0; i < skaiciu_strs .length; i++ ) { 
				
					skaiciai [ kiekis ] = 
					
						Double.parseDouble (  skaiciu_strs [ i ] );
					kiekis++;
				}
			} 
			System.out.println( "Nuskaityta " + kiekis + " skaiciu." );
			parodyti ( skaiciai, kiekis );
			parodyti2 ( skaiciai, kiekis );
			
			if ( kiekis > 0 ) {
			
				for (int i = 0; i < ( kiekis - 2 ) ; i+=2 ) {
					
					double suma1 = skaiciai [ i ] + skaiciai [ i + 1 ]; 

					double max = suma1;
					int max_i = i;
				
					for  ( int k = i + 2; k < kiekis; k+=2 ) {
						
						double suma2 = skaiciai [ k ] +  skaiciai [ k + 1];
						
					
						if ( suma2 > max ) { 
						
							max = suma2;
							max_i = k;
						}
					}
					System.out.println ( "max: " + max + " max_i: " + max_i  );
							
					double tarp = skaiciai [ i ];
					skaiciai [ i ] = skaiciai [ max_i  ];
					skaiciai [ max_i ] = tarp;
					
					tarp = skaiciai [ i  + 1 ];
					skaiciai [ i + 1 ] = skaiciai [ max_i + 1 ];
					skaiciai [ max_i + 1 ] = tarp;
					
				}
				
				System.out.println ( "Surikiuoti skaiciai: " );
				
				parodyti ( skaiciai, kiekis );
				parodyti2 ( skaiciai, kiekis );				
			}
			
			
		} catch( Exception e ) {
			
			e.printStackTrace();
		}
	}
}