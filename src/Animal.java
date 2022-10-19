public class Animal {
    private String name;
    private String animalType;
    private double weight;

    Animal(String name, String animalType, double weight)
    {
        this.name=name;
        this.animalType=animalType;
        this.weight=weight;
    }

    void show()
    {
        System.out.println("Name="+name+"\nAnimal Type="+animalType + "\nAnimal weight ="+ weight);
    }

}
class Call
{
    public static void main (String[] args)
    {
        Animal obj=new Animal("Tiger","wild",70);

        obj.show();

    }
}
