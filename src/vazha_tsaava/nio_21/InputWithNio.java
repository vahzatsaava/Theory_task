package vazha_tsaava.nio_21;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputWithNio {
    public static void main(String[] args) {
        int i;
        try (InputStream input = new BufferedInputStream(Files.newInputStream(Paths.get("C:\\Users\\User\\Desktop\\Third.txt")))){
            do {
                i = input.read();
                if (i != -1){
                    System.out.print((char) i);
                }
            }while (i != -1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
