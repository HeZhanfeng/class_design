package mydesign;

import java.io.*;
import java.util.*;

/**
 * 2����ȡ����¼������ݵ��ַ����������С� 3����ȡ������ÿһ�����ݲ��жϣ������end������������洢��list�����С��������쳣����
 * 4�������������Ի����ıȽ���������Collections.sort()���������ݱȽ����Լ��Ͻ������� 5���������ϣ���ӡ������̨��
 */
class NewList {
	NewList() {
		// �������ϣ������������ݴ��뼯����
		List<String> list = new ArrayList<String>();
		System.out.println("���������ַ���,���س�����������end����");
		BufferedReader bufr = null;
		PrintWriter pw = null;
		try {

			// ��ȡ����¼������ݵ�������
			bufr = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(new BufferedWriter(new FileWriter("info.txt",
					true)));
			// ��ȡÿһ�����ݲ������жϣ��������end����ֹ¼�����ݣ�����洢��list�����С�
			String line = bufr.readLine();
			while (line != null) {
				if ("end".equals(line)) {
					System.out.println("������ϣ�");
					System.exit(0);
				}
				// list.add(line);
				// �����������ÿһ�ж�д���ļ���
				pw.write(line);
				// ����
				pw.write("\r\n");
				pw.flush();
				line = bufr.readLine();
			}
		} catch (IOException e) {
			throw new RuntimeException("��ȡ����������ʧ��");
		}
		// �ر�����Դ
		finally {

			try {
				if (bufr != null) {
					bufr.close();
				}
			} catch (final IOException e) {
				throw new RuntimeException("�ر���ʧ��");
			}
			if (pw != null) {
				pw.close();
			}
		}
		// �����������Ի����ıȽ���������sort���������ݱȽ����������������
		// Collator cmp = Collator.getInstance(java.util.Locale.CHINA);
		// Collections.sort(list, cmp);
		// �������ϣ���ӡ������̨
		for (String str : list) {
			System.out.println(str);
		}
	}
}