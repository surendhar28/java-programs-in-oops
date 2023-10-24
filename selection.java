//  user from the input one is saving and current , *//
class college
 {

    String clgname= "vit";
    int yearpassed=2022;
    public void year(){
        System.out.println("year passed :"+ "" + yearpassed+""+ clgname);
    }
}
class teacher extends college
{
    int addmissionno= 1001;
    int exper=6;
    String name = "saniya";
    public void year(){
        System.out.println( addmissionno +" experience"+ "" +exper+"name "+name );
    if(exper>3){
        System.out.println("your selected");
        super.year();
    }
    else{
        System.out.println("your are rejected");
    }
}
}
class student extends college 
{
    int no;
    String nem;
    student(int roll , String name){
        no = roll;
        nem = name;
    }
    int S1rank=99 ;
    
    public void year(){
        System.out.println(no+""+nem);
    if(S1rank<100){
        System.out.println("YOUR SELECTED FOR CLG");
        super.year();
    }
    else{
        System.out.println("your are rejected");
    }
  
    int S2rank=102 ;
        System.out.println(no+""+nem);
    if(S2rank<100){
        System.out.println("YOUR SELECTED FOR CLG");
    }
    else{
        System.out.println("your are rejected");
    }
}
}

public class selection{
    public static void main(String[] args) 
    {
        college clg1=new college();
        clg1.year();
        teacher t1= new teacher();
        t1.year();
        student s1=new student(1101,"jhon");
        student s2=new student(1102,"harish");
        s1.year();
        s2.year();
 }
}
