package com.xiaomi.abstractfactory;

/**
 * @program: patterns
 * @description: OrcArmy
 * @author: LiuJian
 * @create: 2020-03-20 18:20
 **/

public class OrcArmy implements Army{
    static final String DESCRIPTION = "This is the Orc Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
