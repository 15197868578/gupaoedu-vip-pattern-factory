package com.bcc.task.factory;

import com.bcc.task.factory.abstractfactory.HuaweiFactory;
import com.bcc.task.factory.abstractfactory.IFactory;
import com.bcc.task.factory.factorymethod.IPerpleFactory;
import com.bcc.task.factory.factorymethod.WomanFactory;

/**
 * @author niexiongjun
 * @date 2019-08-03
 */
public class Main {

    public static void main(String[] args) {
//        简单工厂
        SimplePeopleFactory simplePeopleFactory = new SimplePeopleFactory();
        simplePeopleFactory.createPeople(Man.class).say();

//        工厂方法
        /**
         * 工厂方法模式是指定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行。
         * 在工厂方法模式中用户只需要关心所需产品对应的工厂，无须关心创建细节 ，而且加入新的产品符合开闭原则，《对扩展打开，对修改关闭》
         * 如果新加了一个产品，只要新加一个工厂就可以了，不需要修改原来的代码，
         * 也就是说，你原来是生产键盘的，现在还要生产鼠标了，不用修改键盘的生产线，只需要新加一条新的生产线（鼠标的生产线）就可以了
         * 一个工厂类，只生产一种产品
         */
        IPerpleFactory factory = new WomanFactory();
        factory.create().say();



//        抽象工厂模式
        /**
         * 抽象工厂模式是指提交一个创建一系列相关或朴素依赖对象的接口，无须指定他们具体的类，
         * 调用方不依赖于产品类型实例如何被创建实现等细节，强调的是一系列相关的产品对象（属于同一产品族）一起使用创建对象需要大量重复的代码。
         * 需要提供一个产品类的库，所有的产品以同样的接口出现，从而使调用方不依赖于具体实现。
         */
        IFactory iFactory = new HuaweiFactory();
        iFactory.createPc().openSoft();
        iFactory.createPhone().sendMsg();


    }
}
