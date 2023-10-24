class vechile
 {
    
    int Discount =30;
    public void discount(){
    System.out.println(" THE DISCOUNT"+Discount+"%");
    }
}
class bicycle extends vechile 
{
    int id= 99;
    int Discount=10;
    public void discount(){
        if(id < 100)
        {
            super.discount();
        }
        else
        {
            System.out.println("THE DISCOUNT IS "+Discount+"%");
        }
    }
}
class bike extends vechile{
    int id= 102;
    int Discount=20;
    public void discount(){
        if(id < 100)
        {
            super.discount();
        }
        else
        {
            System.out.println("THE DISCOUNT IS "+Discount+"%");
        }
    }
}
class car extends vechile{
    int id= 102;
    int Discount=25;
    public void discount(){
        if(id < 100)
        {
            super.discount();
        }
        else
        {
            System.out.println("THE DISCOUNT IS "+Discount+"%");
        }
    }
}
class shop{
 public static void main(String[] args) {
    vechile d1=new vechile();
    bicycle b1=new bicycle();
    bike b2=new bike();
    car c1=new car();
    d1.discount();
    b1.discount();
    b2.discount();
    c1.discount();
    
}
}