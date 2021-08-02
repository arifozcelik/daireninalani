import java.util.Scanner;

public class dairealan {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("r gir:");
        r = input.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        System.out.println("dairenin alanı :" + alan);
        System.out.println("dairenin cevresi :"+ cevre );

    }
}
