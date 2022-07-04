/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.abstractfactory;

public class GamingKeyboard implements IHardware
{
    @Override
    public void create()
    {
        System.out.println("Create gaming keyboard");
    }
}
