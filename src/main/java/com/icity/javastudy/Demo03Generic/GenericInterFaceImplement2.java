package com.icity.javastudy.Demo03Generic;

//含有泛型的接口第二种使用方式：接口使用什么泛型，实现类就使用相应泛型，类取决于接口
public class GenericInterFaceImplement2<I> implements GenericInterFace<I>{
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
