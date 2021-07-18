public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int appetite) {
        if (appetite > food){
            if (!countFood){
                System.out.println("Не хватает еды");
                countFood = true;
            }
            return false;
        }
        else {
            food -= appetite;
            return true;
        }
    }
    public boolean countFood = false;

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