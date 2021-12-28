import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int i,b=0,x=0;
        Scanner s=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int a=s.nextInt();
        System.out.println("sayilar:");
    for (i=0;i<=a;i++){
        if (i%3==0&&i%4==0){
            System.out.print(" "+i);
            b++;
            x=x+i;
        }
    }
        System.out.println("\nortalama:"+(x/b));
    }
}
