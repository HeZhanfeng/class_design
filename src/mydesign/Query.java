/**
 * ��ѯ��
 * ����ҵ��Ա��Ż�����
 * ���ҵ��Ա��������Ϣ
 * */
package mydesign;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.io.*;

class Query implements ActionListener{
	JFrame f;
	JButton b;
	Container cp;
	String a = null;
	JLabel label = null;
	JLabel label1 = null;
	JLabel label2 = null;
	JTextField jtf = null;
	String value;
	Query(){
		f = new JFrame("��ѯ��Ϣ");
		f.setSize(280,200);//���ô�С
		
		cp = f.getContentPane();//�������
		cp.setLayout(new FlowLayout());//���Ĳ��ַ�ʽ
		
		label2 = new JLabel("������ҵ��Ա��Ż�����:");
		jtf = new JTextField(15);
		cp.add(label2);
		cp.add(jtf);
		
		b = new JButton("ȷ��");//������ť
		cp.add(b);//��Ӱ�ť
		b.addActionListener(this);//��Ӽ�������
		
		label = new JLabel("���"+"\0\0"+"����"+"\0\0"+"�Ա�"+"\0\0"+"����"+"\0\0"+"����");
		cp.add(label);
		
		
		f.setVisible(true);//��ʾ����
		f.setLocationRelativeTo(null);//�������
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		value = jtf.getText();//��ȡ�ı��������ֵ
		//System.out.println("value="+value);
		try {

			BufferedReader bfr=new BufferedReader(new InputStreamReader(
					new FileInputStream("D:/JavaCode/class_design/info.txt")));
			
			try {
				
				do {
					a=bfr.readLine();
					String[] strs = a.split(" ");
					String[] strs1 = {strs[0],strs[1],strs[2],strs[3],strs[4]};
					String c = "";
				    //��strs1����ת���ַ���a
					for(String j:strs1){
						c += j+" "; 
					}
					//System.out.println(strs[0]);
					if(value.trim().equals(strs[0])||value.trim().equals(strs[1])){
							//System.out.println(value.trim().equals(strs[0]));
							label2 = new JLabel(c);
							cp.add(label2);
							jtf.setText("");
							f.setVisible(true);//��ʾ����
							f.setLocationRelativeTo(null);//�������
							break;
					}
					else{
						continue;
					}
				}while(a!=null);
				
				bfr.close();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
		}
		
	}

}

