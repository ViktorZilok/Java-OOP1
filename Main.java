import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        FamelyTree tree = new FamelyTree();

        tree.add(new Human("Василий", Gender.Male, LocalDate.of(1963, 12, 10)));
        tree.add(new Human("Мария", Gender.Female, LocalDate.of(1965, 9, 15)));

        tree.add(new Human("Кристина", Gender.Female, LocalDate.of(1988, 7, 5),
         tree.getByName("Василий"), tree.getByName("Мария")));
        tree.add(new Human("семен", Gender.Male, LocalDate.of(1991, 1, 5),
        tree.getByName("Василий"), tree.getByName("Мария")));

        System.out.println(tree);
    }
}