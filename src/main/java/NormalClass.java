import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.aventstack.extentreports.utils.FileUtil;

public class NormalClass {

	public static void main(String[] args) throws IOException {

		//file operation
		File f1 = new File("C:\\Users\\yuvar\\OneDrive\\Desktop\\manimaran");
		boolean m = f1.mkdir();
		System.out.println(m);
		
		File f2 = new File("C:\\Users\\yuvar\\OneDrive\\Desktop\\maybatch\\13\\2020\\afternoon");
		boolean m1 = f2.mkdirs();
		System.out.println(m1);

		File f = new File("C:\\Users\\yuvar\\OneDrive\\Desktop\\manimaran\\newfile.txt");
		boolean m2 = f.createNewFile();
		System.out.println(m2);
			
		boolean b = f.isDirectory();
		System.out.println(b);
		
		boolean b1=f.isFile();
		System.out.println(b1);
		
		FileUtils.write(f, "hi all friends");
		System.out.println("text has been wriiten in the file");
		
		List<String> rr = FileUtils.readLines(f);
		System.out.println(rr);
		for (String ss : rr) {
			System.out.println(ss);
		}
		
		


		/*NormalClass n = new NormalClass();

		ChildClass c = new ChildClass();
		c.parentmethod();
		c.childmethod();

		ParentClass p = new ChildClass();
		p.parentmethod();*/


	}

}
