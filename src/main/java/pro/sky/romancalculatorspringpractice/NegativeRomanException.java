package pro.sky.romancalculatorspringpractice;

public class NegativeRomanException extends RuntimeException{

    NegativeRomanException(String string)
    {
        super(string);
    }
}
