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
		f = new JFrame("ҵ��Աҵ������ϵͳ");
		f.setSize(360,455);//���ô�С
		
		cp = f.getContentPane();//�������
		cp.setLayout(new FlowLayout(1));//�ĳ���ʽ����
		
		setLayout(new FlowLayout());
        label = new JLabel("��ӭʹ��ҵ��Աҵ������ϵͳ");
        cp.add(label);
        
		b1 = new JButton("1��   ����ҵ��Ա��Ϣ��");//������ť
		b1.setPreferredSize(new Dimension(175,25));
		b1.setBounds(100,150,175,25);
		cp.add(b1);//��Ӱ�ť
		b1.addActionListener(this);//��Ӽ�������
		
		b2 = new JButton("2��   ������ҵ��Ա��Ϣ");//������ť
		b2.setPreferredSize(new Dimension(175,25));
		cp.add(b2);//��Ӱ�ť
		b2.addActionListener(this);//��Ӽ�������
		
		b3 = new JButton("3����ѯҵ��Ա��Ϣ��¼");//������ť
		b3.setPreferredSize(new Dimension(175,25));
		cp.add(b3);//��Ӱ�ť
		b3.addActionListener(this);//��Ӽ�������
		
		b4 = new JButton("4��        ɾ��ҵ��Ա��Ϣ");//������ť
		b4.setPreferredSize(new Dimension(175,25));
		cp.add(b4);//��Ӱ�ť
		b4.addActionListener(this);//��Ӽ�������
		
		b5 = new JButton("5��        ҵ��Աҵ������");//������ť
		b5.setPreferredSize(new Dimension(175,25));
		cp.add(b5);//��Ӱ�ť
		b5.addActionListener(this);//��Ӽ�������
		
		b6 = new JButton("6����ʾ����ҵ��Ա��Ϣ");//������ť
		b6.setPreferredSize(new Dimension(175,25));
		cp.add(b6);//��Ӱ�ť
		b6.addActionListener(this);//��Ӽ�������
		
		b = new JButton("0��           �˳�����ϵͳ");//������ť
		b.setPreferredSize(new Dimension(175,25));
		cp.add(b);//��Ӱ�ť
		b.addActionListener(this);//��Ӽ�������
		
		f.setVisible(true);//��ʾ����
		f.setLocationRelativeTo(null);//�������
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ر�
	}

	private void setLayout(FlowLayout flowLayout) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//�������¼�
		if(e.getSource()==b1){
			new Insert();//������Ϣ����ò�����
		}
		else if(e.getSource()==b2){
			new Insert();//������ҵ��Ա��Ϣ���ò�����
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
			System.exit(0);//�˳�
		}
	}
	
	public static void main(String[] args){
		new UI();
	}
}
