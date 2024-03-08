package IO;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MultipleWrite {
    public static void main(String[] args) throws IOException {

        FileWriter fw1 = new FileWriter("D:\\code\\text\\1.txt");
        FileWriter fw2 = new FileWriter("D:\\code\\text\\2.txt");

        CharArrayWriter cw = new CharArrayWriter();
        cw.write("Duplicate Data");

        cw.writeTo(fw1);
        cw.writeTo(fw2);
        fw1.close();
        fw2.close();
    }
}
