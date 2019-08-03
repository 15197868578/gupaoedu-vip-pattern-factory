package com.bcc.task.factory.abstractfactory;

/**
 * @author niexiongjun
 * @date 2019-08-03
 */
public class HuaweiPhone implements Phone {
    @Override
    public void sendMsg() {
        System.out.println("我是 huawei phone");
    }
}
