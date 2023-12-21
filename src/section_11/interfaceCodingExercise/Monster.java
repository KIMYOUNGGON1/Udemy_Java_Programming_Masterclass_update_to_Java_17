package section_11.interfaceCodingExercise;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }


    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(this.name);
        values.add("" + this.hitPoints);
        values.add("" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> paramList) {
        if (paramList != null && paramList.size() > 0) {
            this.name = paramList.get(0);
            this.hitPoints = Integer.parseInt(paramList.get(1));
            this.strength = Integer.parseInt(paramList.get(2));
        }
    }

    @Override
    public String toString() {
        return """
                Monster{name='%s', hitPoints=%d, strength=%d}
                """.formatted(getName(), getHitPoints(), getStrength());
    }
}
