import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar, kdvsizTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("ücret tutarını giriniz:");
        tutar= input.nextDouble();

        kdvTutar = kdvOran* tutar;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("kdvsiz tutar:"+tutar);
        System.out.println("kdv oranı:"+ kdvOran);
        System.out.println("kdv tutarı:"+kdvTutar);
        System.out.println("kdvli tutar"+ kdvliTutar);

    }
}
