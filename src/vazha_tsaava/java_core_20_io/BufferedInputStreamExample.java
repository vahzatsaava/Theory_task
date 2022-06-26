package vazha_tsaava.java_core_20_io;

import java.io.*;

public class BufferedInputStreamExample {

    public static void main(String[] args) {
        int s = 0;
        String res = "\n Куда идем мы с пятачком большой большой секрет !";
        byte b[] = res.getBytes();

        try (BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new FileInputStream("C:\\Users\\User\\Desktop\\First.txt"));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\User\\Desktop\\Second.txt"))
        ){
            do {
                s = bufferedInputStream.read();
                bufferedOutputStream.write(s);
            }
            while (bufferedInputStream.available() > 0
            );
            System.out.println("Запишем массив байтов ");
                bufferedOutputStream.write(b);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(s);
        }
    }
}
