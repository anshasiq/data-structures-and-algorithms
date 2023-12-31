## Animal Shelter

to implement an animal shelter using fifo approach

### WhiteBoard

![animalShelter](AnimalShelterPNG.png)

### Approach & Efficiency

The approach used in this to make 2 Queues one queue is for dogs object and
the another is for cats objects.
now to enqueue into the animalshelter we need to check the class type of
the inserted animal if dog added it to the dog queue and the same goes for cats

### Big O

enqueue method takes the same as the queue time complexity which is O(1) and the
same goes for the dequeue O(1)

## Solution
<!-- Show how to run your code, and examples of it in action -->

![tests](animals.PNG)
```java
  private final Queue<Dog> dogs;
    private final Queue<Cat> cats;


    public AnimalShelter() {
        this.cats = new Queue<>();
        this.dogs = new Queue<>();
    }
    public void enqueue(Animal animal) {
        String className = animal.getClass().getSimpleName();
        if (className.equals("Cat")) {
            cats.enqueue((Cat) animal);
        } else if (className.equals("Dog")) {
            dogs.enqueue((Dog) animal);
        } else throw new IllegalArgumentException("Should provide an Dog or Cat Object");
    }

    public Animal dequeue(String pref) {
        if (pref.equalsIgnoreCase("cat")) {
            return cats.dequeue();
        } else if (pref.equalsIgnoreCase("dog")) {
            return dogs.dequeue();
        } else return null;
    }

    public String getCats() {
        return cats.toString();
    }

    public String getDogs() {
        return dogs.toString();
    }
    public String getShelter(){
        return dogs + " " + cats;
    }

```