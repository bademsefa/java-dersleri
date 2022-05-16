import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, biyoloji;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz");
        mat = inp.nextInt();

        System.out.println("fizik notunu giriniz");
        fizik = inp.nextInt();

        System.out.println("kimya notunu giriniz");
        kimya = inp.nextInt();

        System.out.println("biyoloji notunu giriniz");
        biyoloji = inp.nextInt();

        int toplam= mat+ kimya+biyoloji+fizik;
        double sonuc = toplam/4;
        System.out.println("ortalamanız :"+sonuc);
        String durum = (sonuc < 55) ? "Kaldı" : "Geçti";
        System.out.println("Ortalama:" + sonuc + " ** " + durum);    }


}
