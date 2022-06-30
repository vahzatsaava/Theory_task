package vazha_tsaava.nio_21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadWithMapBuffer {
    public static void main(String[] args) throws IOException {
        //�������� ����� � �����
        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("C:\\Users\\User\\Desktop\\First.txt"))) {
            //�������� ������ �����
            long size = channel.size();
            //� ������ ����������� ���� � �������
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY,0,size);
            //������ ����� �� ������ � �������� �� �� �����
            for (int i = 0; i < size; i++) {
                System.out.print((char) buffer.get());
            }
        }catch (InvalidPathException e){
            System.out.println(e);
        }
    }
}
