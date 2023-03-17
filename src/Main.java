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

    public static void task1() {
        int age = 19;
        if (age >= 18) {
            System.out.println("он достиг совершеннолетия");
        }
        if (age < 18) {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать».");
        }
    }

    public static void task2() {
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("можно идти без шапки».");
        }
    }

    public static void task3() {
        int speed = 59;
        if (speed < 60) {
            System.out.println("то можно ездить спокойно».");
        }
        if (speed > 60) {
            System.out.println("то придется заплатить штраф");
        }
    }

    public static void task4() {
        int age = 5895;
        if (age >= 2 && age <= 6) {
            System.out.println("ему нужно ходить в детский сад");
        } else if (age >= 7 && age < 18) {
            System.out.println("ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("ему нужно ходить В университет.");
        } else if (age > 24) {
            System.out.println("ему нужно ходить на работу");
        }
    }

    public static void task5() {
        int age = 14;
        if (age < 5) {
            System.out.println("Ему нельзя кататься на аттракционе");
        }
        if (age > 5 && age < 14) {
            System.out.println("Ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age >= 14) {
            System.out.println("Ему можно кататься на аттракционе без сопровождения взрослого)».");
        }
    }


    public static void task6() {
        int wagonСapacity = 102;
        int seatsForASittingTrip = 60;
        int standingPlaces = wagonСapacity - seatsForASittingTrip;
        int seatsUsed = 55;
        int standUsed = 40;
        int totalSeatsLeft = 102 - (seatsUsed + standUsed);
        if (seatsUsed < seatsForASittingTrip) {
            System.out.println("В этом вагоне мест = " + (seatsForASittingTrip - seatsUsed) + " шт. для поесдки сидя");
        }
        if (seatsForASittingTrip == seatsUsed) {
            System.out.println(" В этом вагоне места для поездки сидя, закончились.");
        }
        if (standingPlaces > standUsed) {
            System.out.println("В этом вагоне мест = " + (standingPlaces - standUsed) + " шт. для поездки стоя");
        } else {
            System.out.println("В этом вагоне мест для поездки стоя больше нет");
        }
        if (totalSeatsLeft > 0) {
            System.out.println("в этом вагоне мест = " + totalSeatsLeft + " из них " + (seatsForASittingTrip - seatsUsed) +
                    " мест для положения сидя и " + (standingPlaces - standUsed) + "  для положения стоя");
        } else {
            System.out.println("ИЗВИНИТЕ,ВАГОН ПОЛНЫЙ,МЕСТ НЕТ!");
        }
    }

    public static void task7() {
        int one = 1;
        int two = 1;
        int three = 1;
        if (one > two) {
            if(one>three) {
                System.out.println("Максимальное число = " + one);
            } else if (three>one) {
                System.out.println("Максимальное число " + three);
            }else {
                System.out.println(" " + one + "и" + three + "равны");
            }

            } else if (two>one) {
            if (two >= three) {
                System.out.println("Максимальное число " + two);
            } else if (three > two) {
                System.out.println("Максимальное число " + three);
            }
        } else{
            if(one>three) {
                System.out.println("максимальное число " + one);
            } else if (three>one) {
                System.out.println("Максимальное число " + three);
            }else{
                System.out.println("все 3 числа равны ");
            } System.out.println("Максимальное число" + three);
        }
    }

        }

