package com.project.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/2/28.
 */
/**处理权限检测的切面*/
@Component
@Aspect
public class PermissionAspect {

    @Before("execution(* com.project.service..*.*(String))")
    public void checkPermission(){
        System.out.println("权限检测");
    }
}
