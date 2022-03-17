import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, seleckt;

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz:");
        n1= input.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
        n2= input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz:");
        seleckt = input.nextInt();
        switch (seleckt) {
            case 1 :
                System.out.println("toplam:"+(n1+n2));
                break;
            case 2:
                System.out.println("çırkarma:"+(n1-n2));
                break;
            case 3 :
                System.out.println(" çarpma:"+(n1*n2));
                break;
            case 4 :
                System.out.println("bölme"+(n1/n2));
                break;
            default:
                System.out.println("Geçerli Bir sayı giriniz.");
                break;
        }



    }
}
