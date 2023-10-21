//создаем класс Flute и имплементируем его
public class Flute implements Sound {
    @Override
    public void play() {
        System.out.println("Sound of flute");
    }
}
