import java.util.Scanner;
public class No_Guessing_Game{
    public static void game(){
        int min=1;
        int max=100;
        int range=max-min+1;
        int rand=(int)(Math.random()*range)+min;
        Scanner obj=new Scanner(System.in);
        int attempts=0;
        do{
        System.out.print("Guess the number : ");
        int userNum=obj.nextInt();
        if(userNum==rand){
            System.out.println("👏Great! you got the number..");
            break;
        }
        else if(userNum<rand){
            attempts++;
            if(attempts==3){
                System.out.println("Sorry..! Well tried....\nBetter luck next time.");
            }
            else{
                System.out.println("Oops! Not exactly");
                System.out.println("Try Guessing greater than "+userNum);
            }
        }
        else{
            attempts++;
            if(attempts==3){
                System.out.println("Sorry..! Well tried....\nBetter luck next time.");
            }
            else{
                System.out.println("Oops! Not exactly");
                System.out.println("Try Guessing smaller than "+userNum);
            }
            
        }
        }while(attempts<3);
        obj.close();
    }
    public static void main(String[] args){
        game();
    }
}