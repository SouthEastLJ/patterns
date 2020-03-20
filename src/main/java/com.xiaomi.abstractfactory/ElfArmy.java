package com.xiaomi.abstractfactory;

/**
 * @program: patterns
 * @description: ElfArmy
 * @author: LiuJian
 * @create: 2020-03-20 18:29
 **/

public class ElfArmy implements Army{
    static final String DESCRIPTION = "This is the Elven Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

}