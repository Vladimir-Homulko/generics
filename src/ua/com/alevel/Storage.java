package ua.com.alevel;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {

    private List<T> books = new ArrayList<>();

    public void addAll(List<? extends T> list) {
        books.addAll(list);
    }

    public static void main(String[] args) {
        Storage<Books> storage = new Storage<>();
        List<Album> albums = new ArrayList<>();

        storage.addAll(albums);
    }

    public static class Books {
    }

    public static class Album extends Books {
    }
}
