package domain;

public class CommentsInfo {
    private int count; //Количество комментариев
    private int canPost; //Информация о том, может ли текущий пользователь комментировать запись
    private int canEditPost; //Информация о том, может ли текущий пользователь редактировать комментарий к записи
    private int canDeletePost; //Информация о том, может ли текущий пользователь удалить комментарий к записи
    private int groupsCanPost; //Информация о том, могут ли сообщества комментировать запись
   private boolean isCanClose; //Может ли текущий пользователь закрыть комментарии к записи
    private boolean isCanOpen; //Может ли текущий пользователь открыть комментарии к записи
    private int page; //Отображение картинки "Сообщение"

    public int getCount() {
        // to do some logic;
        return count;
    }

    public int getCanEditPost() {
        // to do some logic;
        return canEditPost;
    }

    public int getCanDeletePost() {
        // to do some logic;
        return canDeletePost;
    }

    public int getCanPost() {
        // to do some logic;
        return canPost;
    }

    public int getGroupsCanPost() {
        // to do some logic;
        return groupsCanPost;
    }

    public boolean getIsCanClose() {
        // to do some logic;
        return isCanClose;
    }

    public boolean getCIsCanOpen () {
        // to do some logic;
        return isCanOpen;
    }

    public int getPage() {
        // to do some logic;
        return page;
    }
}
