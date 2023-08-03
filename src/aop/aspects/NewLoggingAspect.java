package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: attempt to " +
                "return the book to library");

        Object targetMethodResult = null;
        try {
            //long begin = System.currentTimeMillis();
            targetMethodResult = proceedingJoinPoint.proceed();
            //targetMethodResult = "another book name";
            //long end = System.currentTimeMillis();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: " +
                    "exception caught " + e);
            //targetMethodResult = "unnamed book";
            throw e;
        }

        System.out.println("aroundReturnBookLoggingAdvice: book is " +
                "successfully returned to library");
        /*System.out.println("aroundReturnBookLoggingAdvice: returnBook method " +
                "been working for " + (end - begin) + " millis");*/
        return targetMethodResult;
    }
}
