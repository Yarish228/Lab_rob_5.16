package Two;

public class Main {
    public static void main(String[] args){
        int q = 3;
        int w = 4;
        int e = (int)Math.sqrt(Math.pow(q, 2)+ Math.pow(w, 2));
        int p = q + w + e;
        int s = q * w / 2;
        System.out.println("Периметр - " + p);
        System.out.println("Площа - " + s);
    }
}