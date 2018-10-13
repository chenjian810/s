package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * 新建文件，书写文件
 * @author DELL
 *
 */
public class Desz {
	public static void main(String[] args) throws IOException {
		File f=new File("a.txt");
		f.createNewFile();
		FileOutputStream out=new FileOutputStream("a.txt");
		PrintWriter pw=new PrintWriter(out);
		pw.println("xiaoming");
		pw.println("xiaoming1");
		pw.println("xiaoming2");
		pw.println("xiaoming3");
		pw.println("xiaoming4");
		pw.flush();
		System.out.println(f.getName());
	}
}
