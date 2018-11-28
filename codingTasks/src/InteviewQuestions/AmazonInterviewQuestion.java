package InteviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class AmazonInterviewQuestion {
	
	// 23567 => 23576
		// 743213 => 743231
		// 87549321 => 87591234
		public static void main(String[] args) {
			int original = 87549321;
			//nextBig(original);

			//System.out.println(intToList(45121));
			//c=45121 n++ = 45211
			
			System.out.println(nextBig(5420030));
		}

		public static int nextBig(int n) {
			if(numberDescends(n) == true) {
				System.out.println("No next big is possible.");
				return -1;
			}
			int copy = n;
			do {
				n++;
			} while (!areAnagrams(copy, n));
			return n;
		}
		public static boolean numberDescends(int num) {
			List<Integer> list = intToList(num);
			for(int i = 0; i < list.size()-1; i++) {
				if(list.get(i) < list.get(i+1)) {
					return false;
				}
			}return true;
		}

		public static boolean areAnagrams(int c, int n) {
			List<Integer> cl = intToList(c);
			List<Integer> nl = intToList(n);
			if(cl.size() != nl.size()) {
				System.out.println("No next big number is possible");
				return false;
			}
			for(int o = 0; o < cl.size(); o++) {
				int countFromC = 1;
				int countFromN = 0;
				for(int i = 0; i < cl.size(); i++) {
					if(cl.get(o) == cl.get(i) && o != i) {
						countFromC++;
					}
				}
				for(int j = 0; j < cl.size(); j++) {
					if(cl.get(o) == nl.get(j)) {
						countFromN++;
					}
				}
				if(countFromC != countFromN) {
					return false;
				}
			}
			return true;
		}

		public static List<Integer> intToList(int num) {
			List<Integer> list = new ArrayList<>();
			do {
				list.add(num % 10);
				num /= 10;
			} while (num > 0);
			
			for(int i = 0; i < list.size()/2; i++) {
				int temp = list.get(i);
				list.set(i, list.get(list.size()-1-i));
				list.set(list.size()-1-i, temp);
			}
			return list;
		}

}
