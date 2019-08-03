package com.bcc.task.factory.abstractfactory;

/**
 * @author niexiongjun
 * @date 2019-08-03
 */
public class HuaweiMateBook implements PC {
    @Override
    public void openSoft() {
        System.out.println("我是华为电脑");
    }
}
