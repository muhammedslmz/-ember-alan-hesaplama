import java.util.Scanner;

public class CemberAlani {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen çemberin yarıçapını giriniz: ");
        double r = input.nextDouble();

        System.out.print("Lütfen dilim çemberin merkez açısını giriniz: ");
        double a = input.nextDouble();

        double alan= (Math.PI *r*r*a)/360;
        System.out.println("Dilim çemberin alanı: "+alan);
    }
}
