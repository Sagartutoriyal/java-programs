/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
Sagar gupta 
program #5
import java.util.*;
public class Light{
    boolean On;
    void switchOn(){
        On=true;
        System.out.println(On);
    }
    void switchOff(){
        On=false;
        System.out.println(On);
    }
    public static void main(String[] args) {
       Light led=new Light();
       Light halogen=new Light();
       led.switchOn();
       halogen.switchOff();
    }
}