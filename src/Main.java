public class Main {
    public static void main(String[] args) {
        test(21, 16);
        test(7, -3);
        test(56, 31);
        test(45, 14);
        test(37, 0);
        test(generateRandomAge(),25);
        test(generateRandomAge(),19);
    }

    public static String goWalking(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static void test(int age, int temperature) {
        System.out.println("Возраст: " + age + ", температура на улице: " + temperature + " - " + goWalking(age, temperature));
    }



    public static int generateRandomAge() {
        return (int) (Math.random()*100)+1;
    }

}






