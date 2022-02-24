package test;

import java.io.File;

/**
 * char[] c;
 * new String(c) 的长度为c的长度
 * @author 哇
 *
 */
public class CharToString {
	public static void main(String[] args) {
		File file = new File("E:/54188.txt");
		System.out.println(file.getName().substring(file.getName().lastIndexOf(".")));
		System.out.println(file.getAbsolutePath().replace(file.getName(), ""));
	}
}
