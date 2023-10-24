class student{
    int roll;
    String name;
   
    public void student(){
        roll=7002;
        name="jhon";
        System.out.println(roll+name);
    }
}
class mark extends student{
    int s1,s2,s3,total;
  
    public void student(){
        s1=98;
        s2=89;
        s3=97;
        total=s1+s2+s3;

        System.out.println("\n"+s1);
        System.out.println("\n"+s2);
        System.out.println("\n"+s3);
        System.out.println("\n"+total);

    }
}
class result extends mark{
    int result;
    public void mark()
    {
        
        result=total/3;
        System.out.println("\n"+result);
    }
}
class hirecal{
    public static void main(String[] args) {
        
        student S1=new student();
        S1.student();
        mark m1=new mark();
        m1.student();
        result r1=new result();
        r1.mark();
    }
}