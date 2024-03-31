class MagicalArena {
    Player playerA;
    Player playerB;

    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void fight() {
        Player attacker, defender;
        while (playerA.isAlive() && playerB.isAlive()) {
            attacker = playerA.health < playerB.health ? playerA : playerB;
            defender = attacker == playerA ? playerB : playerA;

            int attackRoll = attacker.attack();
            int defenseRoll = defender.defend();
            int damage = (attackRoll * attacker.attack) - (defenseRoll * defender.strength);

            if (damage > 0) {
                defender.reduceHealth(damage);
            }
        }

        if (playerA.isAlive()) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }
}
