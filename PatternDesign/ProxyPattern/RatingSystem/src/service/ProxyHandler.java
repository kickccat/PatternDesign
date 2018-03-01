package service;

import model.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyHandler {

    PersonBean getProxy(String handler, PersonBean person) {

        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                getHandler(handler, person));
    }

    private InvocationHandler getHandler(String handler, PersonBean person) {
        if (handler.startsWith("Owner")) {
            return new OwnerInvocationHandler(person);
        } else if (handler.startsWith("Non")) {
            return new NonOwnerInvocationHandler(person);
        }
        return null;
    }
}
