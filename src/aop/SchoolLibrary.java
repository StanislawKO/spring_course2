package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary {

//    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из SchoolLibrary Преступление и наказание");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из SchoolLibrary");
    }
}
