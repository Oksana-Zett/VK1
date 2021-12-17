package domain;

public class VkDonut {
    private boolean isDonut; //Запись доступна только платным подписчикам VK Donut
    private int paidDuration; //Время, в течение которого запись будет доступна только платным подписчикам VK Donut
    private Placeholder placeholder; //Заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи
    private boolean canPublishFreeCopy; //Можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
    private String editMode; //Информация о том, какие значения VK Donut можно изменить в записи. Возможные значения
    private int all; //Вся информацию о VK Donut
    private int duration; //время, в течение которого запись будет доступна только платным подписчикам VK Donut
}
