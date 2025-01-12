package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

public class Spark1 extends SubsystemBase {

    public PWMSparkMax mSparkMotor;
    public DigitalInput mBrake;

public Spark1() {

    mSparkMotor = new PWMSparkMax(1);
    mBrake = new DigitalInput(0);

}

public void setSpark1(double speed) {

    mSparkMotor.set(speed);
}

public boolean getBrake() {
    return mBrake.get();
  }

  public void MotorSafety() {
    mSparkMotor.setSafetyEnabled(true);
    mSparkMotor.setVoltage(30);





  }




  @Override
  public void periodic() {
  }




}


    

