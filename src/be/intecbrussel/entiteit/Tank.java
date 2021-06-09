package be.intecbrussel.entiteit;

public class Tank extends Hero{

    public Tank() {

    }

    public Tank(String alias) {
        super.alias =alias;
    }

    public Tank(String alias, int age) {
        super.age =age;
        super.alias =alias;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "age=" + age +
                ", alias='" + alias + '\'' +
                "} ";
    }

    @Override
    public void useSuperPower() {
            System.out.println("Haha no damage done, stupid enemy");
    }
}
