public class Variables {
    public static void main(String[] args) {
        //прошло 234 дня. Сколько полных недель прошло за этот период? А месяцев?
        //??? нет точного понимания какой текущий месяц от которого отсчитали 234 дня. В месяце может быть 28,29,30,31 день.Взяла среднее
        int x = 234;
        int ned = 234/7;
        int mes=234/30;
        System.out.println("Прошло недель:" +ned);
        System.out.println("Прошло месяцев:"+mes);
        //Дано двузначное число 57. Найти:число десятков в нем;//число единиц в нем;//сумму его цифр;//произведение его цифр.
        byte y=54;
        int dec=y/10;
        int ed=y%10;
        int sum=dec+ed;
        int prozv=dec*ed;
        System.out.println("Число десятков:"+dec);
        System.out.println("Число единиц:"+ed);
        System.out.println("Сумма цифр в числе:"+sum);
        System.out.println("Произведение цифр:"+prozv);
        //Найдите возраст человека, если известно, что год его рождения 1991. Выведите полученный результат в виде “Возраст = …”
        // неизвестен месяц рождения. Поэтому расчет неточный
        int god=1991;
        int vozr=2023-1991;
        System.out.println("Возраст:"+vozr);
    }

}
