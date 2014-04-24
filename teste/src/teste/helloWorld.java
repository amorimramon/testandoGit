package teste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class helloWorld {

    public static void main(String[] args) throws IOException {

	FileReader r = new FileReader("//Users/ramonamorim/Dropbox/teste.txt");

	Scanner scan = new Scanner(r);
	BufferedReader buff = new BufferedReader(r);
	while (scan.hasNext()) {

	    System.out.println(scan.next());
	}
    }
}
