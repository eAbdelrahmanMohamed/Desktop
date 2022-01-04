import javax.swing.*;
import static javax.swing.JOptionPane.*;
 public class FirstSwing {

    public static void main(String[] args){
        int []salaries =new int[10];
        float sum = 0,avg;
        StringBuilder OUTPUT=new StringBuilder();
        int x = 0,i=0;
        for( i=0;i<10;i++) {
            String[] Ssum= new String[10];
            Ssum[i]=showInputDialog("please enter salary for emp "+ (i+1));
            salaries[i]=Integer.parseInt(Ssum[i]);
            sum+=salaries[i];
            OUTPUT.append("salary of  employee number:"+(i+1)+Ssum[i].toString()+"\n");
        }

        avg= (sum/10);
        JOptionPane.showMessageDialog(null,"salary\n"+OUTPUT+"\navg is :"+avg +"\n and the sum is "+sum);
    }}
