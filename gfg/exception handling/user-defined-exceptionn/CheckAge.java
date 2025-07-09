public class CheckAge {
    public static void main(String[] args) {
        try {
            checkEligibilty(18);
            System.out.println("try block");
        } catch (AgeInvalidException e) {
            System.out.println("Not eligible");
            e.printStackTrace();
        } finally {
            System.out.println("this is finally block");
        }
    }
    
    static void checkEligibilty(int age) throws AgeInvalidException {
        if (age < 18) {
            throw new AgeInvalidException(" You are not eligible | below 18 years");
        }
        System.out.println("Above 18 | Can vote");
    }
}
