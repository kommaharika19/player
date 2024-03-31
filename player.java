import java.util.Random;

class Player {
    int health;
    int strength;
    int attack;
    Random random;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.random = new Random();
    }

    public int getHealth() {
        return health;
    }

    public int attack() {
        return random.nextInt(6) + 1; // 6-sided die Roll
    }

    public int defend() {
        return random.nextInt(6) + 1; // 6-sided die Roll
    }

    public void reduceHealth(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
