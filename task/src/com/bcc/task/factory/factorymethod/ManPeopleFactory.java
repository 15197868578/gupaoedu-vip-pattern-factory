package com.bcc.task.factory.factorymethod;

import com.bcc.task.factory.Man;
import com.bcc.task.factory.People;

/**
 * @author niexiongjun
 * @date 2019-08-03
 */
public class ManPeopleFactory implements IPerpleFactory {
    @Override
    public People create() {
        return new Man();
    }
}
