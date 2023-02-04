package ru.netology.films;

public class Manager {
    private Films[] items = new Films[0];
    private int numberLastFilms;

    public Manager() {
        numberLastFilms = 10;
    }

    public Manager(int numberLastFilms) {

        this.numberLastFilms = numberLastFilms;
    }

    public void add(Films item) {
        Films[] tmp = new Films[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public Films[] findAll() {

        return items;
    }

    public Films[] findLast() {
        int resultLength;
        if (numberLastFilms <= items.length) {
            resultLength = numberLastFilms;
        } else {
            resultLength = items.length;
        }
        Films[] result = new Films[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;
    }
}