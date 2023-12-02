package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution(* aop.UniLibrary.get*())")
    private void allGetMethodFromUniLibrary(){}

    @Pointcut("execution(* aop.UniLibrary.return*())")
    private void allReturnMethodFromUniLibrary(){}

    @Pointcut("allGetMethodFromUniLibrary() || allReturnMethodFromUniLibrary()")
    private void allGetAndReturnMethodFromUniLibrary(){}

    @Before("allGetMethodFromUniLibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: writing Log#1");
    }

    @Before("allReturnMethodFromUniLibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice: writing Log#2");
    }

    @Before("allGetAndReturnMethodFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println("allGetAndReturnMethodFromUniLibrary: writing Log#3");
    }


//    @Pointcut("execution(* get*())")
//    private void allGetMethods(){}
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: попытка получить книгу");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: првоерка прав на получение книгу");
//    }
}
