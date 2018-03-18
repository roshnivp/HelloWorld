/**
 * Created by Roshni Velluva Puthanidam on 10/10/16.
 */
import java.io.*;
public class FileInputOutput {

    public void echo(String filename) {
     try {
            // Create reader for the given filename
            BufferedReader in = new BufferedReader(new FileReader(filename));
           // While/break to call readLine() until it returns null
          while (true) {
                String line = in.readLine();
                if (line == null) {
                    break;
                    }
                // do something with line
                System.out.println(line);
                }
            in.close();
          } catch (IOException except) {

           except.printStackTrace();
            // System.exit(1); // could do this too
           }
        }

   public static void main(String[] args) {
        FileInputOutput fio= new FileInputOutput();
        fio.echo("/Users/roshni/Downloads/receipts.txt");
        }

}
