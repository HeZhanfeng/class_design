package mydesign;

import java.io.File;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;

class ReName implements ActionListener{
	JFrame f;
	JButton b;
	Container cp;
	String a = null;
	JLabel label = null;
	JLabel label1 = null;
	JLabel label2 = null;
	JTextField jtf = null;
	BufferedReader bfr = null;
	String value;
	PrintWriter tempFile = null;
	public void rename(){
		f = new JFrame("ɾ��ҵ��Ա��Ϣ");
		f.setSize(180,100);//���ô�С
		
		cp = f.getContentPane();//�������
		cp.setLayout(new FlowLayout());//���Ĳ��ַ�ʽ
		
		//label2 = new JLabel("��������Ҫɾ����ҵ��Ա��Ż�����:");
		//jtf = new JTextField(15);
		//cp.add(label2);
		//cp.add(jtf);
		
		b = new JButton("ȷ��ɾ����");//������ť
		cp.add(b);//��Ӱ�ť
		b.addActionListener(this);//��Ӽ�������
		
		f.setVisible(true);//��ʾ����
		f.setLocationRelativeTo(null);//�������
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
			System.out.println("����");
			File file = new File("D:/JavaCode/class_design/data.txt");
		
			File newFile = new File("D:/JavaCode/class_design/info.txt");
			
			if (!file.exists() || newFile.isDirectory()) {

		            System.out.println("File does not exist: " + file);
		            return;
		    }
			
			if(file.renameTo(newFile)){
				System.out.println("�޸ĳɹ�");
			}
			else{
				System.out.println("�޸�ʧ��");
			}
			
	}
	
}
