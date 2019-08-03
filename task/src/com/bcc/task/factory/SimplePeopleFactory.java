package com.bcc.task.factory;

/**
 * @author niexiongjun
 * @date 2019-08-03
 */
public class SimplePeopleFactory {

    public People createPeople(Class<? extends People> clazz) {
        if (clazz == null) {
            return null;
        }
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
