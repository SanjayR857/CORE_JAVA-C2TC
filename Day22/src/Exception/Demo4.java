package Exception;
import java.io.FileInputStream;

public class Demo4 {

public static void main(String[] args) {

FileInputStream fis = null;

fis = new FileInputStream("D:/myfile.txt");

int k;

while(( k = fis.read() ) != -1)

{

System.out.print((char)k);

}

fis.close();

}

}
/*
 Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Unhandled exception type FileNotFoundException
	Unhandled exception type IOException
	Unhandled exception type IOException

	at Exception.Demo4.main(Demo4.java:10)
*/
