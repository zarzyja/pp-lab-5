public class Main {

    public static void main(String[] args) {
        Person[] people = new Person[5];
        int b = 10;

        try {
            for (int i = 0; i < people.length; i++) {
                people[i] = new Person("Imię " + (i + 1), 30 + i);
            }

            for (Person person : people) {
                int result = MathUtils.add(person.getAge(), b);
                sendMessage(person.getName() + ", lat " + person.getAge() + ", wynik: " + result);
            }
        } catch (InvalidAgeException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}