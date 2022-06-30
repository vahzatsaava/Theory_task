package vazha_tsaava.nio_21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteWithChanel {

    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("C:\\Users\\User\\Desktop\\First.txt"),
                StandardOpenOption.WRITE)){
            //������� �����
            ByteBuffer buffer = ByteBuffer.allocate(26);
            //���������� ��������� ����������� ���� � ������
            for (int i = 0; i < 26; i++) {
                buffer.put((byte) ('A' + i));
            }
            //�������������� �����  � ������
            buffer.rewind();
            //���������� ������ �� ������ � ����
            fileChannel.write(buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("C:\\Users\\User\\Desktop\\Second.txt"),
                StandardOpenOption.WRITE)){

            ByteBuffer buffer = ByteBuffer.allocate(26);

            for (int i = 0; i < 26; i++) {
                buffer.put((byte) ('A' + i));
            }
            buffer.rewind();
            channel.write(buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
