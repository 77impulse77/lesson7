public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = false;

    }

    public void eatFrom(Plate plate) {

        if (!hungry&&plate.getFood() >= appetite) {
           hungry = true;
           plate.decreaseFood(appetite);
        }

    }
    public void showInfo() {
        if (hungry){
            System.out.println(name + " кот сытый");
                    }  else
            System.out.println(name + " голодная");
            }

}
