public class Main {
    public static void main(String[] args) {
        Apple []  apple = {
                createObject("Iphone11"),
                createObject("Iphone13"),
                createObject("Iphone 15"),
        };
        for (Apple apples : apple) {
            apples.print();
        }
    }
    public static Apple createObject(String className ){
        Apple apple = null;
        if (className == "Iphone11" ){
            apple = new Iphone11("iPhone 11 " , 10_09_2019 , 17  ,  6_1);
        }
        if (className == "Iphone13" ){
            apple = new Iphone13("iPhone 13 ", 14_09_2021, 17 ," 2(12MP + 12MP)");
        }
        if (className == "Iphone 15" ){
            apple = new Iphone15("iPhone 15 ",12_09_2023 ,17 ," 3349мAч");
        }
        return apple;
    }

}