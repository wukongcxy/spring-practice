package wukong.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by chenxinyue on 2016/3/28.
 */
@Aspect
@Component
public class LogTraceAspect {
    @Around("@annotation(LogTrace)")
    public void loga(JoinPoint jp) {
        try {
            System.out.println("log log log !!!");
        } catch (Exception e) {
            System.out.println("log log log !!!");
        }
    }


}
