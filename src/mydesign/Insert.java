/**
 * 
 * */
package mydesign;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
class Insert implements ActionListener{

	JFrame f;
	JButton b;
	Container cp;
	
	JLabel label = null;
	JTextField tf = null;
	
	JLabel label1 = null;
	JTextField tf1 = null;
	
	JLabel label2 = null;
	JTextField tf2 = null;
	
	JLabel label3 = null;
	JTextField tf3 = null;
	
	JLabel label4 = null;
	JTextField tf4 = null;
	
	String name = null;
	String sex = null;
	String department = null;
	String pay = null;
	String ID = null;
	PrintWriter pw = null;
	String inputValue = null;
	
	Insert(){
		f = new JFrame("����ҵ��Ա��Ϣ��");
		f.setSize(250,320);//���ô�С
		
		cp = f.getContentPane();//�������
		cp.setLayout(new FlowLayout());//���Ĳ��ַ�ʽ
		
		label = new JLabel("���:");
		tf = new JTextField(15);
		cp.add(label);
		cp.add(tf);
		
		label1 = new JLabel("����:");
		tf1 = new JTextField(15);
		cp.add(label1);
		cp.add(tf1);
		
		label2 = new JLabel("�Ա�:");
		tf2 = new JTextField(15);
		cp.add(label2);
		cp.add(tf2);
		
		label3 = new JLabel("����:");
		tf3 = new JTextField(15);
		cp.add(label3);
		cp.add(tf3);
		
		label4 = new JLabel("����:");
		tf4 = new JTextField(15);
		cp.add(label4);
		cp.add(tf4);
		
		b = new JButton("�ύ��Ϣ");//������ť
		cp.add(b);//���Ӱ�ť
		b.addActionListener(this);//���Ӽ�������
		
		f.setVisible(true);//��ʾ����
		f.setLocationRelativeTo(null);//�������
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ر�
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
			pw = new PrintWriter(new BufferedWriter(new FileWriter("info.txt",
					true)));
			ID = tf.getText();//��ȡID�ı��������ֵ
			//Pattern pattern = Pattern.compile("[0-9]");
			//�п���Text�����ݵ���equals("");������ʾû���������ݣ�����ʾ��
			if(ID.trim().equals("")){//trim()ȥ���ո�
				JOptionPane.showMessageDialog(null, "��û��������!", "����", JOptionPane.OK_OPTION);
			}
			else{
				pw.write(ID);
				pw.write("\0");
				pw.flush();
				tf.setText("");
			}
			
			name = tf1.getText();//��ȡ�����ı��������ֵ
			if(name.trim().equals("")){//trim()ȥ���ո�
				JOptionPane.showMessageDialog(null, "��û����������!", "����", JOptionPane.OK_OPTION);
			}
			else{
				pw.write(name);
				pw.write("\0");
				pw.flush();
				tf1.setText("");
			}
			
			sex = tf2.getText();//��ȡ�����ı��������ֵ
			if(sex.trim().equals("")){//trim()ȥ���ո�
				JOptionPane.showMessageDialog(null, "��û�������Ա�!", "����", JOptionPane.OK_OPTION);
			}
			else if(sex.equals("��")||sex.equals("Ů")){
				pw.write(sex);
				pw.write("\0");
				pw.flush();
				tf2.setText("");
			}
			else{
				JOptionPane.showMessageDialog(null, "��������Ա�����!", "����", JOptionPane.OK_OPTION);
			}
			
			department = tf3.getText();//��ȡ�����ı��������ֵ
			if(department.trim().equals("")){//trim()ȥ���ո�
				JOptionPane.showMessageDialog(null, "��û�����벿����Ϣ!", "����", JOptionPane.OK_OPTION);
			}
			else{
				pw.write(department);
				pw.write("\0");
				pw.flush();
				tf3.setText("");
			}
			
			pay = tf4.getText();//��ȡ�����ı��������ֵ
			if(pay.trim().equals("")){//trim()ȥ���ո�
				JOptionPane.showMessageDialog(null, "��û�����빤��!", "����", JOptionPane.OK_OPTION);
			}
			else{
				pw.write(pay);
				pw.write("\r\n");
				pw.flush();
				tf4.setText("");
			}
			
			
		} 
		catch (IOException e1) {
			
			e1.printStackTrace();
		}
		// �ر�����Դ
		finally {
			pw.close();
			
		}
		
	}
}