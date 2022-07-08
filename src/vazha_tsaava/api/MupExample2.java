package vazha_tsaava.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MupExample2 {
    public static void main(String[] args) {
        //применить метод mup для создания нового потока данных,
        //содержащего только избранные Элементы
        List<NamePhoneEmail2> list = new ArrayList<>();
        list.add(new NamePhoneEmail2("Larry","554545","rere@"));
        list.add(new NamePhoneEmail2("Tom","5-77-45","out"));
        list.add(new NamePhoneEmail2("Merry","55465-665","int@"));
        list.stream().forEach(a->{
            System.out.println(a.getName() + " " + a.getPhone() + " " + a.getMail());
        });
        //отображаем только имена и номера телефонов
        Stream<NamePhone2> stream = list.stream().map(a -> new NamePhone2(a.getName(), a.getPhone()));
        System.out.println();
        System.out.println("Список с именами и телефонами");
        System.out.println();
        stream.forEach(a-> System.out.println(a.getName() + " " + a.getPhone()));
        //вывод в одну строку
        list.stream().map(a -> new NamePhone2(a.getMail(), a.getPhone()))
                .forEach(a-> System.out.println(a.getName() + " " + a.getPhone()));
        Stream<NamePhone2> namePhoneStream = list.stream()
                .filter((a) ->a.getName().equals("Tom"))
                .map(a-> new NamePhone2(a.getName(),a.getPhone()));
        System.out.println(namePhoneStream);

    }
}
 class NamePhoneEmail{
     private String name;
     private String phone;
     private String mail;

     public NamePhoneEmail(String name, String phone, String mail) {
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
class NamePhone{
    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public NamePhone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}