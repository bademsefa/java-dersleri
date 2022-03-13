import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut, elma, domates , muz, patlıcan;

        Scanner inp = new Scanner(System.in);

        System.out.print(" Armut kaç kilo?:");
        armut = inp.nextDouble();

        System.out.print("elma kaç kilo?:");
        elma = inp.nextDouble();

        System.out.print("domates kaç kilo?:");
        domates = inp.nextDouble();

        System.out.print("muz kaç kilo?:");
        muz = inp.nextDouble();

        System.out.print("patlıcan kaç kilo?:");
        patlıcan = inp.nextDouble();

        double toplam  = (armut*2.14)+ (elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5);
        System.out.print("toplam tutar:"+toplam) ;
        System.out.println("TL");
    }
}
