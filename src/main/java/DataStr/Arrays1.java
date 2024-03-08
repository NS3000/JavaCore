package DataStr;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] intArray = {1,2,5,8,90,22};
        float[] floatArray = {2.0f,8.8f,0.9f,25.0f};

        for (int i:intArray){
            System.out.println("no: "+i);
        }
        System.out.println(Arrays.toString(intArray));

        for (float f:floatArray){
            System.out.println("float: "+f);
        }
        System.out.println(Arrays.toString(floatArray));



    }
}
