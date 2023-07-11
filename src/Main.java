public class Main {
    public static void main(String[] args) {
        Popugai popugai = new Popugai();
        popugai.setName("Kesha");
        popugai.setType("Ara");
        popugai.setAge(90);
        popugai.setSize(98);
        System.out.println("Name : "+popugai.getName());
        System.out.println("Type : "+popugai.getType());
        System.out.println("Age : "+popugai.getAge());
        System.out.println("Size: "+popugai.getSize());

        Fish fish = new Fish();
      fish.setType("Betta");
      fish.setColor("Golden");
      fish.setPlace("East Asia, Thailand, Laos, Cambodia, Vietnam");
      fish.setSize(6.5);
        System.out.println("Type :  "+fish.getType());
        System.out.println("Color : "+fish.getColor());
        System.out.println("Place : "+fish.getPlace());
        System.out.println("Size : "+fish.getSize());

        Cat cat = new Cat();
        cat.setName("Misha");
        cat.setColor("tricolor");
        cat.setAge(3);
        cat.setWeight(3);
        System.out.println("Name : "+cat.getName());
        System.out.println("Color : "+cat.getColor());
        System.out.println("Age : "+cat.getAge());
        System.out.println("Weight : "+cat.getWeight());

        Dog dog = new Dog();
        dog.setBreed("Shiba- inu, Japan");
        dog.setAge(12);
        dog.setColor("Golden");

        System.out.println("Breed :"+dog.getBreed());
        System.out.println("This breed of dog lives up to : "+dog.getAge());
        System.out.println("Color : "+dog.getColor());





    }
}