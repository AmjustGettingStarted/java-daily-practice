class UniqueChar {
    public static void main(String[] args) {
        String str = "vvddkee";
        int res = 0;
        for(char c: str.toCharArray()){
            res ^= c;
        }
        
        System.out.println("Unique Element: "+ (char)res);
    }
}