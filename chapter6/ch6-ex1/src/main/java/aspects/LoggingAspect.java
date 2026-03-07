package aspects;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import services.CommentService;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    public LoggingAspect(){
        System.out.println("I'm LoggingAspect");
    }

    @Around("execution(* services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("Method will execute");
        joinPoint.proceed();
        logger.info("Method executed");
    }
    
}
