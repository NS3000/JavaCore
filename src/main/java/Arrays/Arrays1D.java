package Arrays;

public class Arrays1D {
    public static void main(String[] args) {

        Arrays1D a = new Arrays1D();
        int[] arr= {1,2,3,4,5};

        a.multiplyArr(arr);
        a.squareArr(new int[]{2,4,6,8,10});


    }

    void multiplyArr(int[] arr){
        for(int i:arr){
            System.out.println(i*10);
        }
        System.out.println("End");
    }
    void squareArr(int[] arr){
        for (int i:arr){
            System.out.println(i*i);
        }
        System.out.println("End");
    }
}
