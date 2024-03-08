package IO;
import java.util.Scanner;

public class ScannerCls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter name");
        String name= sc.nextLine();
        System.out.println("name : "+name );

        System.out.println("Enter no: ");
        int i= sc.nextInt();
        System.out.println("number *2 =  "+2*i);
        sc.close();

    }
}
