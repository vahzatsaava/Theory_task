package vazha_tsaava.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MupExample2 {
    public static void main(String[] args) {
        //��������� ����� mup ��� �������� ������ ������ ������,
        //����������� ������ ��������� ��������
        List<NamePhoneEmail> list = new ArrayList<>();
        list.add(new NamePhoneEmail("Larry","554545","rere@"));
        list.add(new NamePhoneEmail("Tom","5-77-45","out"));
        list.add(new NamePhoneEmail("Merry","55465-665","int@"));
        list.stream().forEach(a->{
            System.out.println(a.getName() + " " + a.getPhone() + " " + a.getMail());
        });
        //���������� ������ ����� � ������ ���������
        Stream<NamePhone> stream = list.stream().map(a -> new NamePhone(a.getName(), a.getPhone()));
        System.out.println();
        System.out.println("������ � ������� � ����������");
        System.out.println();
        stream.forEach(a-> System.out.println(a.getName() + " " + a.getPhone()));
        //����� � ���� ������
        list.stream().map(a -> new NamePhone(a.getMail(), a.getPhone()))
                .forEach(a-> System.out.println(a.getName() + " " + a.getPhone()));

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