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
		//������
		JFrame jFrame = new JFrame("Test");
		//���ô�С
		jFrame.setSize(400, 400);
		//����λ��
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
		JButton jButton = new JButton("����ͼƬ");
		jButton.setBounds(100, 100, 200, 50);
		jButton.addActionListener(new ActionListener() {
			
			boolean hide = false;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jLabel.setVisible(hide);
				hide = !hide;
				jButton.setText(hide ? "��ʾͼƬ" : "����ͼƬ");
				
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
                    // ͼƬ�����ƶ� ��x���겻�䣬y������٣�
                    l.setLocation(l.getX() , l.getY()- step);
                }
                if (e.getKeyCode() == 40) {
                    // ͼƬ�����ƶ� ��x���겻�䣬y�������ӣ�
                    l.setLocation(l.getX() , l.getY()+ step);
                }
                if (e.getKeyCode() == 37) {
                    // ͼƬ�����ƶ� ��y���겻�䣬x������٣�
                    l.setLocation(l.getX() - step, l.getY());
                }               
                if (e.getKeyCode() == 39) {
                    // ͼƬ�����ƶ� ��y���겻�䣬x�������ӣ�
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
