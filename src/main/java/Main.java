import person.Person;
import person.PersonBuilder;

public class Main {

    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Вера")
                .setSurname("Иванова")
                .setAge(54)
                .build();

        Person son = mom.newChildBuilder()
                .setName("Петя")
                .setSurname(mom.getSurname())
                .setAge(23)
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            new PersonBuilder()
                    .setName("NoName")
                    .setSurname("NoSurname")
                    .setAge(-100)
                    .build();

        }  catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}

