/*
Name : Smit Bhabal
Abstract : code of meleeattack
Date : 04/17/24
*/
public class MeleeAttack implements Attack {
    Monster attacker;
    public  MeleeAttack(Monster attacker){
        this.attacker=attacker;
    }
    @Override
    public Integer attack(Monster target){
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return null;
    }
}
