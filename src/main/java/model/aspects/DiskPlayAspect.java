package model.aspects;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by dmakarov on 9/21/2015.
 */
@Aspect
public class DiskPlayAspect {
    @Pointcut("execution(** model.CdDisk.play(..))")
    public void play(){}

    @Before ("play()")
    public void beforePlayed() {
        System.out.print("Performing BEFORE CD disk Played");
    }

    @AfterReturning("play()")
    public void afterPlayed() {
        System.out.print("Performing AFTER CD disk Played");
    }
}
