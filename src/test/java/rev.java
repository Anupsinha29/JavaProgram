import java.util.LinkedHashSet;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class rev {

	public static void main(String[] args) {
		String s="tester";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
			System.out.println(set);
		}
			System.out.println();
			for(Character ch : set) {
				System.out.println(ch);
			}
		}
}
