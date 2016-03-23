package com.chandlertu.text;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LineSorter {

	public static void main(String[] args) throws IOException {
		String src = "C:\\Users\\nbpt\\Desktop\\TSUIMonitorServer.plist";
		String dst = "TSUIMonitorServer.plist";

		List<String> lines = new ArrayList<String>();
		Scanner in = new Scanner(Paths.get(src));
		while (in.hasNextLine()) {
			String line = in.nextLine();
			lines.add(line);
			System.out.println(line);
		}
		in.close();

		Collections.sort(lines);
		System.out.println("*****************************************************");

		PrintWriter out = new PrintWriter(dst);
		for (String line : lines) {
			out.println(line);
			System.out.println(line);
		}
		out.close();
	}

}
