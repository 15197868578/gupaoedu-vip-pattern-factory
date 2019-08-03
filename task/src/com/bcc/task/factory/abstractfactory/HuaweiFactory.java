package com.bcc.task.factory.abstractfactory;

/**
 * @author niexiongjun
 * @date 2019-08-03
 */
public class HuaweiFactory implements IFactory {
    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }

    @Override
    public PC createPc() {
        return new HuaweiMateBook();
    }
}
