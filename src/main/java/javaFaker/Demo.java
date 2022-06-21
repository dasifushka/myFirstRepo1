package javaFaker;

import com.github.javafaker.Faker;

public class Demo {

    protected static Faker faker = new Faker();

    public static void main(String[] args) {
        System.out.println(generateFakeFirstName());
        System.out.println(generateFakeLastName());
        System.out.println(generateArtistName());
        System.out.println(generateFake());
        System.out.println(generateEmailAdress());
    }

    public static String generateFakeFirstName() {

        return "Hello! My names is " + faker.name().firstName();

    }

    public static String generateFakeLastName() {
        return "Surname is " + faker.name().lastName();
    }

    public static String generateEmailAdress() {
        return "Email is " + faker.internet().emailAddress();
    }

    public static String generateArtistName() {
        return faker.artist().name();
    }

    public static String generateFake() {
        return faker.animal().name();
    }
}