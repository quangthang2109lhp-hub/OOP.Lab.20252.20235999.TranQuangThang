import static java.lang.Math.sqrt;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Bai2_6_second_degree_equation{
    public static void main(String[] args) {
        String str1,str2,str3;
        double a;
        while(true){
        str1=JOptionPane.showInputDialog("Please enter a of ax^2+bx+c=0 : ");
        a=Double.parseDouble(str1);
        if(a==0) 
        {
            JOptionPane.showMessageDialog(null, "Please enter again, a must be different 0!!!");
            continue;
        }
        else break;
        }
        
        str2=JOptionPane.showInputDialog("Please enter b of ax^2+bx+c=0 : ");
        double b=Double.parseDouble(str2);
        
        str3=JOptionPane.showInputDialog("Please enter c of ax^2+bx+c=0 : ");
        double c=Double.parseDouble(str3);
        double d=b*b-4*a*c;
        double kep=-b/(2*a);
        double x1=(-b+sqrt(d))/(2*a);
        double x2=(-b-sqrt(d))/(2*a);
        if(d<0) JOptionPane.showMessageDialog(null, "The second degree equation has no root");
        else if(d==0) JOptionPane.showMessageDialog(null, "The second degree equation has a double root :"+kep);
        else 
        {
            JOptionPane.showMessageDialog(null, "The second degree equation has two roots : \n x1 = "+x1+"\n x2 = "+x2);
        }
        
                  
    }
}