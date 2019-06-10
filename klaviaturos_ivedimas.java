
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class klaviaturos_ivedimas {
  public static void main(String[] argv) throws Exception {
    System.out.print("Enter your name: ");
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(reader);
    String name = in.readLine();
    System.out.println("Hello, " + name + ". Enter three ints...");
    int[] values = new int[3];
    double sum = 0.0;
    for (int i = 0; i < values.length; i++) {
      System.out.print("Number " + (i + 1) + ": ");
      String temp = in.readLine();
      values[i] = Integer.parseInt(temp);
      sum += values[i];
    }
    System.out.println("The average equals " + sum / values.length);
  }
}