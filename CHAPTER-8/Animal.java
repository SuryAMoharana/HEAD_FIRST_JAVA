class Animal{
	public void remove(){

	}
}

class MyAnimalList{
	int nextIndex=0;
	Animal[] animal=new Animal[5];

	public void add(Animal a){
		if(nextIndex<animal.length){
			System.out.println("Animal added at "+nextIndex);
		}
		nextIndex++;
	}
}

class Dog extends Animal{
	public void dum(){

	}
}

class Cat extends Animal{
	public void bum(){

	}
}