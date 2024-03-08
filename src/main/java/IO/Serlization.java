package IO;

import java.io.*;

public class Serlization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fo = new FileOutputStream("f.txt");
        ObjectOutputStream oo = new ObjectOutputStream(fo);

        koo k1= new koo(101,"kkk",55);

        oo.writeObject(k1);
        oo.flush();oo.close();

        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("f.txt"));
        koo k2 =(koo) oi.readObject();
        System.out.println(k2);
        oi.close();

    }
}
class koo implements Serializable {
    int id;
    String name;
    transient int  val;
    koo(int id,String name,int val){
        this.id=id;
        this.name=name;
        this.val=val;
    }

    @Override
    public String toString() {
        return "id is : "+id+" and name is : "+name+"Value is : "+val ;
    }
}
