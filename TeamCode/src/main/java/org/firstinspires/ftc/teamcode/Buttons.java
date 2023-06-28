package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class Buttons extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor frontLeft = hardwareMap.dcMotor.get("frontLeft");
        DcMotor backLeft = hardwareMap.dcMotor.get("backLeft");
        DcMotor frontRight = hardwareMap.dcMotor.get("frontRight");
        DcMotor backRight = hardwareMap.dcMotor.get("backRight");

        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.a) {
                frontRight.setPower(0.25);
            } else {
                frontRight.setPower(0);
            }
            if (gamepad1.b) {
                backRight.setPower(0.25);
            } else {
                backRight.setPower(0);
            }
            if (gamepad1.y) {
                frontLeft.setPower(0.25);
            } else {
                frontLeft.setPower(0);
            }
            if (gamepad1.x) {
                backLeft.setPower(0.25);
            } else {
                backLeft.setPower(0);
            }
        }
    }
}
