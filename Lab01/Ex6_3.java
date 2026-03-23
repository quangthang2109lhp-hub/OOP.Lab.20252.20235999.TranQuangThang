import javax.swing.JOptionPane;
public class Ex6_3 {
    public static void main(String[] args) {
        int n;
        while(true)
        {
        String nhap;
        nhap = JOptionPane.showInputDialog("Enter n");
        n = Integer.parseInt(nhap);
        if(n<1)
        {
            JOptionPane.showMessageDialog(null,"Please enter n again (n>=1)");
        }
        else
        { 
        break;
        }
        }
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) 
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.exit(0);
    }
}