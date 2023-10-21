//создаем класс Guitar и имплементируем его
public class Guitar implements Sound {
    @Override
    public void play(){
        System.out.println("Sound of guitar");
    }
}
