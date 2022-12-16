package exceptions;


// поменять exception
public class NameException extends RuntimeException {
    public NameException(String s) {
        super(s);
    }
}
