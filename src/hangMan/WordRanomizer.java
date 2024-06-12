package hangMan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordRanomizer {
public static String getWord() {
	String separator = File.separator;
	String path = separator + "Users" + separator + "TORFF" + separator + 
			"Documents" + separator + "test1.txt";
	File file = new File(path);
	try {
		Scanner scanner = new Scanner(file);
		String line = scanner.nextLine();
		String[] str = line.split(" |\\.|,|-");
		List<String> array = new ArrayList<>();
		for(String string: str) {
			array.add(string);
		}
		Random random = new Random();
		String result = array.get(random.nextInt(array.size()));
		while(result.length()<3) {
			result = array.get(random.nextInt(array.size()));
		}
		return result;
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("File not found");
		return "";
	}
}
}
