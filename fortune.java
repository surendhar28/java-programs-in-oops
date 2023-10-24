import java.util.Scanner;
public class fortune{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int Fortune = sc.nextInt();
    System.out.println("enter numbers from 0 to 9: ");
    switch (Fortune){
        case 0:
            System.out.println(" you got a good start today.");
            break;
        
        case 1:
            System.out.println("it's a heavenly day to get your work done");
            break;
            
        case 2:
            System.out.println(" Off to a great start");
            break;
            
        case 3:
            System.out.println(" take a deep breath before your work");
            break;
            
        case 4:
            System.out.println(" mid day brrrrr");
            break;
            
        case 5:
            System.out.println(" gonna have a bad day");
            break;
            
        case 6:
            System.out.println("you prolly gonna burn in hell");
            break;
            
        case 7:
            System.out.println("your soul is gonna be taken by the soul reaper");
            break;
            
        case 8:
            System.out.println(" Your omen is controlled by hell");
            break;
            
        case 9:
            System.out.println(" ungamma upma");
            break;
        
        default:
        System.out.println(" invalid number brrr skrrt");
        
    }
}
}