package domain;

public class RepostsInfo {
    private int count; //Число пользователей, скопировавших запись
    private int userReposted; //Наличие репоста от текущего пользователя
    private int page; //Отображение картинки "Стрелка"


    public int getCount() {
        // to do some logic;
        return count;
    }

    public int getUserReposted() {
        // to do some logic;
        return userReposted;
    }

    public int getPage() {
        // to do some logic;
        return page;
    }
}
