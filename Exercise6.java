package homework_day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise6 {

	public static void main(String[] args) throws Exception {
		
		Path filepath=Paths.get("C:\\notepad.koly.1.txt");
		Charset charset=StandardCharsets.UTF_8;
		try {
			BufferedReader read=Files.newBufferedReader(filepath,charset);
			String line;
			while((line=read.readLine())!=null) {
				line=line.trim().replaceAll("\\s{2,}"," " ).trim();
				System.out.println(line);
				
			}
			
		} catch (Exception e) {
			
		}
		

	}

}
