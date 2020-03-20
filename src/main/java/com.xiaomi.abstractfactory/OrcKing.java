package com.xiaomi.abstractfactory;

/**
 * @program: patterns
 * @description: OrcKing
 * @author: LiuJian
 * @create: 2020-03-20 18:27
 **/

public class OrcKing implements King {

    static final String DESCRIPTION = "This is the Orc king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}