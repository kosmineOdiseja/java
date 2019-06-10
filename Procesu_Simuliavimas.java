	import java.io.BufferedReader;
	import java.io.FileInputStream;
	import java.io.FileReader;
	import java.io.InputStream;
	import java.io.InputStreamReader;

	public class Procesu_Simuliavimas { 
		
		public static String laikas ( double laikas_val ) {
				
			double laikas_sek_viso = laikas_val * 3600;
			int laikas_sek_viso_1st =(int) laikas_sek_viso;
			int laikas_h = laikas_sek_viso_1st/ 3600;
			int laikas_min = ( laikas_sek_viso_1st - laikas_h * 3600) / 60;
			int laikas_sek = laikas_min % 60;
			
			String laikas_str = "" + laikas_h + ":" + ( laikas_min < 10 ? "0" : "") + laikas_min + ":" + (laikas_sek < 10? "0" : "" ) + laikas_sek;
			
			return laikas_str;
		}
			
		public static void main(String[] args) throws Exception { 
	   
			String thisLine = null;
			
			try { 
																										// open input stream test.txt for reading purpose.
				BufferedReader br = new BufferedReader( new FileReader( "Procesu_simuliavimas.txt" ) );
				
				System.out.println ( "duomenu failo turinys:" );
				
				double[] skaiciai = new double[10000];
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
							
						
				if (kiekis< 3) { 
					
					System.out.println ("nepakanka duomenu");
					
							
				} else { 
									
					double s_gal = skaiciai [ 0 ];
					double s_tarp = skaiciai [ 1 ];
					double v_greit = skaiciai [ 2 ];
					double s_tarp_2= skaiciai [ 3 ];  // cia viska susirasyti - susidubliuoti! 
					double s_gal_2 = skaiciai [ 4 ];
					double v_greit_2 = skaiciai [ 5 ];
					
						
					System.out.println ("pradiniai pirmojo automibilio duomenys : ");
					System.out.println ();
					System.out.println ( "pradinis atstumas: " + s_tarp + " galinis atstumas: "  + s_gal + " greitis: " + v_greit );
					System.out.println ();
					System.out.println ("pradiniai antrojo automibilio duomenys : ");
					System.out.println ();
					System.out.println ( "pradinis atstumas: " + s_tarp_2 + " galinis atstumas: "  + s_gal_2 + " greitis: " + v_greit_2);
					
					double t_gal = s_gal / v_greit;
					double t_tarp = s_tarp / v_greit;
					double dt = t_gal / 19;
					double t_gal_2 = s_gal_2/v_greit_2;
					double t_tarp_2= s_tarp_2 / v_greit_2;
					double dt_2 = t_gal_2 / 19;
					double t = t_gal;				
										
						
					
					System.out.println ();
					System.out.println (" Pradiniai duomenys pirmojo automobilio: ");
				
					System.out.println ( "delta pokytis: " + dt );
					System.out.println ( " t_ galutinis: " + t_gal );
					
					System.out.println ();
					System.out.println ("pradiniai duomenys antrojo automobilio : ");
					System.out.println ( "delta pokytis: " + dt_2 );
					System.out.println ( " t_ galutinis: " + t_gal_2);
					
					System.out.println ();
					System.out.println ("	s1 	v1 	s2 	v2	");
					
								
					boolean flag_nebuvo_pravaziuota_stotele = true;
					boolean flag_nebuvo_pravaziuota_stotele_2 = true;
					
					
					if ( t_gal >= t_gal_2) {
						
						t_gal = t_gal_2;
											
						//naudoti sukeitimo metoda? t_gal = t_gal3 ir t gal3 = t_gal 2 ir t-gal_2 lygu t_gal1
							
					 
						double s = v_greit * t; 
						double s_2 = v_greit_2 * t; 
						
							for ( t =0; t < ( t_gal + dt ); t+=dt ) { // issirinkti kuris laikas didesnis ( pasiimti ilgesni laika!)
								
								s = v_greit * t; 		
																
								if (s >= s_tarp ) { 
									
									if (flag_nebuvo_pravaziuota_stotele) {
															
										System.out.println ( "	" + laikas ( t_tarp) + " " + String.format ("%5.2f", s_tarp)+ "#" + "	" + laikas ( t_tarp_2) + " " + String.format ("%5.2f", s_tarp_2)+ "*");
										flag_nebuvo_pravaziuota_stotele = false;
										flag_nebuvo_pravaziuota_stotele_2 = false;
									} 
									System.out.println ( "	" + laikas ( t ) + " " + String.format ("%5.2f", s) + " " + String.format ("%5.2f", s_2) );
								} 
							
							//} else{
								
								// klausimas ar tik nereikia cia naudoti ir double s = v_greit * t;  formules, nes jei salyga bloga man reikia ir
							
								s_2 = v_greit_2 * t; 
															
								if (s_2 >= s_tarp_2) { 
									
									if (flag_nebuvo_pravaziuota_stotele_2) {
									
										System.out.println ( "	" + laikas ( t_tarp_2) + " " + String.format ("%5.2f", s_tarp_2)+ "*" + " " + String.format ("%5.2f", s_tarp) + "#");
										flag_nebuvo_pravaziuota_stotele_2 = false;
										flag_nebuvo_pravaziuota_stotele = false;
									} 
								}
								
								 System.out.println ( "	" + laikas ( t) + " " + String.format ("%5.2f", s_2)  + " " + String.format ("%5.2f", s ));
							}
						}	
								
				} catch( Exception e ) { 
			
				e.printStackTrace();
			} 
		}
	}