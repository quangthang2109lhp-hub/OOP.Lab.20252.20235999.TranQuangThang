import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ex2_6_linear{
    public static void main(String[] args) {
        String str1,str2;
        double a;
        while(true){
        str1=JOptionPane.showInputDialog("Please enter a of ax+b=0 : ");
        a=Double.parseDouble(str1);
        if(a==0) 
        {
            JOptionPane.showMessageDialog(null, "Please enter again, a must be different 0!!!");
            continue;
        }
        else break;
        }
        
        str2=JOptionPane.showInputDialog("Please enter b of ax+b=0 : ");
        double b=Double.parseDouble(str2);
        
        double c=-b/a;
        JOptionPane.showMessageDialog(null, "The root of linear equation is : "+c);
                  
    }
}