package be.intecbrussel.entiteit;

public class Energizer extends Hero {

    public Energizer() {

    }

    public Energizer (String alias) {
        super.alias =alias;
    }

    public Energizer(String alias, int age) {
        super.alias =alias;
        super.age = age;
    }

    @Override
    public String toString() {
        return "Energizer{} "
                + "age=" + age +
                ", alias='" + alias + '\'' +
                "} ";
    }

    @Override
    public  void useSuperPower() {
            System.out.println("Charging..., attacks enemy with charged superpowers");
    }
}




