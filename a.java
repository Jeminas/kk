package neww;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class a {
	 public static void main(String agrs[]) {
		  JFrame frame = new JFrame("����ϵͳ");  
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		  JLabel label = new JLabel("�����淶");
		  label.setPreferredSize(new Dimension(1000,700));
		  frame.getContentPane().add(label, BorderLayout.CENTER);  
		  frame.pack();
		  frame.setVisible(true);
		 }
}
