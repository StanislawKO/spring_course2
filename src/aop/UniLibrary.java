package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary{


    public void getBook() {
        System.out.println("�� ����� ����� �� UniLibrary ");
        System.out.println("-----------------------------------------");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("�� ���������� ����� � UniLibrary ");
        return "����� � ���";
    }

    public void getMagazine() {
        System.out.println("�� ����� ������ �� UniLibrary ");
        System.out.println("-----------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("�� ���������� ������ � UniLibrary ");
        System.out.println("-----------------------------------------");
    }

    public void addMagazine() {
        System.out.println("�� ��������� ������ � UniLibrary ");
        System.out.println("-----------------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("�� ��������� ����� � UniLibrary ");
        System.out.println("-----------------------------------------");
    }
}
