import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, days;

        System.out.print("Doğduğunuz ay kaçıncı ay giriniz: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü yazınız: ");
        days = input.nextInt();

        if(month>0 && month<=12 || days>0 &&days<=31) {
            if(month==1) {
                if (days < 22) {
                    System.out.println("Oğlak");
                } else {
                    System.out.println("Kova");
                }
            }
            if(month==2) {
                if (days < 20) {
                    System.out.println("Kova");
                }
                else {
                    System.out.println("Balık");
                }
            }
            if(month==3) {
                if (days < 21) {
                    System.out.println("Balık");
                }
                else {
                    System.out.println("Koç");
                }
            }
            if(month==4) {
                if (days < 21) {
                    System.out.println("Koç");
                }
                else {
                    System.out.println("Boğa");
                }
            }
            if(month==5) {
                if (days < 22) {
                    System.out.println("Boğa");
                }
                else {
                    System.out.println("İkizler");
                }
            }
            if(month==6) {
                if (days < 23) {
                    System.out.println("İkizler");
                }
                else {
                    System.out.println("Yengeç");
                }
            }
            if(month==7) {
                if (days < 23) {
                    System.out.println("Yengeç");
                }
                else {
                    System.out.println("Aslan");
                }
            }
            if(month==8) {
                if (days < 23) {
                    System.out.println("Aslan");
                }
                else {
                    System.out.println("Başak");
                }
            }
            if(month==9) {
                if (days < 23) {
                    System.out.println("Başak");
                }
                else {
                    System.out.println("Terazi");
                }
            }
            if(month==10) {
                if (days < 23) {
                    System.out.println("Terazi");
                }
                else {
                    System.out.println("Akrep");
                }
            }
            if(month==11) {
                if (days < 22) {
                    System.out.println("Akrep");
                }
                else {
                    System.out.println("Yay");
                }
            }
            if(month==12) {
                if (days < 22) {
                    System.out.println("Yay");
                }
                else {
                    System.out.println("Oğlak");
                }
            }

        }
        else{
            System.out.println("Hatalı sayılar girdiniz");
        }
    }
}
