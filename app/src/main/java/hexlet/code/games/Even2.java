package hexlet.code.games;

import hexlet.code.Engine; //Импортируем "Движок" Engine
import java.util.Random; //Импортируем Класс Random

public class Even2 {
    public static void even() {
        var random = new Random();  //Создали объект Random

        System.out.println(Engine.userName()); //Узнать имя игрока
        String name = Engine.userEntersString(); //Игрок вводит имя и для завершения нажимает Enter
        System.out.println(Engine.helloUserName(name)); // Приветсвие игрока

        // Начало игры Even
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String yes = "yes";
        String no = "no";

        boolean flag = true;
        for(int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(100); // вернет случайное число от 0 до 99

            System.out.println(Engine.questionTask(String.valueOf(randomNumber))); //Задается вопрос
            String userAnswer = Engine.userEntersString(); //Игрок вводит свой ответ yes или no
            System.out.println(Engine.yourAnswer(userAnswer)); //Выводится ответ игрока

            int evenNumberRandom = randomNumber % 2; //Остаток от деления в отдельной переменной
                                                    //так меньше кода в условиях if and else if

            String answerYesOrNo = new String("no");
            if(evenNumberRandom == 0) {
                answerYesOrNo = "yes";
            }

            if (userAnswer.equals(answerYesOrNo)){
                System.out.println(Engine.correct()); //Подтверждается правильность ответа
            }  else {
                //Выводится если ответ не верный
                System.out.println(Engine.stringwrongAnswer(name, userAnswer, answerYesOrNo));
                flag = false; //И переменная flag меняет свое значение на false
                break;
            }
        }

        if (flag) {
            //Если игрок три раза ответил правильно то его хвалят
            System.out.println(Engine.congratulations(name));
        }
    }
}
