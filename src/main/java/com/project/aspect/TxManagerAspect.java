package com.project.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/2/28.
 */
@Component
@Aspect
public class TxManagerAspect {
    @Before("within(com..project.service.*)")
    public void beforeTx(){
        System.out.println("TX.beforeAdvice");
    }
    /**假如核心业务执行结束,没有出现异常会执行这个后置通知*/
    @AfterReturning("within(com..project.service.impl.UserServiceImpl)")
    public void returenAdvice(){
        System.out.println("后置通知");
    }
    /**当核心业务方法出现异常时,会执行此通知,所以经常讲这个通知为异常通知*/
    @AfterThrowing("within(com..project.service.impl.UserServiceImpl)")
    public void afterThrowing(){
        System.out.println("tx.afterThrowing");
    }
    /**无论核心业务是否正常结束,这个通知都会在执行,所以通常将此通知理解为最终通知*/
    @After("within(com..project.service..*)")
    public void afterTx(){
        System.out.println("TX.afterAdvice");
    }
}
/**
 * try{
 *      @Before
 *     核心业务
 *     @AfterReturn
 * }catch{
 *  @AfterThrowing
 * }finally{
 *     @After
 * }
 */
