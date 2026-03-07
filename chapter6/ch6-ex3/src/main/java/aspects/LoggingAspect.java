package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{

        String method_name = joinPoint.getSignature().getName();
        System.out.println("Method: " + method_name + " start execute");

        Object result = joinPoint.proceed();

        return result;
    }
    
}
