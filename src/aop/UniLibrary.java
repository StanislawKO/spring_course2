package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println("�� ����� ����� �� UniLibrary");
    }
}
