package lesson8.examples;

public class LetterFactory {
    public static A Create(String letter){

        if (letter.equals("A")){
            return new A();
        } else if(letter.equals("B")){
            return new B();
        }else{
            return new C();
        }


    }
}
