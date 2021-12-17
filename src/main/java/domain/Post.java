package domain;

public class Post {
    private int id; //Идентификатор записи
    private int ownerId; //Идентификатор владельца стены, на которой размещена запись
    private int fromId; //Идентификатор автора записи (от чьего имени опубликована запись)
    private int createdBy; //Идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора). Возвращается в записях, опубликованных менее 24 часов назад
    private PostSource postSource; //Информация о способе размещения записи
    private String postType; //Тип записи
    private Geo geo; //Информация о местоположении
    private int signerId; //Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private AccessInfo accessInfo; //Информация о доступности прочтения записи VK
    private int datePost; //Время публикации записи
    private String text; //Текст записи
    private int pagePost; //Картинка поста
    private LikesInfo likesInfo; //Информация о лайках к записи
    private RepostsInfo reportsInfo; //Информация о репостах записи («Рассказать друзьям»)
    private ViewsInfo viewsInfo; //Информация о просмотрах записи
    private CommentsInfo commentsInfo; //Информация о комментариях к записи
    private int replyOwnerId; //Идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId; //Идентификатор записи, в ответ на которую была оставлена текущая
    private int friendsOnly; //Информация о том, была ли создана запись с опцией «Только для друзей»
    private int canPin; //Информация о том, может ли текущий пользователь закрепить запись
    private int canDelete; //Информация о том, может ли текущий пользователь удалить запись
    private int canEdit; //Информация о том, может ли текущий пользователь редактировать запись
    private int isPinned; //Информация о том, что запись закреплена
    private int markedAsAds; //Информация о том, содержит ли запись отметку «реклама»
    private boolean isFavorite; //Информация о том, добавлен ли объект в закладки у текущего пользователя
    private int postponedId; //Идентификатор отложенной записи (поле возвращается тогда, когда запись стояла на таймере)

    //getters+setters;
}
