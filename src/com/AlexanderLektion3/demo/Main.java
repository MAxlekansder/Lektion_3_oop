package com.AlexanderLektion3.demo;
//går in i package och hämtar in klassen för att köra igenom allt
import com.AlexanderLektion3.demo.Model.Students;

public class Main {

    //instansierar objektet
    public static void main(String[] args) {

        System.out.println("ändrar vi något nu?");

        //instantiate object
        Students stud1 = new Students("Benny",16,true);
        Students stud2 = new Students("Frida",13,true);

        System.out.println(stud1.isTired);
        System.out.println(stud2.isTired);
        System.out.println(stud1.age + " " + stud1.name);
        System.out.println(stud2.age + " " + stud2.name);
        if (stud1.isTired ) {
            System.out.println("stud1 är väldigt trött");
        } else {
            System.out.println("stud1 är inte trött"); }
        if (stud2.isTired) {
            System.out.println("stud2 är väldigt trött");
        } else {
            System.out.println("stud2 är inte trött");
        }
    }
/*
    public static void main(String[] args) {
        int sum;
        //addition(5,7);
        sum = addition(15,15);
        System.out.println(sum);
        System.out.println(addition(3,5));
        addition2(15,15);

    }

    public static int addition(int x, int y) { // <-- innanför paran är argument
        //System.out.println(x + y);
        return x+y;
    }
    public static void addition2(int x, int y) {
        System.out.println(x + y);
    }
    */

}