package org.firstinspires.ftc.teamcode.auto.blue;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.auto.methods.AutoMethods;

@Autonomous(name="AutoBlue25pts", group="AutoBlue")
//@Disabled
public class AutoBlue25pts extends LinearOpMode {

    public AutoMethods bot = new AutoMethods();

    @Override
    public void runOpMode() throws InterruptedException {

        bot.initC(this);
        bot.camStart(this);

        waitForStart();

        bot.start();
        bot.getPos();

        sleep(2000);

        //Захватываем предзагруженный конус
        bot.s1.setPosition(0.73);

        //Едем к правому высокому узлу
        bot.dvizh(this,0.4, 0, 195, 0, 2.5, false);
        bot.dvizh(this,0.4, -262, 195, 0, 4, false);

        //Поднимаем стрелу
        bot.tele(1645);

        //Подъезжаем к высокому узлу
        bot.dvizh(this,0.3, -262, 255, 0, 1.75, false);

        //Отпускаем конус
        sleep(300);
        bot.s1.setPosition(0.66);
        sleep(300);

        //Отъезжаем от высокого узла
        bot.tele(1645);
        bot.dvizh(this,0.35, 0, -60, 0, 2.5, true);

        //Опускаем телескоп
        bot.tele(0);

        //Паркуемся
        if (bot.baza == 1) {
            bot.dvizh(this,0.7, 80, -50, 0, 6, false);
        }
        if (bot.baza == 2) {
            bot.dvizh(this,0.7, 282, -50, 0, 6, false);
        }
        if (bot.baza == 3) {
            bot.dvizh(this,0.7, 500, -50, 0, 6, false);
        }

        bot.writeAngle();

    }
}

