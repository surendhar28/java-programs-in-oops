class test{
    public static void main(String[] args)
    {
        try
        {
            throw new Exception(2);
            
        }
        catch ( Exception e ){
            System.out.println(e);
        }
    }
}
public class Exception extends myException{
    int a;
    Exception(int b)
    {
        a=b;
    }
    public String toString(){
        return("Exception number ="+ a);
    }
}