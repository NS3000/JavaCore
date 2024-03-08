package Polymorphism;

public class CompileTIme {
    public static void main(String[] args) {
        CompileTIme ct= new CompileTIme();
        ct.multiply(5,3);
        ct.multiply(5.0,3.0);
    }
    public void multiply(int a, int b){
        System.out.println(a*b);
    }
    public void multiply(double a, double b){
        System.out.println(a*b);
    }



}
