package aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class MethodBeforeInterceptor implements MethodBeforeAdvice{
    //before方法的参数分别为被调用的方法、执行时为传入的参数、被拦截的Bean
    public void before(Method method, Object[] args, Object instance)
       throws Throwable {
              System.out.println("即将要执行方法：" + method.getName());
              if (instance instanceof AopServiceImpl) {
                       String name = ((AopServiceImpl) instance).getName();
                       if (name == null)
                               throw new NullPointerException("name属性不能为null");
                       }
     }
}
