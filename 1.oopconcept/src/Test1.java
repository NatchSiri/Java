import model.SimpleDice;

public class Test1 {

	public static void main(String[] args) {
		
		 SimpleDice diceA = new SimpleDice(1);
		 SimpleDice diceB;
		 diceB = diceA;
		 diceB.setFaceValue(4);
		 System.out.println(diceA);
		 
	}

}
