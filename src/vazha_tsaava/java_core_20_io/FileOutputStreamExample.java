package vazha_tsaava.java_core_20_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        int n;
        String res = "Rerer hhfhfh dfdsfv 2323";
        byte buf[] = res.getBytes();
        try (   FileInputStream first = new FileInputStream("C:\\Users\\User\\Desktop\\First.txt");
                FileOutputStream second = new FileOutputStream("C:\\Users\\User\\Desktop\\Second.txt");
                FileOutputStream third = new FileOutputStream("C:\\Users\\User\\Desktop\\First.txt")){
            do {
                n = first.read();
                second.write(n);
            }while (first.available() > 0);
            System.out.println("Записываем данные в 1-й файл");
            for (int i = 0; i < buf.length; i+=2) {
            third.write(buf[i]);
            }
            System.out.println("Записываем данные во второй файл ");
            second.write(buf);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
