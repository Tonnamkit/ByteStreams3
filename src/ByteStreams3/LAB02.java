package ByteStreams3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB02 {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("data.dat");
            String s = "Hello World!";
            byte[] b = s.getBytes();
            output.write(b);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB02.class.getName()).log(Level.SEVERE,null,ex);
        }
        catch (IOException ex) {
            Logger.getLogger(LAB02.class.getName()).log(Level.SEVERE,null,ex);
        }

        try{
            FileInputStream input = new FileInputStream("data.dat");
            int value;
            while ((value = input.read()) != -1 ){
                System.out.println((char)value);
            }
            input.close();
        } catch (IOException ex){
            throw new RuntimeException();
        }
    }
}
