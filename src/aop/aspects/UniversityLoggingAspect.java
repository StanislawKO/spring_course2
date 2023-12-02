package aop.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: �������� ��������� ������ " +
                "��������� ����� ������� getStudents");
    }

    @AfterReturning("execution(* getStudents())")
    public void afterReturningGetStudentsLoggingAdvice(){
        System.out.println("afterReturningGetStudentsLoggingAdvice: �������� ��������� ������ " +
                "��������� ����� ������ ������ getStudents");
    }
}
