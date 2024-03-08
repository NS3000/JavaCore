package IO;

import java.io.*;

public class ReaderWriter {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("D:\\OTR1.txt");
        FileWriter fw = new FileWriter("D:\\OTR1.txt");

        BufferedReader br = new BufferedReader(fr);

        fw.write("writing into file");
        fw.close();
        System.out.println(br.readLine());

        fr.close();


    }
}
