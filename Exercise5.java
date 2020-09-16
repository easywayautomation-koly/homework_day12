package homework_day12;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercise5 {

	public static void main(String[] args) {

		Path filepath = Paths.get("C:\\notepad.koly.1.txt");
		Charset charset = StandardCharsets.UTF_8;
		List<Dataclass> lists = new ArrayList<Dataclass>();
		try {
			BufferedReader read = Files.newBufferedReader(filepath, charset);
			String line;
			int counter = 0;
			String id = null, member = null, amount = null;

			while ((line = read.readLine())!= null) {
				line = line.trim().replaceAll("\\s{2,}"," ").trim();

				if (line.contains("ApplicationID")) {
					counter++;
					String[] sp = line.split(" ");
					 id = sp[1].trim();
				}
				if (line.contains("Membername")) {
					counter++;
					String[] sp = line.split(" ");
					 member = sp[1].trim();
				}
				if (line.contains("Amount")) {
					counter++;
					String[] sp = line.split(" ");
					 amount = sp[1].trim();
				}
				if (counter==3) {
					counter=0;
					Dataclass dt = new Dataclass();
					dt.setId(Integer.parseInt(id));
					dt.setMember(member);
					dt.setAmount(Double.parseDouble(amount));
					lists.add(dt);
					id = null;
					member = null;
					amount = null;
					
				}
				
			}

		} catch (Exception e) {

		}
		
		for(Dataclass data : lists) {
			System.out.println(data.getMember());
			
		}
	}

}
