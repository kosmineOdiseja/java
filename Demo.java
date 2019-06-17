import java.awt.*;        // Using AWT containers and components
import java.awt.event.*;  // Using AWT events classes and listener interfaces
 
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

// An AWT GUI program inherits the top-level container java.awt.Frame
public class Demo extends Frame
      implements ActionListener, WindowListener {
      // This class acts as listener for ActionEvent and WindowEvent
      // A Java class can extend only one superclass, but it can implement multiple interfaces.
 
   private TextArea tfCount;  // Declare a TextField component
   private Button btnCount;    // Declare a Button component
   private int count = 0;      // Counter's value
 String thisLine = null;
	      
   // Constructor to setup the GUI components and event handlers
   public Demo() {
     setLayout(new FlowLayout()); // "super" Frame sets to FlowLayout
 
      add(new Label("Counter"));   // "super" Frame adds an anonymous Label
 
     btnCount = new Button("Count");  // Construct the Button
      add(btnCount);                   // "super" Frame adds Button
	   
	tfCount = new TextArea(" Test"); // Construct the TextField
	 //tfCount.setBounds(10,3,10,50);
      tfCount.setEditable(false);       // read-only
      add(tfCount);                     // "super" Frame adds TextField
 
      //btnCount = new Button("Count");  // Construct the Button
      //add(btnCount);                   // "super" Frame adds Button
 
      btnCount.addActionListener(this);
        // btnCount (source object) fires ActionEvent upon clicking
        // btnCount adds "this" object as an ActionEvent listener
 
      addWindowListener(this);
        // "super" Frame (source object) fires WindowEvent.
        // "super" Frame adds "this" object as a WindowEvent listener.
 
      setTitle("WindowEvent Demo"); // "super" Frame sets title
      setSize(500, 500);            // "super" Frame sets initial size
      setVisible(true);             // "super" Frame shows
   }
 
   // The entry main() method
   public static void main(String[] args) {
      new Demo();  // Let the construct do the job
   }
 
   /* ActionEvent handler */
   @Override
   public void actionPerformed(ActionEvent evt) {
    //  ++count;
     // tfCount.setText(count + "");
	
      
		try {
																									// open input stream test.txt for reading purpose.
			BufferedReader br = new BufferedReader( new FileReader( "skaiciai.csv" ) );
			
			tfCount.append ( "duomenų failo turinys:" + "\n" );
			
			double[] skaiciai = new double[10000];
			int kiekis = 0;
			double suma = 0, vid = 0;
		 
			while ( ( thisLine = br.readLine() ) != null ) {
			 
				
				tfCount.append ( thisLine + "\n" );
				String[] skaiciu_strs = thisLine.split ( "," );
				
				
				for ( int i=0; i < skaiciu_strs .length; i++ ) { 
				
					skaiciai [ kiekis ] = 
					
						Double.parseDouble (  skaiciu_strs [ i ] );
					kiekis++;
				}
			} 
			
			tfCount.append ( "Nuskaityta " + kiekis + " skaičių. " + "\n" );
			if ( kiekis > 0 ) {
			
				double max = skaiciai [ 0 ];
				
				for ( int i = 0; i<kiekis; i++ ) {
					
					suma += skaiciai [ i ];
				
					if ( max < skaiciai [ i ] ) {
					
						max = skaiciai [ i ]; 
					}
				}
				
				tfCount.append ( "Maksimali reiksme skaiciu sekoje: " + max + "\n");
				tfCount.append ( "Skaiciu suma: " + suma + "\n");
				vid = suma / kiekis;
				tfCount.append ( "Vidurkis: " + vid + "\n" );				
			}
			
           
      } catch(Exception e) {
         e.printStackTrace();
      }   
	   
	
	   
   }
   
 
   /* WindowEvent handlers */
   // Called back upon clicking close-window button
   @Override
   public void windowClosing(WindowEvent evt) {
      System.exit(0);  // Terminate the program
   }
 
   // Not Used, BUT need to provide an empty body to compile.
   @Override public void windowOpened(WindowEvent evt) { }
   @Override public void windowClosed(WindowEvent evt) { }
   // For Debugging
   @Override public void windowIconified(WindowEvent evt) { System.out.println("Window Iconified"); }
   @Override public void windowDeiconified(WindowEvent evt) { System.out.println("Window Deiconified"); }
   @Override public void windowActivated(WindowEvent evt) { System.out.println("Window Activated"); }
   @Override public void windowDeactivated(WindowEvent evt) { System.out.println("Window Deactivated"); }
}