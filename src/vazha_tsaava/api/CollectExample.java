package vazha_tsaava.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectExample {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail2> list = new ArrayList<>();
        list.add(new NamePhoneEmail2("terry","9990","@998"));
        list.add(new NamePhoneEmail2("Garry","7654","@990"));
        list.add(new NamePhoneEmail2("Anna","965750","@328"));
        //  отобразить только имена и номера телефонов на новый поток данных
        Stream<NamePhone2> stream = list.stream().map(a -> new NamePhone2(a.getName(),a.getPhone()));

        // вызвать ме тод collect () , ч тобы составить список типа Liat
        // из имен и номеров телефонов
        List<NamePhone2> list1 = stream.toList();
        list1.forEach(System.out::println);
        System.out.println();
        stream = list.stream().map(a -> new NamePhone2(a.getName(),a.getPhone()));
        Set<NamePhone2> set = stream.collect(Collectors.toSet());
        set.forEach(a -> System.out.println(a + " "));

    }
}
    class NamePhoneEmail2 {
        private String name;
        private String phone;
        private String mail;

        public NamePhoneEmail2(String name, String phone, String mail) {
            this.name = name;
            this.phone = phone;
            this.mail = mail;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public String getMail() {
            return mail;
        }
    }
    class NamePhone2 {
        private String name;
        private String phone;

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public NamePhone2(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "NamePhone2{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }
