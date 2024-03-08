package IO;

import java.io.CharArrayWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;


public class Multiple {
    public static void main(String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("D:\\code\\text\\1.txt");
            FileInputStream f2 = new FileInputStream("D:\\code\\text\\2.txt");
            FileOutputStream f3 = new FileOutputStream("D:\\code\\text\\3.txt");

            SequenceInputStream si = new SequenceInputStream(f1,f2);

            int i=0;
            while((i=si.read())!=-1){
                f3.write((char)i);
            }


        }catch (Exception e){}
    }
}
