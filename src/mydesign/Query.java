/**
 * ��ѯ��
 * ����ҵ��Ա��Ż�����
 * ���ҵ��Ա��������Ϣ
 * */
package mydesign;
import java.awt.*;

import javax.swing.*;

import java.io.*;

class Query {
	JFrame f;
	JButton b;
	Container cp;
	String a = null;
	JLabel label = null;
	JLabel label1 = null;
	Query(){
		f = new JFrame("��ѯ��Ϣ");
		f.setSize(250,320);//���ô�С
		
		cp = f.getContentPane();//�������
		cp.setLayout(new FlowLayout());//���Ĳ��ַ�ʽ
		
		label = new JLabel("���"+"\0\0"+"����"+"\0\0"+"�Ա�"+"\0\0"+"����"+"\0\0"+"����");
		cp.add(label);
		
		try {

			BufferedReader Ia=new BufferedReader(new InputStreamReader(
					new FileInputStream("D:/JavaCode/class_design/info.txt")));
			
			try {
				
				do {
					a=Ia.readLine();					
					label1 = new JLabel(a);
					cp.add(label1);
				}while(a!=null);
				
				Ia.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		}
		f.setVisible(true);//��ʾ����
		f.setLocationRelativeTo(null);//�������
	}

}

