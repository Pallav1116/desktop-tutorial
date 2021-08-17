package googleSearch;

public class Reverse {

	public static void main(String[] args) {
		String r1="REVERSE";
		StringBuilder s1=new StringBuilder();
		s1.append(r1);
		s1.reverse();
		
		StringBuffer sbr=new StringBuffer(r1);
		System.out.println(sbr.reverse());
		System.out.println(s1);
		
		int duplicate[]= {1,2,3,4,5,1,3,2};
		for(int i=0;i<duplicate.length;i++) {
			for(int j=i+1;j<duplicate.length;j++) {
				if(duplicate[i]==duplicate[j]) {
					System.out.println("Duplicates are: "+duplicate[j]);
				}
			}
		
	}

	}}
