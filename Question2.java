import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Question2{
	public static void main(String[] args) throws IOException{

		
        FileReader fr = new FileReader("Source.txt");
        BufferedReader brs = new BufferedReader(fr);
        FileWriter fw = new FileWriter("Dest.txt",true);
	BufferedReader brd = new BufferedReader(fr);
	while (fr.ready())	{	
				i = fr.read();	
				System.out.print((char) i);
				fw.write(i);			
			}

	
	fr.close();				
	fw.close();

		txtCopy(brs,brd);
		editFile("Dest.txt");
		updateFile("Dest.txt");
	}
}
