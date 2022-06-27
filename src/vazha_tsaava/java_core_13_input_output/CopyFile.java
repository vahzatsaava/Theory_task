package vazha_tsaava.java_core_13_input_output;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        System.out.println("Использование файла");
        /**
         * Записываем из файла во второй файл
         */
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\Desktop\\First.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\User\\Desktop\\Second.txt");) {
            do {
                i = fileInputStream.read();
                fileOutputStream.write(i);
            } while (fileInputStream.available() > 0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
