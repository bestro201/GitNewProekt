public class CatsMain {
    public static void main(String[] args) {
        Cat cat =new Cat();
        cat.seyMeuw();
        cat.run();
        cat.sleep();
        String catName = cat.name;

            System.out.println("Имя кота:"+catName);

            System.out.println("Возраст кота:" + cat.age);

            System.out.println("Цвет:"+ cat.color);

            Cat cat1= new Cat();
        cat1.run();
        cat1.sleep();
        System.out.println("Имя кота:"+cat1.name);

        System.out.println("Возраст кота:" + cat1.age);

        }
        }




