import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	int km;
    double tutar;
    Scanner input = new Scanner(System.in);
        System.out.println("km griniz:");
        km= input.nextInt();
        tutar = 10+km*2.20;
        tutar= (tutar<20) ? 20: tutar;
        System.out.println("ödenecek tutar;"+tutar);


    }
}
