package lesson4;

public class InvalidEmailException extends RuntimeException{

    String email;

    public InvalidEmailException(String message, String email) {
        super(message);
        this.email = email;
    }
    public void getDetails(){
        System.out.println("Please, write correct email. Your email: " + email);
    }

}
