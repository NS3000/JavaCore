package Arrays;

public class Array2D {
    public static void main(String[] args) {

        int no = 10;

        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("_________________________________");

        int[][] arr2 = new int[3][3];


        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length ; j++) {
                arr2[i][j]= no++;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length ; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        //------------------------------------------------

    }
}
