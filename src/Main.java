import org.w3c.dom.ls.LSOutput;

import javax.xml.transform.Source;
import java.time.temporal.IsoFields;

public class Main {
    public static void main(String[] args) {
        ;
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1(){
        int age = 19;
        if (age >= 18) {
            System.out.println("он достиг совершеннолетия");}
        if (age < 18) {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать».");
        }
    }

    public static void task2() {
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("нужно надеть шапку");}
        if (temperature> 5) {
            System.out.println("можно идти без шапки».");}
    }
    public static void task3() {
        int speed = 59;
        if (speed < 60) {
            System.out.println("Если скорость меньше speed то можно ездить спокойно».");}
        if (speed> 60) {
            System.out.println("Если скорость больше speed2 то придется заплатить штраф");}
    }

    public static void task4() {
        int age = 4;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен age то ему нужно ходить в детский сад");} else {
            System.out.println("Если возраст меньше или больше age то он не должен ходить в детский сад");
        }
        int age2 = 12;
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Если возраст человека равен  age2 то ему нужно ходить в школу");
        } else {
            System.out.println("Если возраст человека больше,или меньше  age2 , то ему не нужно ходить в школу");
        }
        int age3 = 22;
        if (age3 > 18 && age3 < 24) {
            System.out.println("Если возраст человека равен  age3 то ему нужно ходить В университет.");
        } else {
            System.out.println("Если возраст человека больше,илименьше  age3, то ему не нужно ходить В университет.");
        }
        int age4 = 33;
        if (age4 > 24) {
            System.out.println("Если возраст человека ,равен  age4 то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека  меньше age4, то ему не нужно ходить на работу");
        }

    }


    public static void task5() {
        int age = 4;
        if (age < 5) {
            System.out.println("Если возраст ребенка меньше 5 лет, то ему нельзя кататься на аттракционе");
        } else {
            System.out.println("Если возраст ребенка от 5-14 лет  то ему можно кататься на аттракционе в сопровождении взрослого," +
                    "Если возраст ребёнка от 14-18 лет, то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        int age2 = 8;
        if (age2 > 5 && age2 < 14) {
            System.out.println("Если возраст ребенка от 5-14 лет , то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка меньше 5 лет, то  ему нельзя кататься на аттракционе, если ребёнку больше 14 лет," +
                    "то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        int age3 = 15;
        if (age3 > 14) {
            System.out.println("Если возраст ребёнка больше 14 лет, то ему можно кататься на аттракционе без сопровождения взрослого)».");
        } else {
            System.out.println("Если возраст ребенка меньше 5 лет, то ему нельзя кататься на аттракционе,если ребёнку от 5-14 лет, " +
                    "то ему можно кататься на аттракционе в сопровождении взрослого");
        }
    }

    public static void task6() {
        int wagonСapacity = 102;
        int seatsForASittingTrip = 60;
        int standingPlaces = wagonСapacity - seatsForASittingTrip;
        int seatsUsed=55;
        int standUsed=40;
        int totalSeatsLeft = 102-(seatsUsed+standUsed);
        if (seatsUsed<seatsForASittingTrip ) {
            System.out.println("В этом вагоне мест = "    +(seatsForASittingTrip-seatsUsed)+  " шт. для поесдки сидя");}
        if(seatsForASittingTrip == seatsUsed){
            System.out.println( " В этом вагоне места для поездки сидя, закончились.");}
        if (standingPlaces > standUsed) {
            System.out.println("В этом вагоне мест = "    + (standingPlaces - standUsed)+  " шт. для поездки стоя");} else {
            System.out.println("В этом вагоне мест для поездки стоя больше нет");}
        if(totalSeatsLeft>0){
            System.out.println( "в этом вагоне мест = " +totalSeatsLeft+ " из них " +(seatsForASittingTrip-seatsUsed)+
                    " мест для положения сидя и "  + (standingPlaces - standUsed)+ "  для положения стоя");}else{
            System.out.println("ИЗВИНИТЕ,ВАГОН ПОЛНЫЙ,МЕСТ НЕТ!"); }
    }
    public static void task7() {
        int one=5;
        int two=10;
        int three=15;
        if(three<one){
            System.out.println("three меньше one");} else {
            System.out.println("three больше one");}
        if(one>two){
            System.out.println("one больше two");}else {
            System.out.println("two  больше One");}
        if(three<two){
            System.out.println("three меньше two");}else{
            System.out.println("Three больше two");}
    }
}
