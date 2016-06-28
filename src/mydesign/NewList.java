package mydesign;

import java.io.*;
import java.util.*;

/**
 * 2、读取键盘录入的数据到字符流缓冲区中。 3、读取缓冲区每一行数据并判断，如果是end就跳出，否则存储到list集合中。（进行异常处理）
 * 4、创建区分语言环境的比较器，调用Collections.sort()方法并传递比较器对集合进行排序。 5、遍历集合，打印到控制台。
 */
class NewList {
	NewList() {
		// 创建集合，将缓冲区数据存入集合中
		List<String> list = new ArrayList<String>();
		System.out.println("输入任意字符串,按回车继续，输入end结束");
		BufferedReader bufr = null;
		PrintWriter pw = null;
		try {

			// 读取键盘录入的数据到缓冲区
			bufr = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(new BufferedWriter(new FileWriter("info.txt",
					true)));
			// 读取每一行数据并进行判断，如果遇到end就终止录入数据，否则存储到list集合中。
			String line = bufr.readLine();
			while (line != null) {
				if ("end".equals(line)) {
					System.out.println("输入完毕！");
					System.exit(0);
				}
				// list.add(line);
				// 将缓冲区里的每一行都写入文件中
				pw.write(line);
				// 换行
				pw.write("\r\n");
				pw.flush();
				line = bufr.readLine();
			}
		} catch (IOException e) {
			throw new RuntimeException("读取缓冲区数据失败");
		}
		// 关闭流资源
		finally {

			try {
				if (bufr != null) {
					bufr.close();
				}
			} catch (final IOException e) {
				throw new RuntimeException("关闭流失败");
			}
			if (pw != null) {
				pw.close();
			}
		}
		// 创建区分语言环境的比较器，调用sort方法并传递比较器对数组进行排序
		// Collator cmp = Collator.getInstance(java.util.Locale.CHINA);
		// Collections.sort(list, cmp);
		// 遍历集合，打印到控制台
		for (String str : list) {
			System.out.println(str);
		}
	}
}