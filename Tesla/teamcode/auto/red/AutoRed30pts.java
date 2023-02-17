package org.firstinspires.ftc.teamcode.auto.red;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.auto.methods.AutoMethods;

@Autonomous(name="AutoRed30pts", group="AutoRed")
//@Disabled
public class AutoRed30pts extends LinearOpMode {

    public AutoMethods bot = new AutoMethods();

    @Override
    public void runOpMode() throws InterruptedException {

        bot.initC(this);
        bot.camStart(this);

        waitForStart();

        bot.start();
        bot.getPos();

        //Захватываем предзагруженный конус
        bot.s1.setPosition(0.73);

        //Едем к высокому узлу в центре
        bot.dvizh(this,0.6, 2, 468, 0, 4.5, false);

        //Поворачиваемся к высокому узлу
        bot.rotate(90);

        //Поднимаем стрелу
        bot.tele(2262);

        //Подъезжаем к высокому узлу
        bot.dvizh(this,0.45, 0, 34, 90, 1.5, true);

        //Отпускаем конус
        sleep(300);
        bot.s1.setPosition(0.66);
        sleep(300);

        //Отъезжаем от высокого узла
        bot.dvizh(this,0.45, 0, 0, 90, 2.5, false);

        //Опускаем телескоп
        bot.tele(1000);

        //Отъезжаем вбок
        bot.dvizh(this,0.65, 70, 0, 90, 3.5, false);

        //Поворачиваемся к стопке конусов
        bot.rotate_rough(0);
        bot.rotate_rough(-45);
        bot.rotate(-90);

        //Поддерживаем уровень телескопа
        bot.tele(1000);

        //Подъезжаем к стопке конусов
        bot.dvizh(this,0.4, -4, 222, -90, 2, true);

        //Берём конус
        bot.tele(240);
        sleep(200);
        bot.s1.setPosition(0.73);
        sleep(300);

        //Поднимаем стрелу
        bot.tele(1000);

        //Отъезжаем от стопки конусов
        bot.dvizh(this,0.65, 0, -159, -90, 4.5, false);

        //Подъезжаем к высокому узлу
        bot.dvizh(this,0.5, 69, -159, -90, 4.5, false);
        bot.tele(2262);
        bot.dvizh(this,0.4, 69, -129, -90, 1.5, false);

        //Ставим конус
        sleep(300);
        bot.s1.setPosition(0.66);
        sleep(300);

        //Отъезжаем
        bot.tele(2270);
        bot.dvizh(this,0.7, 69, -159, -90, 3, false);
        bot.tele(0);

        //Паркуемся
        if (bot.baza == 1) {
            bot.dvizh(this,0.8, -222, -159, -90, 1.5, false);
            bot.dvizh(this,0.8, 0, 390, -90, 1, true);
        }
        if (bot.baza == 2) {
            bot.dvizh(this,0.8, -222, -159, -90, 1.5, false);
            bot.dvizh(this,0.8, 0, 180, -90, 1, true);
        }
        if (bot.baza == 3) {
            bot.dvizh(this,0.8, -222, -159, -90, 1.5, false);
        }

        bot.writeAngle();

    }
}