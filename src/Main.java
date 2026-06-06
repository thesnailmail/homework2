//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);

        friend = friend * 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        var first = 78.2;
        var second = 82.7;
        var resultF = first + second;
        System.out.println(resultF);
        var resultS = second - first;
        System.out.println(resultS);

        var resultT = second % first;
        System.out.println(resultT);

        var hour = 640;
        var hourHuman = 8;
        var human = hour / hourHuman;
        System.out.println("Всего работников в компании — " + human + " человек.");

        human = human + 94;
        var newHour = human * 8;
        System.out.println("Если в компании работает " + human + " человек, то всего " + newHour + " часов работы может быть поделено между сотрудниками.");
    }
}