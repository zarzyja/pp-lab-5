public class Main {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int sum = MathUtils.add(num1, num2);
        System.out.println("Suma: " + sum);

        // Użyj sumy w metodzie sendMessage (zakładając, że metoda sendMessage istnieje)
        sendMessage("Wynik dodawania: " + sum);
    }
}