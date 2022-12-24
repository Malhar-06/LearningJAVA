import java.util.Scanner;

public class if_else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        
        if (date==25){
            System.out.println("Merry Christmas");
        }
        else if (date==31) {
            System.out.println("New Year's Eve");
        }
        else if (date==1) {
            System.out.println("Happy New Year");
        }
        else {
            System.out.println("NO festival");
        }
    }
}
