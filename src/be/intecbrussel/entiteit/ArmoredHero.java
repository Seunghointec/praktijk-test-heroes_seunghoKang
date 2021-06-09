package be.intecbrussel.entiteit;

import javax.management.remote.SubjectDelegationPermission;

public class ArmoredHero extends Hero{

    public ArmoredHero() {

    }

    public ArmoredHero(String alias) {
        super.alias =alias;
    }

    public ArmoredHero(String alias, int age) {
        super.alias =alias;
        super.age = age;
    }

    @Override
    public String toString() {
        return "ArmoredHero{" +
                "alias='" + alias + '\''+
                    "age=" + age +
                "} ";
    }

    @Override
    public void useSuperPower() {
            System.out.println("Uses suit to shoot Enemy");
    }
}
