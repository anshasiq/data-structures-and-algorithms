package stack.and.queue.animal;

public class Cat extends Animal{
    public Cat(String name){
        super.setName(name);
        super.setSpecies("Cat");
    }

    public String toString() {
        return "Cat -> " +
                "{ " + "Name : " + super.getName() + ", Species : " + super.getSpecies() + " }";
    }
}
