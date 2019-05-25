package com.project.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/2/28.
 */
@Component
@Aspect
public class LoggingAspect {
    /**使用bean表达式定义的切入点:
     * 括号内写的是bean的名字
     * 括号内也可以使用通配符"*"
     * */
    @Before("bean(*ServiceImpl)")
    public void beforeAdvice(){
        System.out.println("log.beforeAdvice");
    }
    @After("bean(userServiceImpl)")
    public void afterAdvice(){
        System.out.println("log.afterAdvice");
    }
}
