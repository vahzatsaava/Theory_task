package vazha_tsaava.nio_21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteWithMapBuffer {
    public static void main(String[] args) {
        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("C:\\Users\\User\\Desktop\\Third.txt"), StandardOpenOption.WRITE,
                StandardOpenOption.READ, StandardOpenOption.CREATE)){

            //сопоставляем файл с буфером
            MappedByteBuffer mappedByteBuffer = channel.map(FileChannel.MapMode.READ_WRITE, 0 , 26);

            //записываем заданное колличество байт в буффер
            for (int i = 0; i < 26; i++) {
                mappedByteBuffer.put((byte) ('A' + i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
