package com.bcc.task.factory.abstractfactory;

/**
 * @author niexiongjun
 * @date 2019-08-03
 */
public class AppleFactory implements IFactory {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public PC createPc() {
        return new MacBook();
    }
}
