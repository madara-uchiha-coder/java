public class productsum {
    public static void main(String[] args) {
        System.out.println(checkDivisibility(99));
    }
       static public boolean checkDivisibility(int n) {
        int sum =0;
        int product=1;
        int x=n;
        while(n>0){
            sum=sum+n%10;
            product*=n%10;
            n=n/10;
        }System.out.println(product);
        System.out.println(sum+product);
        System.out.println(x);
    return (x%(sum+product)==0);}
}
