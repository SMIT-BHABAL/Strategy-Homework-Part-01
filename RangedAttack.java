/*
Name : Smit Bhabal
Abstract : code of rangeattack
Date : 04/17/24
*/

public class RangedAttack implements Attack {


    Monster attacker;

    public RangedAttack(Monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack (Monster target) {
        String message = attacker + " uses a ranged attack on " + target;
        System.out.println(message);
        return null;
    }
}