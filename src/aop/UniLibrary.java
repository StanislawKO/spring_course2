package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary{

//    @Override
    public void getBook(Book book) {
        System.out.println("�� ����� ����� �� UniLibrary " + book.getName());
    }
}
