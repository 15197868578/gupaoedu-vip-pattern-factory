package com.bcc.task.factory.factorymethod;

import com.bcc.task.factory.People;
import com.bcc.task.factory.Woman;

/**
 * @author niexiongjun
 * @date 2019-08-03
 */
public class WomanFactory implements IPerpleFactory {
    @Override
    public People create() {
        return new Woman();
    }
}
