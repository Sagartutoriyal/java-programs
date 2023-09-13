/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// sagar gupta
//program#1//
class Calci
{   
    private int i;
    private int j;
    Calci(int x,int y){
        i=x;
        j=y;
    }
    public void add(){
        System.out.println("The sum of number assessed is "+(i+j));
    }
    public void sub(){
        System.out.println("The subraction of number assessed is "+(i-j));
    }
    public void mult(){
        System.out.println("The multiplication of number assessed is "+(i*j));
    }
}
    public class A{
        public static void main(String[] args){
            Calci c=new Calci(3,4);
            c.add();
            c.sub();
            c.mult();
        }    
    }