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
        //�������� ���� � �����
        try {
            filePath = Paths.get("C:\\Users\\User\\Desktop\\First.txt");
        } catch (InvalidPathException e) {
            System.out.println("Path error " + e);
            return;
        }
        //�������� ����� � ����� �����
        try {
            SeekableByteChannel jChan = Files.newByteChannel(filePath);
            //�������� ������ ��� �����
            ByteBuffer buffer = ByteBuffer.allocate(128);
            do {
                //������ ������ �� ����� � �����
                count = jChan.read(buffer);
                //���������� ������ �� ���������� ����� �����
                if (count != -1) {
                    //����������� ����� � ������ ������
                    buffer.rewind();
                    //������ ����� ������ �� ������ � �������� �� �� ����� ��� �������
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) buffer.get());
                    }
                }
            } while (count != -1);

        } catch (IOException e) {
            e.printStackTrace();
        }

         */
        // ����������� ������
        try (FileChannel seekableByteChannel =
                     (FileChannel) Files.newByteChannel(Paths.get("C:\\Users\\User\\Desktop\\First.txt"))) {
            //�������� ������ ��� �����
            ByteBuffer buffer = ByteBuffer.allocate(128);
            do {
                //������ ������ �� ����� � �����
                count = seekableByteChannel.read(buffer);
                //���������� ������ �� ���������� ����� �����
                if (count != -1){
                    //����������� ����� � ������ ������ �� ����
                    buffer.rewind();
                    //������ ����� ������ �� ������ � �������� �� �� �����
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
