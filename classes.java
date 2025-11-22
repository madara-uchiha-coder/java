public class classes {
   public static void main(String[] args) {
    student s1 =new student();
s1.name="mitanshu";
s1.roll_no=4;
s1.marks=100;
s1.percent(s1.marks);
} 
}
   class student{
    String name;
    int roll_no;
    float marks;
   
    void greeting(){
       System.out.println("hello "+this.name);
    }
    void percent(float marks){
        System.out.println(this.marks+"%");
    }

}



