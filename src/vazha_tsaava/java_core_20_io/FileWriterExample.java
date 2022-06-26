package vazha_tsaava.java_core_20_io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String s = "Доброго времени суток !";
        char chars[] = new char[s.length()];
        s.getChars(0, s.length(), chars, 0);
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\User\\Desktop\\Second.txt")) {
            for (int i = 0; i < chars.length; i += 2) {
                fileWriter.write(chars[i]);
            }
            fileWriter.write(chars);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
