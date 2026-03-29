import static java.lang.Math.sqrt;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Bai2_6_The_system_of_first_degree_equations{
    public static void main(String[] args) {
        String str11,str12,str21,str22,strb1,strb2;
        double a11;
        
        str11=JOptionPane.showInputDialog("Please enter a11 of \n"
                + "a11*x1+a12*x2 = b1\n"
                + "a21*x1+a22*x2 = b2");
        a11=Double.parseDouble(str11);
       
        str12=JOptionPane.showInputDialog("Please enter a12 of \n"
                + "a11*x1+a12*x2 = b1\n"
                + "a21*x1+a22*x2 = b2");
        double a12=Double.parseDouble(str12);
        
        strb1=JOptionPane.showInputDialog("Please enter b1 of \n"
                + "a11*x1+a12*x2 = b1\n"
                + "a21*x1+a22*x2 = b2");
        double b1=Double.parseDouble(strb1);
        
         str21=JOptionPane.showInputDialog("Please enter a21 of \n"
                + "a11*x1+a12*x2 = b1\n"
                + "a21*x1+a22*x2 = b2");
        double a21=Double.parseDouble(str21);
       
        str22=JOptionPane.showInputDialog("Please enter a22 of \n"
                + "a11*x1+a12*x2 = b1\n"
                + "a21*x1+a22*x2 = b2");
        double a22=Double.parseDouble(str22);
        
         strb2=JOptionPane.showInputDialog("Please enter b2 of \n"
                + "a11*x1+a12*x2 = b1\n"
                + "a21*x1+a22*x2 = b2");
        double b2=Double.parseDouble(strb2);
        
        double D=a11*a22-a12*a21;
        double D1=b1*a22-b2*a12;
        double D2=a11*b2-a21*b1;
        double x1=D1/D;
        double x2=D2/D;
        if(D==0)
        {
            if(D1==D2) JOptionPane.showMessageDialog(null, "The system of first-degree-equations has infinitely many solutions");
            else JOptionPane.showMessageDialog(null, "The system of first-degree-equations has no solution");
        }
        else JOptionPane.showMessageDialog(null, "The system of first-degree-equations has the solution (x1,x2) : ("+x1+","+x2+")");
    }
}