public class Zoo {
	
	int count;
	String animal;


	public Zoo() {}
	public Zoo (String animal, int count) {
		this.animal = animal;
		this.count = count;
	}


	@Override
	public String toString() {
		return animal + " в количестве " + count + " особей.";
	}

}