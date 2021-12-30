public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
               food -= appetite;

    }

    public int getFood() {
        return food;
    }



    public void showInfo() {
        System.out.println("plate: " + food);
    }
    public void addEat(int kittyCat){

        if (kittyCat >= 0){
            food += kittyCat;
            System.out.println(kittyCat + " добавлено в тарелку");
        }

        else
            System.out.println("нельзя воровать с тарелки");
    }
}