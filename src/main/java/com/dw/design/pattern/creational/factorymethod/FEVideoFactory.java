package com.dw.design.pattern.creational.factorymethod;

/**
 * Created by geely
 */
public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
