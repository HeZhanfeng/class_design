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
		f = new JFrame("建立业务员信息表");
		f.setSize(250,320);//设置大小
		
		cp = f.getContentPane();//加载面板
		cp.setLayout(new FlowLayout());//更改布局方式
		
		label = new JLabel("编号:");
		tf = new JTextField(15);
		cp.add(label);
		cp.add(tf);
		
		label1 = new JLabel("姓名:");
		tf1 = new JTextField(15);
		cp.add(label1);
		cp.add(tf1);
		
		label2 = new JLabel("性别:");
		tf2 = new JTextField(15);
		cp.add(label2);
		cp.add(tf2);
		
		label3 = new JLabel("部门:");
		tf3 = new JTextField(15);
		cp.add(label3);
		cp.add(tf3);
		
		label4 = new JLabel("工资:");
		tf4 = new JTextField(15);
		cp.add(label4);
		cp.add(tf4);
		
		b = new JButton("提交信息");//创建按钮
		cp.add(b);//添加按钮
		b.addActionListener(this);//添加监听机制
		
		f.setVisible(true);//显示窗体
		f.setLocationRelativeTo(null);//窗体居中
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
			pw = new PrintWriter(new BufferedWriter(new FileWriter("info.txt",
					true)));
			ID = tf.getText();//获取ID文本框输入的值
			name = tf1.getText();//获取姓名文本框输入的值
			sex = tf2.getText();//获取姓名文本框输入的值
			department = tf3.getText();//获取部门文本框输入的值
			pay = tf4.getText();//获取工资文本框输入的值
			//判空让Text的内容点上equals("");如果真表示没有输入内容，则提示。
			if(ID.trim().equals("")||name.trim().equals("")||
					sex.trim().equals("")||department.trim().equals("")||
					pay.trim().equals("")){//trim()去掉空格
				//警告提示
				JOptionPane.showMessageDialog(null, "您的输入有误!", "警告", JOptionPane.OK_OPTION);
			}
			else{
				pw.write(ID);
				pw.write("\0");
				tf.setText("");
				
				pw.write(name);
				pw.write("\0");
				tf1.setText("");
				
				pw.write(sex);
				pw.write("\0");
				tf2.setText("");
				
				pw.write(department);
				pw.write("\0");
				tf3.setText("");
				
				pw.write(pay);
				pw.write("\r\n");
				pw.flush();
				tf4.setText("");
			}			
			
		} 
		catch (IOException e1) {
			
			e1.printStackTrace();
		}
		// 关闭流资源
		finally {
			pw.flush();
			pw.close();
			
		}
		
	}
}
