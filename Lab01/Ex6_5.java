import javax.swing.JOptionPane;
public class Ex6_5 {
    public static void quickSort(double a[], int left, int right) {
        int i = left;
        int j = right;
        double pivot = a[(left + right) / 2];
        while (i <= j) {
            while (a[i] < pivot) i++;
            while (a[j] > pivot) j--;
            if (i <= j) {
                double temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j) quickSort(a, left, j);
        if (i < right) quickSort(a, i, right);
    }
    public static void main(String[] args) {
        int n;
        while(true)
        {
        String s;
        s= JOptionPane.showInputDialog("Enter number of elements in array:");
        n = Integer.parseInt(s);
        if(n<=0) 
        {
            JOptionPane.showMessageDialog(null,"Invalid number, please enter an integer n and n>=1");
        }
        else break;
        }
        double arr[]=new double [n];
        for (int i = 0; i < n; i++) {
            String t;
            t = JOptionPane.showInputDialog("Enter element " + (i + 1));
            arr[i] = Double.parseDouble(t);
        }
        quickSort(arr, 0, n - 1);
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        String result="";
        for(int i=0;i<n;i++)
        {
            result =result +arr[i]+" ";
        }
        double avg = sum / n;
        JOptionPane.showMessageDialog(null,"Sorted array: " +result+'\n'+"Sum = "+sum+'\n'+"Average value = " +avg);
        System.exit(0);
    }
}