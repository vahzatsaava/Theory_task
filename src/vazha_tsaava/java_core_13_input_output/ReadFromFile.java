package vazha_tsaava.java_core_13_input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        int n;
        FileInputStream fileInputStream;

        //убедимся что имя файла указано

        if (args.length != 1) {
            System.out.println("Use File");
        }
        //trying open file
        try {
            fileInputStream = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Disable open file");
            return;
        }
        //файл открыт пытаемся читать символы
        try {
            do {
                n = fileInputStream.read();
                if (n != -1) {
                    System.out.println((char) n);
                }
            }
            while (n != -1);

        } catch (IOException e) {
            System.out.println("Error of read file");
        }
        try {
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
