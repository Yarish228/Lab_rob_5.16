package Three;

public class Main {
    public static void main(String[] args) {
        double q = Math.random() * 102;
        System.out.println("Згенероване число: " + q);
        System.out.println("Кількість цифр: " + (String.valueOf(q).length() - 1));
    }
}