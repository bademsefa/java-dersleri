import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        double cevre,alan,sonuc;

        Scanner input= new Scanner(System.in);
        System.out.println("kısa kenarı giriniz:");
        a= input.nextInt();
        System.out.println("uzun kenarı griniz;");
        b= input.nextInt();
        System.out.println("hipotenüsü giriniz;");
        c= input.nextInt();
        cevre = ((a+b+c)/2);
        alan= cevre*(cevre-a)*(cevre-b)*(cevre-c);
        sonuc = Math.sqrt(alan);
        System.out.println("üçgenin alanı:"+sonuc);
    }}
