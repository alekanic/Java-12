public class Manager {

    private String[] films = new String[0];
    private int limit;


    public void addName(String newFilm) {
        // метод добавления нового фильма
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilm;
        films = tmp;

    }

    public String[] findAll() {
        // вывод всех фильмов в порядке добавления
        return films;

    }

    public Manager() {
        this.limit = 5;
    }

    public Manager(int limit) {
        this.limit = limit;
    }

    public String[] findLast() {

        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }

        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;

    }

}
