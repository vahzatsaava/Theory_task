package vazha_tsaava.java_core_20_io;

import java.io.File;

public class ListFile {
    public static void main(String[] args) {
        String dirName = "C:\\Users\\User\\Desktop\\First.txt";
        File file = new File(dirName);

        if (file.isDirectory()){
            System.out.println("Каталог " + dirName);
            String[] s = file.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirName  + "/" + s[i]);
                if (f.isDirectory()){
                    System.out.println(s[i] + " является каталогом");
                }else {
                    System.out.println(s[i] + "является файлом");
                }
            }
        }
        else {
            System.out.println(dirName + " не является каталогом");
        }
    }
}
