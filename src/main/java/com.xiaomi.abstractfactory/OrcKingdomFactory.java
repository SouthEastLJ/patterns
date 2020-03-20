package com.xiaomi.abstractfactory;

/**
 * @program: patterns
 * @description: OrcKingdomFactory
 * @author: LiuJian
 * @create: 2020-03-20 18:51
 **/

public class OrcKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
