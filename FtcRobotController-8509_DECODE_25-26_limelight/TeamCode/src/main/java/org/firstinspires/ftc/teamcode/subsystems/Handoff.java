package org.firstinspires.ftc.teamcode.subsystems;

import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.FORWARD;
import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Handoff {
    private final DcMotor top;
    private boolean toggleV = false;
    private final double pow = .60;
    public Handoff(HardwareMap hardwareMap){
        top = hardwareMap.get(DcMotor.class, "kickerMotor");
        top.setDirection(FORWARD);

    }
    public void runMotor(double top_pow){
        top.setPower(top_pow);
    }

    public void stopMotors(){
        runMotor(0);
    }


    public void handoff(){
        runMotor(-pow);
    }

    public void handoffOut(){
        runMotor(pow);
    }


}
