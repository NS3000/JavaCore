package IO;

import java.io.*;

public class FILEOU {
    public static void main(String[] args) {
        try {
            FileOutputStream fo = new FileOutputStream("D:\\OTR.txt");
            BufferedOutputStream bo = new BufferedOutputStream(fo);
            String s = "Hello jameson";
            bo.write(s.getBytes());
            bo.close();
            fo.close();

            FileInputStream fi = new FileInputStream("D:\\OTR.txt");
            BufferedInputStream bi = new BufferedInputStream(fi);
            int i=0;
            while((i=bi.read())!=-1){
                System.out.print((char)i);
            }
            System.out.println("done");
            bi.close();
            fi.close();

        }catch (Exception e){}
    }
}
