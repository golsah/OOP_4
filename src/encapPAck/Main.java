package encapPAck;

public class Main {

	public static void main(String[] args) {
/*********************Encapsulation********************/
//		Encap encap = new Encap();
		
//		System.out.println(encap.name);
//		System.out.println(encap.lastname);
//		System.out.println(encap.age);
		
//		System.out.println(encap.getCode());
//		
//		encap.setCode(911);
//		System.out.println(encap.getCode());
		
/*********************Inheritance********************/
		
		Grandparent grandparent = new Grandparent();
		grandparent.eyes();
		grandparent.hair();
		grandparent.height();
		grandparent.weight();
		
		System.out.println();
		
		Parent parent = new Parent();
		System.out.println(parent.haircolor);
		parent.eyes();
		parent.hair();
		parent.bloodGroup();
		
		System.out.println();
		
		Child child = new Child();
		child.bloodGroup();
		child.eyes();
		child.height(); // multilevel inheritance
		
		// Upcasting
		Grandparent grandparent2 = new Parent();
		grandparent2.hair();
		
		
		
		
		
	}

}
