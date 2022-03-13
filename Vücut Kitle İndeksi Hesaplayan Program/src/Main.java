import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	int kilo;
    double boy;
    Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz:");
        boy = inp.nextDouble();
        System.out.print("lütfen kilonuzu girniz:");
        kilo = inp.nextInt();
        double indeks = kilo / (boy*boy);
        System.out.println("vücut kitle İndeksinz:"+indeks);
    }
}
