package IO;

import java.io.*;

public class Dataoi {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("D:\\OTR.txt");
            FileOutputStream fo = new FileOutputStream("D:\\OTR1.txt");
            DataInputStream di = new DataInputStream(fi);
            DataOutputStream Do = new DataOutputStream(fo);

            long i=0;
            while((i=di.readInt())!=-1){
                System.out.print(i);
                Do.writeInt((int)i);

            }
        }catch (Exception e){}
        }
}
