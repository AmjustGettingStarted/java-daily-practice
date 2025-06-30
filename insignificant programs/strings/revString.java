public class revString {
    public static void main(String[] args) {
        String str = "The lord of the Mysteries - Mr.FooL";
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        System.out.println("rev -> " + res);
    }
}