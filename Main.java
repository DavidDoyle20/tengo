package whoLivesAndWhoDies;

import java.util.ArrayList;

import whoLivesAndWhoDies.InputArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> input = InputArrayList.createArrayList("LIVES.dat");
		ArrayList<person> persons = new ArrayList<person>();
		
		System.out.println(WLAWD.removeSpaces("       a"));
		String tengo = "    te n go    ";
		String t = tengo.replaceAll("^\\s++", "");
		System.out.println(t);
		String temp = "";
		
		for(int i = 0; i < input.size(); i++) {
			temp = input.get(i);
			temp = WLAWD.removeSpaces(temp);
			input.remove(i);
			input.add(i, temp);
			
		}
		for(String p : input) {
			System.out.println(p);
		}
	}	
}