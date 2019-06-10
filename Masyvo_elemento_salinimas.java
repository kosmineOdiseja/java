import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Masyvo_elemento_salinimas { // file pavadinimas turi sutapti su situo public class.
	
	BufferedReader br = new BufferedReader( new FileReader( "skaiciu_grupes.csv" ) ); // nuskaitomas file
			
			System.out.println ( "duomenu failo turinys:" ); //uzrasomas file 
			
			double[] skaiciai = new double[1000];
			int kiekis = 0;
		 
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
			
			for ( i = k ; i < n ; i ++ ) {
				skaiciai [i] = skaiciai [i + 1 ];
			}
			
			n--
			
			system.out.println ( "skaiciai" );
		}
		
	}	
		

