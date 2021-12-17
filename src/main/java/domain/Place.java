package domain;

public class Place {
    private int id; //Идентификатор места
    private String title; //Название места
    private int latitude; //Географическая широта, заданная в градусах (от -90 до 90).
    private int longitude; //Географическая долгота, заданная в градусах (от -90 до 90).
    private int created; //Дата создания места
    private String icon; //Иконка места, URL изображения
    private int checkinsInfo; //Число отметок в этом месте
    private int updated; //Дата обновления места
    private int type; //Тип места
    private int country; //Идентификатор страны
    private int city; //Идентификатор города
    private String addressInfo; //Адрес места
}
