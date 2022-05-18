public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(new Run(100), new Jump(3),
                 new Swim(70));

        Team team = new Team("QA", new Member("Alex", 100), new Member("Vladimir", 80),
                new Member("Pavel", 50), new Member("Petr", 130));

        course1.doIt(team);

        System.out.println();
    }
}
