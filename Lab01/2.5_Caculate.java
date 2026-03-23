import javax.swing.JOptionPane;
public class Caculate{
    public static void main(String[] args) {
        String strNum1,strNum2;
        String strNotification="You 've just entered: ";
        
        strNum1=JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
        double num1=Double.parseDouble(strNum1);
        strNum2=JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
        double num2=Double.parseDouble(strNum2);
        double tong=num1+num2;
        double hieu=num1-num2;
        double tich=num1*num2;
        if(num2==0)
        {
              JOptionPane.showMessageDialog(null,"The sum of "+num1+" and "+num2+" is "+tong+"\n"+
                      "The difference of "+num1+" and "+num2+" is "+hieu+"\n"+
                       "The product of "+num1+" and "+num2+" is "+tich+"\n"+
                       "There is no quotient because the divisor is equal to 0!"
                      ,"Print the result",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            double thuong=num1/num2;
             JOptionPane.showMessageDialog(null,"The sum of "+num1+" and "+num2+" is "+tong+"\n"+
                      "The difference of "+num1+" and "+num2+" is "+hieu+"\n"+
                       "The product of "+num1+" and "+num2+" is "+tich+"\n"+
                       "The quotient of "+num1+" and "+num2+" is "+thuong+"\n"
                     ,"Print the result",JOptionPane.INFORMATION_MESSAGE);
        }
      
        System.exit(0);
    }
}
