import javax.swing.JOptionPane;
public class Ex6_4 {
    public static void main(String[] args) {
        int month = 0;
        int year;
        while(true)
        {
            String m;
            m = JOptionPane.showInputDialog("Enter month");
            m=m.toLowerCase();
            if(m.equals("january") || m.equals("jan") || m.equals("jan.") || m.equals("1")) month = 1;
            else if(m.equals("february") || m.equals("feb") || m.equals("feb.") || m.equals("2")) month = 2;
            else if(m.equals("march") || m.equals("mar") || m.equals("mar.") || m.equals("3")) month = 3;
            else if(m.equals("april") || m.equals("apr") || m.equals("apr.") || m.equals("4")) month = 4;
            else if(m.equals("may") || m.equals("5")) month = 5;
            else if(m.equals("june") || m.equals("jun") || m.equals("6")) month = 6;
            else if(m.equals("july") || m.equals("jul") || m.equals("7")) month = 7;
            else if(m.equals("august") || m.equals("aug") ||m.equals("aug.")|| m.equals("8")) month = 8;
            else if(m.equals("september") || m.equals("sep") || m.equals("sept.") || m.equals("9")) month = 9;
            else if(m.equals("october") || m.equals("oct") ||m.equals("oct.")|| m.equals("10")) month = 10;
            else if(m.equals("november") || m.equals("nov") ||m.equals("nov.")|| m.equals("11")) month = 11;
            else if(m.equals("december") || m.equals("dec") ||m.equals("dec.")|| m.equals("12")) month = 12;
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid month, enter again");
                continue;
            }
            break;
        }
        while(true)
        {
            String y;
            y = JOptionPane.showInputDialog("Enter year");
            year = Integer.parseInt(y);
            if(year < 0)
            {
                JOptionPane.showMessageDialog(null,"Invalid year, enter again ( You must enter a year in a non-negative number and enter all the digits)");
            }
            else break;
        }
        int day = 0;
        switch(month)
        {
            case 1: day = 31; break;
            case 2:
                if((year%4==0&&year%100!=0)||year%400==0) day=29;
                else day=28;
                break;
            case 3: day = 31; break;
            case 4: day = 30; break;
            case 5: day = 31; break;
            case 6: day = 30; break;
            case 7: day = 31; break;
            case 8: day = 31; break;
            case 9: day = 30; break;
            case 10: day = 31; break;
            case 11: day = 30; break;
            case 12: day = 31; break;
        }
        JOptionPane.showMessageDialog(null,"Number of days in "+month+"/"+year+" is " + day);
        System.exit(0);
    }
}