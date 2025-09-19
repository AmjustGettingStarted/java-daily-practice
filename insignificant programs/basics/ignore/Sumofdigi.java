class Sumofdigi{
    public static void main(String[] args) {
        int n = 1111;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
    }

}