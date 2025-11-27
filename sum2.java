public class sum2 {
    public static void main(String[] args) {
        System.out.println(addStrings("123456789", "987654321"));
    }
    static public String addStrings(String num1, String num2) {
        int sum1=0;
      while(!num1.isEmpty()){
        sum1+=((int)num1.charAt(0)-'0');
        sum1*=10;
        num1=num1.substring(1);
         System.out.println(sum1);
      }sum1/=10;
       int sum2=0;
      while(!num2.isEmpty()){ 
        sum2+=((int)num2.charAt(0)-'0');sum2*=10;
        num2=num2.substring(1);
        System.out.println(sum2);
      }
      sum2/=10;
      
   String s=Integer.toString(sum1+sum2);

   return s; }
}
