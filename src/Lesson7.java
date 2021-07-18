/* 1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
(например, в миске 10 еды, а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
Если коту удалось покушать (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт
(это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
и потом вывести информацию о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

 */
public class Lesson7 {
    public static void main(String[] args) {
        Cat cat = new Cat(  "Луна", 1);
        Cat secondCat = new Cat("Меркурий", 2);
        Cat[] cats = {new Cat("черная", 6), new Cat("серая", 8), new Cat("белая", 5), new Cat("рыжая", 2)};
        Plate plate = new Plate(20);


        plate.showInfo();
        for (int i = 0; i < cats.length; i++){
            cats[i].eatFrom(plate);
            cats[i].showInfo();
        }

//        cat.eatFrom(plate);
//        secondCat.eatFrom(plate);
//        cat.showInfo();
//        secondCat.showInfo();
        plate.showInfo();
        plate.addEat(20);
        plate.showInfo();
    }
}
// круто