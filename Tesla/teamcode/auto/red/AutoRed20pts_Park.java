package org.firstinspires.ftc.teamcode.auto.red;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.auto.methods.AutoMethods;

@Autonomous(name="AutoRed20pts_Park", group="AutoRed")
//@Disabled
public class AutoRed20pts_Park extends LinearOpMode {

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

        //Паркуемся
        if (bot.baza == 1) {
            bot.dvizh(this, 0.6, 0, 200, 0, 6, false);
            bot.dvizh(this, 0.8, -190, 200, 0, 6, false);
        }
        if (bot.baza == 2) {
            bot.dvizh(this, 0.6, 0, 200, 0, 6, false);
        }
        if (bot.baza == 3) {
            bot.dvizh(this, 0.6, 0, 200, 0, 6, false);
            bot.dvizh(this, 0.8, 190, 200, 0, 6, false);
        }

        bot.writeAngle();

    }
}