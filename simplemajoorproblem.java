public class simplemajoorproblem {
    public static void main(String[] args) {
        int[] arr ={5,2,1};
        int[] arr2=new int[8];
        System.out.println(sol("", "49"));
    }
    static int sol(String p,String s){
        if(s.isEmpty()){
            System.out.println(p);
           return 1;
        }
         int count=0;
        char a =s.charAt(0);
        s =s.substring(1);
        sol(p+a, s);
        sol(p, s);
    return count;}
}
