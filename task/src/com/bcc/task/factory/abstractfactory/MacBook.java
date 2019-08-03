package com.bcc.task.factory.abstractfactory;

/**
 * @author niexiongjun
 * @date 2019-08-03
 */
public class MacBook implements PC {
    @Override
    public void openSoft() {
        System.out.println("I im's macbook");
    }
}
