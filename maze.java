public class maze {
public static void main(String[] args) {
    System.out.println(mazeans(3, 3));
}
static int mazeans(int r , int c){
    if(r==1 || c==1)
    return 1;
    int left=mazeans(r-1, c);
    int right=mazeans(r, c-1);
    return left+right;
}
}
