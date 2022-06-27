package vazha_tsaava.java_core_20_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        int size;
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\Desktop\\First.txt")){
            size = fileInputStream.available();
            System.out.println("Общее колличество доступных байтов " + size);

            int n = size / 5;
            System.out.println("первые " +  n + " байтов прочитанные методом read ");
            for (int i = 0; i < n; i++) {
                System.out.print( (char) fileInputStream.read());
            }
            System.out.println();
            System.out.println("Все еще доступно " + fileInputStream.available());
            System.out.println("чтение следующих байтов по очереди read[]");

            byte[] b = new byte[n];

            if (fileInputStream.read(b) != n){
                System.err.println("нельзя прочитать " + n + "Байтов");
            }
            System.out.println(new String(b,0,n));
            System.out.println(fileInputStream.available());
            System.out.println("Пропустим наши значения методом skip");
            System.out.println(fileInputStream.skip(size / 2));
            System.out.println("Все еще доступно ");
            System.out.println(fileInputStream.available());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
