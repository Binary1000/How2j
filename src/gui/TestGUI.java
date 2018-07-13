package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TestGUI {
	public static void main(String[] args) {
		//主窗体
		JFrame jFrame = new JFrame("Test");
		//设置大小
		jFrame.setSize(400, 400);
		//设置位置
		jFrame.setLocation(200, 200);
		jFrame.setLayout(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
		toggleDisplay(jFrame);

	}
	
	public static void toggleDisplay(JFrame jFrame) {
		JLabel jLabel = new JLabel();
		JLabel l = jLabel;
		ImageIcon icon = new ImageIcon("C:/Users/Administrator/Desktop/1.png");
		jLabel.setIcon(icon);
		jLabel.setBounds(50, 50, icon.getIconWidth(), icon.getIconHeight());
		JButton jButton = new JButton("隐藏图片");
		jButton.setBounds(100, 100, 200, 50);
		jButton.addActionListener(new ActionListener() {
			
			boolean hide = false;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jLabel.setVisible(hide);
				hide = !hide;
				jButton.setText(hide ? "显示图片" : "隐藏图片");
				
			}
		});
		
		jFrame.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				int step = 10;
                if (e.getKeyCode() == 38) {
                    // 图片向上移动 （x坐标不变，y坐标减少）
                    l.setLocation(l.getX() , l.getY()- step);
                }
                if (e.getKeyCode() == 40) {
                    // 图片向下移动 （x坐标不变，y坐标增加）
                    l.setLocation(l.getX() , l.getY()+ step);
                }
                if (e.getKeyCode() == 37) {
                    // 图片向左移动 （y坐标不变，x坐标减少）
                    l.setLocation(l.getX() - step, l.getY());
                }               
                if (e.getKeyCode() == 39) {
                    // 图片向右移动 （y坐标不变，x坐标增加）
                    l.setLocation(l.getX() + step, l.getY());
                }
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		jFrame.add(jButton);
		jFrame.add(jLabel);
	}
	
	public static void movePicture() {
		
	}
	
}
