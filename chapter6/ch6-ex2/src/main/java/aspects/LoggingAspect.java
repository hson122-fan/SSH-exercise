package aspects;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import services.CommentService;

@Aspect
public class LoggingAspect {

    @Around("execution(* services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{

        System.out.println("Method start execute");
        String method_name = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        System.out.println("Method " + method_name + "\nwith parameters: " + Arrays.asList(arguments) );
        Object returned = joinPoint.proceed();

        System.out.println("returned: " + returned);
        return returned;
    }
    
}
