package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary {

//    @Override
    public void getBook() {
        System.out.println("�� ����� ����� �� SchoolLibrary ������������ � ���������");
    }

    public void getMagazine() {
        System.out.println("�� ����� ������ �� SchoolLibrary");
    }
}
