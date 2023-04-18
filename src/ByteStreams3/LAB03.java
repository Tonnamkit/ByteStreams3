package ByteStreams3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB03 {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            DataOutputStream output = new DataOutputStream(file);
            output.writeUTF("Jim Henry");
            output.writeInt(30);
            output.writeDouble(65.5);
            output.writeChar('A');


        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB03.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException ex) {
            Logger.getLogger(LAB03.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream file = new FileInputStream("data.dat");
            DataInputStream input = new DataInputStream(file);

            String name = input.readUTF();
            int age = input.readInt();
            Double height = input.readDouble();

            System.out.println(name);
            System.out.println(age);
            System.out.println(height);
            System.out.println(input.readChar());

        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB03.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(LAB03.class.getName()).log(Level.SEVERE, null, e);
        }
    }


}
