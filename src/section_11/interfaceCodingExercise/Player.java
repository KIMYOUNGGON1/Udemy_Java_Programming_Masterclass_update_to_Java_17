package section_11.interfaceCodingExercise;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(this.name);
        values.add("" + this.hitPoints);
        values.add("" + this.strength);
        values.add(this.weapon);
        return values;
    }

    @Override
    public void read(List<String> paramList) {
        if (paramList != null && paramList.size() > 0) {
            this.name = paramList.get(0);
            this.hitPoints = Integer.parseInt(paramList.get(1));
            this.strength = Integer.parseInt(paramList.get(2));
            this.weapon = paramList.get(3);
        }
    }

    @Override
    public String toString() {
        return """
                Player{name='%s', hitPoints=%d, strength=%d, weapon='%s'}
                """.formatted(getName(), getHitPoints(), getStrength(), getWeapon());
    }
}
