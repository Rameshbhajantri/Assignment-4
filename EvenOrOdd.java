import javax.swing.*;
import java.awt.*;
import java.awt,event.*;
/*
Lapplet code= "EvenOrOdd" width=500 height=600>
*/
public class EvenOrOdd extends JApplet
{
JLabel j1;
public void init()
{
try
{
SwingUtilities.invokeLater(new Runnable()
{
public void run()
{
makeGUI();
}
};
}
Catch(Exception e)
{
Systemout.println(e);
}
}
public void makeGUI()
{
SetLayout(new Flow Layout(Flow Layout.LEFT));
l1=new Jlable("Enter the number");
JTextFieldjt1=new
JTextField(20);
add(l1);
add(jt1);
j1=new JLabel(" ");
add(jt1);
jButton jb=new JButton(EvenOrOdd)
jb.addactionListeners(new ActionListener()
{
public void ActionPerformed(ActionEvent ae)
{int i=Integer.parse Int(jt.getText());
if(i%2==0)
J1.SetText("even number")
Else 
J1.setText("odd number")
j1.setText(string.value of (EvenOrOdd));
}
});
add(jb);
}
}
