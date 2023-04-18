package ByteStreams3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB04 {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            BufferedOutputStream output = new BufferedOutputStream(file);
            String s = "Hello World!";
            byte[] b = s.getBytes();
            output.write(b);
            output.close();

        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB04.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(LAB04.class.getName()).log(Level.SEVERE, null, e);
        }

        try {
            FileInputStream file = new FileInputStream("data.dat");
            BufferedInputStream input = new BufferedInputStream(file);
            int ch;
            while ((ch = input.read()) != -1){
                System.out.println(ch);
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB04.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(LAB04.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
