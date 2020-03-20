package com.xiaomi.abstractfactory;

/**
 * @program: patterns
 * @description: main
 * @author: LiuJian
 * @create: 2020-03-20 18:49
 **/

public class Main {
    private King king;
    private Castle castle;
    private Army army;
    public void createKingdom(final KingdomFactory factory) {
        setKing(factory.createKing());
        setCastle(factory.createCastle());
        setArmy(factory.createArmy());
    }
    King getKing(final KingdomFactory factory) {
        return factory.createKing();
    }

    public King getKing() {
        return king;
    }

    private void setKing(final King king) {
        this.king = king;
    }

    Castle getCastle(final KingdomFactory factory) {
        return factory.createCastle();
    }

    public Castle getCastle() {
        return castle;
    }

    private void setCastle(final Castle castle) {
        this.castle = castle;
    }

    Army getArmy(final KingdomFactory factory) {
        return factory.createArmy();
    }

    public Army getArmy() {
        return army;
    }

    private void setArmy(final Army army) {
        this.army = army;
    }

    /**
     * The factory of kingdom factories.
     */
    public static class FactoryMaker {

        /**
         * Enumeration for the different types of Kingdoms.
         */
        public enum KingdomType {
            ELF, ORC
        }

        /**
         * The factory method to create KingdomFactory concrete objects.
         */
        public static KingdomFactory makeFactory(KingdomType type) {
            switch (type) {
                case ELF:
                    return new ElfKingdomFactory();
                case ORC:
                    return new OrcKingdomFactory();
                default:
                    throw new IllegalArgumentException("KingdomType not supported.");
            }
        }
    }

    public static void main(String[] args) {

        Main app = new Main();

        app.createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF));
        System.out.println(app.getArmy().getDescription());
        app.createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ORC));
        System.out.println(app.getArmy().getDescription());

    }
}
