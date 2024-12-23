package Practice_Fall23;

class InvalidVoterException extends Exception {
    public InvalidVoterException(String message) {
        super(message);
    }
}

public class TestCustomException {
    public void validateAge(int age) throws InvalidVoterException {
        if (age < 18) {
            throw new InvalidVoterException("age is not enough to vote");
        } else {
            System.out.println("Can vote");
        }
    }

    public static void main(String[] args) {
        TestCustomException test1 = new TestCustomException();
        try {
            test1.validateAge(12);
        } catch (InvalidVoterException e) {
            System.out.println("Found the excepton");
            System.out.println("Exception Occured " + e);
        }
    }
}
