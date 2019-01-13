package main;

public class Main {

	public static void main(String[] args) {
		
		IndividualTest parent1 = new IndividualTest(12);
		System.out.println(parent1.toString());
		System.out.println("Le score d'evaluation est : " + parent1.Evaluate() + "\n");
		
		IndividualTest parent2 = new IndividualTest(10);
		System.out.println(parent2.toString());
		System.out.println("Le score d'evaluation est : " + parent2.Evaluate() + "\n");
		
		IndividualTest child = (IndividualTest)parent1.Crossing(parent2);
		System.out.println(child.toString());
		System.out.println("Le score d'evaluation est : " + child.Evaluate() + "\n");
		
		child.Mute();
		System.out.println(child.toString());
		System.out.println("Le score d'evaluation est : " + child.Evaluate() + "\n");
	}
}
