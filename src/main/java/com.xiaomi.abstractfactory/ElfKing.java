package com.xiaomi.abstractfactory;

/**
 * @program: patterns
 * @description: ElfKing
 * @author: LiuJian
 * @create: 2020-03-20 18:26
 **/

public class ElfKing implements King {

    static final String DESCRIPTION = "This is the Elven king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
