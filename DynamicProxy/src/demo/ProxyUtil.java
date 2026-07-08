package demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;



public class ProxyUtil {

    //public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
    //参数一：用于指定用哪个类加载器
    //参数二：指定接口，这些接口用于创建代理对象有哪些方法
    //参数三：用于指定生成的代理对象干什么

    public static Act createProxy(Acter acter) {
        Act act = (Act) Proxy.newProxyInstance(
                Acter.class.getClassLoader(),
                new Class[]{Act.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if(method.getName().equals("sing")){
                            System.out.println("准备话筒");
                        }else if(method.getName().equals("dance")){
                            System.out.println("准备场地");
                        }
                        return method.invoke(acter, args);
                    }
                }
        );
        return act;
    }
}
