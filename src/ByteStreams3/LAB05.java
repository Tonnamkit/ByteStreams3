package ByteStreams3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB05 {
    public static void main(String[] args) {
        Student s = new Student("1","Kak");
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(s);
            output.close();

        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB05.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(LAB05.class.getName()).log(Level.SEVERE, null, e);
        }

        try {
            FileInputStream file = new FileInputStream("data.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            Student s1 = (Student) input.readObject();
            System.out.println(s1.id);
            System.out.println(s1.name);

        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB05.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(LAB05.class.getName()).log(Level.SEVERE, null, e);
        } catch (ClassNotFoundException e) {
            Logger.getLogger(LAB05.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
