import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ManagerTest {


    @Test
    public void getListOfFilms() {

        Manager manager = new Manager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test

    public void addOneNewFilmWhenListIsEmpty() {

        Manager manager = new Manager();

        manager.addName("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test

    public void addFewNewFilms() {

        Manager manager = new Manager();

        manager.addName("Film 1");
        manager.addName("Film 2");
        manager.addName("Film 3");
        manager.addName("Film 4");
        manager.addName("Film 5");
        manager.addName("Film 6");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void getTheLastThreeFilms() {

        Manager manager = new Manager();

        manager.addName("Film 1");
        manager.addName("Film 2");
        manager.addName("Film 3");

        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void getTheLastFiveFilms() {

        Manager manager = new Manager();

        manager.addName("Film 1");
        manager.addName("Film 2");
        manager.addName("Film 3");
        manager.addName("Film 4");
        manager.addName("Film 5");
        manager.addName("Film 6");

        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void getTheLastSixFilms() {

        Manager manager = new Manager(6);

        manager.addName("Film 1");
        manager.addName("Film 2");
        manager.addName("Film 3");
        manager.addName("Film 4");
        manager.addName("Film 5");
        manager.addName("Film 6");

        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

}
