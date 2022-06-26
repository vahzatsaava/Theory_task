package vazha_tsaava.java_core_20_io;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("\\");
        System.out.println("Name " + file.getName());
        System.out.println("Путь " + file.getPath());
        System.out.println("Абсолютный путь " + file.getAbsolutePath());
        System.out.println("Родительский каталог " + file.getParent());
        System.out.println(file.exists() ? "существует" : "не существует");
        System.out.println(file.canWrite() ? "Доступен для записи" : " не доступен");
        System.out.println(file.canRead() ? "Доступен для чтения" : " не доступен");
        System.out.println(file.isDirectory()? "Является каталогом" : "не является");
        System.out.println(file.isAbsolute() ? "Является абсолютным" : "не является");
        System.out.println(file.lastModified() + "последние изменения");


    }
}
