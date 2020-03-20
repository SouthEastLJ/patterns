package com.xiaomi.abstractfactory;

/**
 * @program: patterns
 * @description: ElfCastle
 * @author: LiuJian
 * @create: 2020-03-20 18:22
 **/

public class ElfCastle implements Castle{
    static final String DESCRIPTION = "This is the Elven castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
