import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int number= random.nextInt(100);
        Scanner scanner=new Scanner(System.in);

        int rights=0,estimate;
        int[] estimates=new int[5];
        boolean isWin=false,isWrong=false;
        System.out.println("*0-100  arası bir sayı giriniz");
        while (rights<5){
            System.out.println("Tahminininzi girin");
            estimate= scanner.nextInt();
            if (estimate<0&&estimate>100){
                System.out.println("tahmininizin 0-100 arasında olması lazım");
                if (isWrong){
                    rights++;
                    System.out.println("Yanlış tahmin ettiniz.Kalan hakkınız:"+(5-rights));
                }else {
                    System.out.println("hakkınızdan düşülecek?????");
                }
                continue;
            }
            if (number==estimate){
                System.out.println("Tebrikler,tahmini sayı:"+estimate);
                isWin=true;
                break;
            }else{
                System.out.println("tahmini sayıyı bulamadınız.");
                if (estimate>number){
                    System.out.println(estimate+" tahmini sayıdan daha büyük");
                }else {
                    System.out.println(estimate+" tahmini sayıdan daha küçük");
                }
                estimates[rights++]=estimate;
                System.out.println("kalan hakkınız:"+(5-rights));
            }
        }
        if (!isWrong){
            System.out.println("Malesef kaybettiniz! tahmini sayı:"+number);
            if (!isWrong){
                System.out.println("tahminleriniz:"+ Arrays.toString(estimates));
            }
        }
    }
}