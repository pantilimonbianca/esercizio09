public class Animal {

    private String animalName;

    public Animal(String animalName){
        this.animalName=animalName;

    }

    public void animalSound(){
        System.out.println("Roarr!");
    }
    public void animalSound(String intensity){
        if(intensity.equalsIgnoreCase("high")){
            System.out.println("Roarrrrr!");
        } else if (intensity.equalsIgnoreCase("low")) {
            System.out.println("Roar!");

        }else{
            return;
        }

    }

}
