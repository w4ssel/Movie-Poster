import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManagerTest {

    Manager manager = new Manager();

    @Test
    public void shouldAddMovie() {
        manager.addMovie("Deep Throat");
        manager.addMovie("Deep Throat 2");
        manager.addMovie("Deep Throat 3");

        String[] expected = {"Deep Throat", "Deep Throat 2", "Deep Throat 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLastLessLimit() {
        Manager manager = new Manager(7);
        manager.addMovie("Deep Throat");
        manager.addMovie("Deep Throat 2");
        manager.addMovie("Deep Throat 3");

        String[] expected = {"Deep Throat 3", "Deep Throat 2", "Deep Throat"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastOverLimit() {
        manager.addMovie("Deep Throat");
        manager.addMovie("Deep Throat 2");
        manager.addMovie("Deep Throat 3");
        manager.addMovie("Deep Throat 4");
        manager.addMovie("Deep Throat 5");
        manager.addMovie("Deep Throat 6");
        manager.addMovie("Deep Throat 7");
        manager.addMovie("Deep Throat 8");
        manager.addMovie("Deep Throat 9");
        manager.addMovie("Deep Throat 10");
        manager.addMovie("Deep Throat 11");

        String[] expected = {"Deep Throat 11", "Deep Throat 10", "Deep Throat 9", "Deep Throat 8", "Deep Throat 7", "Deep Throat 6", "Deep Throat 5", "Deep Throat 4", "Deep Throat 3", "Deep Throat 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
