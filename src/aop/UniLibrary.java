package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary{


    public void getBook() {
        System.out.println("�� ����� ����� �� UniLibrary ");
    }

    public void returnBook() {
        System.out.println("�� ���������� ����� � UniLibrary ");
    }

    public void getMagazine() {
        System.out.println("�� ����� ������ �� UniLibrary ");
    }

    public void returnMagazine() {
        System.out.println("�� ���������� ������ � UniLibrary ");
    }

    public void addMagazine() {
        System.out.println("�� ��������� ������ � UniLibrary ");
    }

    public void addBook() {
        System.out.println("�� ��������� ����� � UniLibrary ");
    }
}
