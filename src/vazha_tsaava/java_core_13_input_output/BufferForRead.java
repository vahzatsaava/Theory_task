package vazha_tsaava.java_core_13_input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferForRead {
    public static void main(String[] args) throws IOException {
        /**
         * read chars strings
         */
        String c = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 'q' для выхода ");

        do {
            c = bufferedReader.readLine();
            System.out.println(c);
        } while (!c.equals("q"));

        /**
         * Простейший текстовый редактор
         */
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[100];
        System.out.println("Введите строки текста");
        System.out.println("Введите стоп для завершения работы ");

        for (int i = 0; i < strings.length; i++) {
            strings[i] = b.readLine();
            if (strings[i].equals("стоп")) {
                break;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("стоп")){
                break;
            }
            System.out.println(strings[i]);
        }

    }
}
