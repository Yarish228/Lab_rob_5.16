package Four;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String q = "";
        String w = "";
        int r = 0;
        for (int i = 0; i < 3; i++) {
            q = q.concat(String.valueOf((int)(Math.random()*3) + 1));
        }
        Scanner t = new Scanner(System.in);
        System.out.println(q);
        System.out.println("Давайте зіграємо в лотерею у вас є 2 спроби щоб вгадати послідовність 3 чисел ");
        System.out.println("Введіть числа. Ви повинні відгадати послідлвність від 1 до 3");
        for (; r < 2; r++) {
            if (t.hasNext()) {
                w = t.next();
                if (w.equals(q)) {
                    System.out.println(" Ви вгадали *_* ");
                    break;
                } else {
                    System.out.println("Ви не вгадали `~' ");
                }
            } else {
                System.out.println("Ви ввели не правильне число ");
            }


        }


    }
}