package throwKeywordExample;

public class Voting {
	public static void main(String[] args) {
		int age=19;
		Voting v=new Voting();
		v.checkAge(age);
	}

	void checkAge(int age) {
		// TODO Auto-generated method stub
		if (age>=18) {
			youCanVote();
			
		}
		else {
			throw new RuntimeException("You can not vote");
		}
	}
	void youCanVote() {
		// TODO Auto-generated method stub
		System.out.println("You can vote sucesfully");
	}
	
}
