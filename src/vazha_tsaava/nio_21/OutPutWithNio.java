package vazha_tsaava.nio_21;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OutPutWithNio {
    public static void main(String[] args) {
        try (OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(Paths.get("C:\\Users\\User\\Desktop\\Third.txt")))){
            for (int i = 0; i < 26; i++) {
                outputStream.write('C' + i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
