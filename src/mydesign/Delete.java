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

class Delete implements ActionListener{
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
	public void delete(){
		f = new JFrame("ɾ��ҵ��Ա��Ϣ");
		f.setSize(280,200);//���ô�С
		
		cp = f.getContentPane();//�������
		cp.setLayout(new FlowLayout());//���Ĳ��ַ�ʽ
		
		label2 = new JLabel("��������Ҫɾ����ҵ��Ա��Ż�����:");
		jtf = new JTextField(15);
		cp.add(label2);
		cp.add(jtf);
		
		b = new JButton("ȷ��");//������ť
		cp.add(b);//��Ӱ�ť
		b.addActionListener(this);//��Ӽ�������
		
		f.setVisible(true);//��ʾ����
		f.setLocationRelativeTo(null);//�������
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		value = jtf.getText();//��ȡ�ı��������ֵ
		//System.out.println("value="+value);
		try {

			bfr=new BufferedReader(new InputStreamReader(
					new FileInputStream("D:/JavaCode/class_design/info.txt")));
			
			try {
				tempFile = new PrintWriter(new BufferedWriter(new FileWriter("data.txt",
						true)));
			} catch (IOException e2) {
				// TODO �Զ����ɵ� catch ��
				System.out.println("�������ļ�ʧ�ܣ�");
			}
			
			//PrintWriter pw = new PrintWriter(new FileWriter("tempFile"));
			try {
				
				do {
					a=bfr.readLine();
					String[] strs = a.split(" ");
					//String[] strs1 = {strs[0],strs[1],strs[2],strs[3],strs[4]};
//					String c = "";
//				    //��strs1����ת���ַ���a
//					for(String j:strs1){
//						c += j+" "; 
//					}
					//System.out.println(strs[0]);
					
			
					if(value.trim().equals(strs[0])||value.trim().equals(strs[1])){
							//System.out.println(value.trim().equals(strs[0]));
							
//							label2 = new JLabel(c);
//							cp.add(label2);
							jtf.setText("");
							f.setVisible(true);//��ʾ����
							f.setLocationRelativeTo(null);//�������
							continue;
					}
					else{
						tempFile.println(a);
						tempFile.flush();
						continue;
					}
				}while(a!=null);
				
				
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			

		} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
		}
		finally{
			
			
			
			try {
				bfr.close();
			} catch (IOException e1) {
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			}
			tempFile.close();
		}
	}
}


