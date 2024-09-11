package nau;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.advancedGCD(288, 2976));
        System.out.println(gcd.advancedGCD(2828, 334));
        System.out.println(gcd.findGCD(144, 20736, 248832));
        System.out.println(gcd.findGCD(144, 20736, 248832, 12));
    }
}