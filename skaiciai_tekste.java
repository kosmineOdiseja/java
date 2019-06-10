import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Skaiciai_tekste {
	
	public static void main(String[] args) throws Exception {
String thisLine = null;
		
		public static boolean yraSkaitmuo ( String simbolis ) {
		
		String[] skaitmenys = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		
		boolean yra_skaitmuo = false;
		
		for (int i = 0; i < 10; i++ ) {
		
			if ( simbolis.equals ( skaitmenys [ i ] ) ) {
			
				yra_skaitmuo = true;
			}
		}
		return yra_skaitmuo;
		
	}
			jva ktry {
																										// open input stream test.txt for reading purpose.
				BufferedReader br = new BufferedReader( new FileReader( "skaiciai_sutekstu.txt" ) );
				
				System.out.println ( "duomenu failo turinys:" );
				
				double[] skaiciai = new double[1000];
				int kiekis = 0;
			 
				while ( ( thisLine = br.readLine() ) != null ) {
				 
					}
					System.out.println( thisLine );
								
				}
					
				} catch( Exception e ) {
					
				e.printStackTrace();
				}
		
		

			}			
	} 
}