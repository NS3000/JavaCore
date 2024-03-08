package ExceptionHandling;

class UnderAgeException extends Exception{
    public UnderAgeException(String str){
        super(str);
        }
}


public class Custom {
    void checkAge(int age) throws UnderAgeException {
        if(age<18){
            throw new UnderAgeException("You are underage");
        }else{
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        int age=17;
        Custom c = new Custom();
        try{
            c.checkAge(age);
        }catch(Exception e ){
            System.out.println("Error happened");
        }
    }
}
