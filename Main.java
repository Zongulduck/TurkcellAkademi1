import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç Sınav Notu Gireceksiniz ?");
        int exam = input.nextInt();
        double totalP =0;
        int i=0;
        while(i<exam){
            System.out.println((i+1)+".notunuzu giriniz:");
            int p = input.nextInt();
            totalP+=p;
            System.out.println(totalP);
            i++;
        }
        double ort;
        ort=totalP/exam;
        System.out.println("ortalamanız: "+ort);
        if(ort>80){
            System.out.println("Yüksek Puan");
        }
    }
}