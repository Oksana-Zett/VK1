package domain;

public class LikesInfo {
    private int count; //Число пользователей, которым понравилась запись
    private int userLiked; //Наличие отметки «Мне нравится» от текущего пользователя
    private int canLike; //Информация о том, может ли текущий пользователь поставить отметку «Мне нравится»
    private int page; //Отображение картинки "Сердце"


    public int getCount() {
        // to do some logic;
        return count;
    }

    public int getUserLiked() {
        // to do some logic;
        return userLiked;
    }

    public int getCanLike() {
        // to do some logic;
        return canLike;
    }

    public int getPage() {
        // to do some logic;
        return page;
    }
}
