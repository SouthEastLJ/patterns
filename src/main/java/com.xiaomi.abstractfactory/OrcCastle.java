package com.xiaomi.abstractfactory;

/**
 * @program: patterns
 * @description: OrcCastle
 * @author: LiuJian
 * @create: 2020-03-20 18:25
 **/

public class OrcCastle implements Castle {

    static final String DESCRIPTION = "This is the Orc castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
