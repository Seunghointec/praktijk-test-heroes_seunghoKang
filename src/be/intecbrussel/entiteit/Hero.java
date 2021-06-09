package be.intecbrussel.entiteit;

/**
 * Created by Mrrobot on 31/10/2017 heroes.
 *
 * Deze klasse krijgen jullie cadeau
 */
public abstract class Hero {

    protected int age;
    protected String alias;


    /*
    Vergeet niet dat deze methode nog een implementatie
    nodig heeft in de subklassen.
    Dit mag een simpele sysout zijn.
     */


    public Hero() {

    }


    public abstract void useSuperPower();

    @Override
    public String toString() {
        return "Hero{" +
                "age=" + age +
                ", alias='" + alias + '\'' +
                '}';
    }
}
