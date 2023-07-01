package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class Dumpingducks extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        Servo duckFlop= hardwareMap.get(Servo.class,"duckFlop");
        waitForStart();
        while(opModeIsActive()){
            if(gamepad1.b){
                duckFlop.setPosition(0);
                sleep(2000);
                duckFlop.setPosition(0.66);
            }
        }
    }
}
