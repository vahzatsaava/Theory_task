package vazha_tsaava.nio_21;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\Desktop\\Example";
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(path))) {
            System.out.println("Каталог " + directoryStream);

            for (Path entry : directoryStream) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);
                if (attributes.isSymbolicLink()) {
                    System.out.println("Dir");
                } else {
                    System.out.println(" ! ! !");
                }
                System.out.println(entry.getName(4));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //создать фильт возвращающий true только для файлов доступных для записи
        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path entry) throws IOException {
                if (Files.isWritable(entry)) {
                    return true;
                }
                return false;
            }
        };
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(path),how)){
            for (Path entry: directoryStream) {
                BasicFileAttributes attributes = Files.readAttributes(entry,BasicFileAttributes.class);
                if (attributes.isSymbolicLink()) {
                    System.out.println("Dir");
                } else {
                    System.out.println(" ! ! !");
                }
                System.out.println(entry.getName(1));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
