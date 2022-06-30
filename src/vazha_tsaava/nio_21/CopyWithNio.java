package vazha_tsaava.nio_21;

import java.io.IOException;
import java.nio.file.*;

public class CopyWithNio {
    public static void main(String[] args) {
        try {
            Path path1 = Paths.get("C:\\Users\\User\\Desktop\\Third.txt");
            Path path2 = Paths.get("C:\\Users\\User\\Desktop\\Second.txt");
            Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
