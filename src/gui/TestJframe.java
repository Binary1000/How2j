package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class TestJframe {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("jframe");
		jFrame.setSize(800, 800);
		jFrame.setLayout(null);
		JButton jButton = new JButton("打开一个模态窗口");
		jButton.setBounds(50, 50, 200, 200);
//		jButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				JDialog jDialog = new JDialog(jFrame);
//				jDialog.setModal(true);
//				jDialog.setSize(400,400);
//				jDialog.setLocation(200, 200);
//				jDialog.setLayout(null);
//				jDialog.setVisible(true);
//			}
//		});
		jFrame.setVisible(true);
		jFrame.add(jButton);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
