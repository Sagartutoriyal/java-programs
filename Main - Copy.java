/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//sagar gupta
//program #2//
import java.util.*;
public class Box{
    private int length;
    private int breadth;
    private int height;
    Box(int l,int b,int h){
        this.length=l;
        this.breadth=b;
        this.height=h;
    }
    void getDimension(){
        System.out.println("The length of box is "+length);
        System.out.println("The bredth of box is "+breadth);
        System.out.println("The height of box is "+height);
    }
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the Length of box: ");
       int Length=s.nextInt();
       System.out.print("Enter the Breadth of box: ");
       int Breadth=s.nextInt();
       System.out.print("Enter the Height of box: ");
       int Height=s.nextInt();
       Box c=new Box(Length,Breadth,Height);
       c.getDimension();

    }
}