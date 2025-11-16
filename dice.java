public class dice {
   public static void main(String[] args) {
    dice("",4);
   } 
   static void dice(String s,int no){
    if(no==0){
        System.out.println(s);
        return;
    }
    for(int i=1 ; i<=6 && i<=no;i++){
        dice(s+i,no-i);
    }
   }

}
