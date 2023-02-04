package ru.netology.films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    Films item1 = new Films("Фильм-1", "Жанр-1");
    Films item2 = new Films("Фильм-2", "Жанр-2");
    Films item3 = new Films("Фильм-3", "Жанр-3");
    Films item4 = new Films("Фильм-4", "Жанр-4");
    Films item5 = new Films("Фильм-5", "Жанр-5");
    Films item6 = new Films("Фильм-6", "Жанр-6");
    Films item7 = new Films("Фильм-7", "Жанр-7");
    Films item8 = new Films("Фильм-8", "Жанр-8");
    Films item9 = new Films("Фильм-9", "Жанр-9");
    Films item10 = new Films("Фильм-10", "Жанр-10");
    Films item11 = new Films("Фильм-11", "Жанр-11");
    Films item12 = new Films("Фильм-12", "Жанр-12");

    @Test
    public void shouldAdd() {
        Manager manager = new Manager();
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);

        Films[] expected = {item1, item2, item3};
        Films[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldReverseWhenCurrentNumberLastFilms() {
        Manager manager = new Manager();

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
        manager.add(item12);

        Films[] expected = {item12, item11, item10, item9, item8, item7, item6, item5, item4, item3};
        Films[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldReverseWhenItemsMoreNumberLastFilms() {
        Manager manager = new Manager(5);

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
        manager.add(item12);

        Films[] expected = {item12, item11, item10, item9, item8};
        Films[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldReverseWhenItemsEqualNumberLastFilms() {
        Manager manager = new Manager(12);

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
        manager.add(item12);

        Films[] expected = {item12, item11, item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        Films[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldReverseWhenItemsLessNumberLastFilms() {
        Manager manager = new Manager(7);

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);

        Films[] expected = {item5, item4, item3, item2, item1};
        Films[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
