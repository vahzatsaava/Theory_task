package vazha_tsaava.java_core_20_io;

import java.io.*;

public class DataOutDataInputExample {
    public static void main(String[] args) {
        int s = 0;
        System.out.println("Выводим данные в файл");
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("C:\\Users\\User\\Desktop\\Second.txt"))) {
            dataOut.writeInt(55);
            dataOut.writeChar(4);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("C:\\Users\\User\\Desktop\\Second.txt"))){
            s = inputStream.readInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(s);
        }
    }
}