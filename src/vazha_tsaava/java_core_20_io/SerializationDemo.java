package vazha_tsaava.java_core_20_io;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;

public class SerializationDemo {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    static JsonParser jsonParser = new JsonParser();

    public static void main(String[] args) {
        System.out.println("Производим запись ");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\User\\IdeaProjects\\Theory_task\\src\\vazha_tsaava\\java_core_20_io\\Serial.json"))) {
            MyClassForSer myClassForSer = new MyClassForSer("Alex", 44, "Teacher");
            //String json = new Gson().toJson(myClassForSer);
            //System.out.println(json);
            System.out.println("myClassForSer : " + myClassForSer);
            MyClassForSer myClassForSer1 = new MyClassForSer("Ser",43,"Doctor");
            objectOutputStream.writeObject(gson.toJson(myClassForSer));
            objectOutputStream.writeObject(gson.toJson(myClassForSer1));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader reader = new FileReader("C:\\Users\\User\\IdeaProjects\\Theory_task\\src\\vazha_tsaava\\java_core_20_io\\Serial.json")){


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
    class MyClassForSer implements Serializable {
        private final String name;
        private final int age;
        private final String profession;

        public MyClassForSer(String name, int age, String profession) {
            this.name = name;
            this.age = age;
            this.profession = profession;
        }

        @Override
        public String toString() {
            return "MyClassForSer{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", profession='" + profession + '\'' +
                    '}';
        }
    }

