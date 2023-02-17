package org.firstinspires.ftc.teamcode.auto.methods;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.auto.methods.AutoOdometry;

@Autonomous(name="AutoOdometryTest", group="AutoTest")
//@Disabled
public class AutoOdometryTest extends LinearOpMode {

    public AutoOdometry bot = new AutoOdometry();

    @Override
    public void runOpMode() throws InterruptedException {

        bot.initC(this);

        waitForStart();

        bot.start();

        bot.move(this, 0, 200, 0.3, 0, 5);
        bot.rotate(90);
        bot.move(this, 100, 200, 0.3, 90, 5);
        bot.move(this, 0, 200, 0.3, 90, 5);
        bot.rotate(0);
        bot.move(this, 0, 0, 0.3, 0, 5);

        sleep(500);
    }
}