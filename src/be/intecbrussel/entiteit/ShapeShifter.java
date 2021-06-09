package be.intecbrussel.entiteit;

public class ShapeShifter extends Hero {

    public ShapeShifter() {

    }

    public ShapeShifter (String alias) {
        super.alias =alias;
    }

    public ShapeShifter(String alias, int age) {
        super.age = age;
        super.alias =alias;
    }

    @Override
    public String toString() {
        return "ShapeShifter{" +
                "age=" + age +
                ", alias='" + alias + '\'' +
                "} ";
    }

    @Override
    public void useSuperPower() {
            System.out.println("Disguise as enemy, attacks enemy from behind");
    }
}
