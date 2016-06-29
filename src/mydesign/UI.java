package mydesign;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UI implements ActionListener{
	
	JFrame f;
	JButton b1,b2,b3,b4,b5,b6,b;
	Container cp;
	private JLabel label;

	UI(){
		f = new JFrame("业务员业绩管理系统");
		f.setSize(360,455);//设置大小
		
		cp = f.getContentPane();//加载面板
		cp.setLayout(new FlowLayout(1));//改成流式布局
		
		setLayout(new FlowLayout());
        label = new JLabel("欢迎使用业务员业绩管理系统");
        cp.add(label);
        
		b1 = new JButton("1、   建立业务员信息表");//创建按钮
		b1.setPreferredSize(new Dimension(175,25));
		b1.setBounds(100,150,175,25);
		cp.add(b1);//添加按钮
		b1.addActionListener(this);//添加监听机制
		
		b2 = new JButton("2、   插入新业务员信息");//创建按钮
		b2.setPreferredSize(new Dimension(175,25));
		cp.add(b2);//添加按钮
		b2.addActionListener(this);//添加监听机制
		
		b3 = new JButton("3、查询业务员信息记录");//创建按钮
		b3.setPreferredSize(new Dimension(175,25));
		cp.add(b3);//添加按钮
		b3.addActionListener(this);//添加监听机制
		
		b4 = new JButton("4、        删除业务员信息");//创建按钮
		b4.setPreferredSize(new Dimension(175,25));
		cp.add(b4);//添加按钮
		b4.addActionListener(this);//添加监听机制
		
		b5 = new JButton("5、        业务员业绩排序");//创建按钮
		b5.setPreferredSize(new Dimension(175,25));
		cp.add(b5);//添加按钮
		b5.addActionListener(this);//添加监听机制
		
		b6 = new JButton("6、显示所有业务员信息");//创建按钮
		b6.setPreferredSize(new Dimension(175,25));
		cp.add(b6);//添加按钮
		b6.addActionListener(this);//添加监听机制
		
		b = new JButton("0、           退出管理系统");//创建按钮
		b.setPreferredSize(new Dimension(175,25));
		cp.add(b);//添加按钮
		b.addActionListener(this);//添加监听机制
		
		f.setVisible(true);//显示窗体
		f.setLocationRelativeTo(null);//窗体居中
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭
	}

	private void setLayout(FlowLayout flowLayout) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//监听到事件
		if(e.getSource()==b1){
			new Insert();//建立信息表调用插入类
		}
		else if(e.getSource()==b2){
			new Insert();//插入新业务员信息调用插入类
		}
		else if(e.getSource()==b3){
			new Query();
		}
		else if(e.getSource()==b4){
			
		}
		else if(e.getSource()==b5){
			new Sort();
		}
		else if(e.getSource()==b6){
			
		}
		else {
			System.exit(0);//退出
		}
	}
	
	public static void main(String[] args){
		new UI();
	}
}
