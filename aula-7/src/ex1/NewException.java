package ex1;
public class NewException extends Exception {
    
    public NewException() {
        super("Houve um novo erro!");
    }

    public NewException(String msg) {
        super(msg);
    }
}