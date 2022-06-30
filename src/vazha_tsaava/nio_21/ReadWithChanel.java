package vazha_tsaava.nio_21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadWithChanel {

    public static void main(String[] args) {
        int count;
        Path filePath = null;
        /*
        //получаем путь к файлу
        try {
            filePath = Paths.get("C:\\Users\\User\\Desktop\\First.txt");
        } catch (InvalidPathException e) {
            System.out.println("Path error " + e);
            return;
        }
        //получаем канал к этому файлу
        try {
            SeekableByteChannel jChan = Files.newByteChannel(filePath);
            //выделить память под буфер
            ByteBuffer buffer = ByteBuffer.allocate(128);
            do {
                //читать данные из файла в буфер
                count = jChan.read(buffer);
                //прекратить чтение по достижению конца файла
                if (count != -1) {
                    //подготовить буфер к чтению данных
                    buffer.rewind();
                    //читать байты данных из буфера и выводить их на экран как символы
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) buffer.get());
                    }
                }
            } while (count != -1);

        } catch (IOException e) {
            e.printStackTrace();
        }

         */
        // сокращенная запись
        try (FileChannel seekableByteChannel =
                     (FileChannel) Files.newByteChannel(Paths.get("C:\\Users\\User\\Desktop\\First.txt"))) {
            //выделить память под буфер
            ByteBuffer buffer = ByteBuffer.allocate(128);
            do {
                //читать данные из файла в буфер
                count = seekableByteChannel.read(buffer);
                //прекратить чтение по достижению конца файла
                if (count != -1){
                    //подготовить буфер к чтению данных из него
                    buffer.rewind();
                    //читать байты данных из буфера и выводить их на экран
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) buffer.get());
                    }
                }
            }while (count != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
