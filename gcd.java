public class gcd{
    public static void main(String[] args) {
        System.out.println(gcd1(3,8));
    }
    static int gcd1(int a,int b){
        if(b==0){
            return a;
        }
        return gcd1(b,a%b);
    }
    static int lcm(int a,int b){
        return ((a*b)/gcd1(a,b));
    }
}
