class ThrowThrows{
    public static void main(String[] args) {
        try {
            checkPassword("user1", 1234);
            System.out.println("Login Successful");
        } catch (Exception e) {
            e.printStackTrace();

            System.out.println("Catch Block");
        } finally {
            System.out.println("Finally block!!!");
        }
    }
    
    static void checkPassword(String userName, int pswrd) throws Exception {
        if(userName.equals("user1") && pswrd == 1234) {
            System.out.println("Welcome " + userName);
        } else {
            throw new Exception("Invalid Password");
        }
    }
}