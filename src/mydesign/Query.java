/**
 * 查询：
 * 输入业务员编号或姓名
 * 输出业务员的所有信息
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
		f = new JFrame("查询信息");
		f.setSize(250,320);//设置大小
		
		cp = f.getContentPane();//加载面板
		cp.setLayout(new FlowLayout());//更改布局方式
		
		label = new JLabel("编号"+"\0\0"+"姓名"+"\0\0"+"性别"+"\0\0"+"部门"+"\0\0"+"工资");
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
		f.setVisible(true);//显示窗体
		f.setLocationRelativeTo(null);//窗体居中
	}

}

