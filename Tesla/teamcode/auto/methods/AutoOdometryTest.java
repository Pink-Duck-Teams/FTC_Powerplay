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

        bot.move(this, 0, 0, 0.3, 0, 3);
        bot.move(this, 0, 100, 0.3, 0, 3);
        bot.move(this, 0, 0, 0.3, 0, 3);
        bot.move(this, 0, 100, 0.3, 0, 3);
        bot.move(this, 0, 0, 0.3, 0, 3);
        bot.move(this, 0, 100, 0.3, 0, 3);
        bot.move(this, 0, 0, 0.3, 0, 3);
        bot.move(this, 0, 100, 0.3, 0, 3);

        sleep(500);
    }
}
