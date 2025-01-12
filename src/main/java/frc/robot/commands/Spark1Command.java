

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Spark1;

public class Spark1Command extends Command {
  
    Spark1 m_spark1;
    double m_speed_spark1;

    public Spark1Command(Spark1 spark1, double speed_spark1) {
    this.m_spark1 = spark1;
    this.m_speed_spark1 = speed_spark1;
        addRequirements(m_spark1);
    }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    if (m_spark1.getBrake()) {
        m_spark1.setSpark1(0);
    } else {

        m_spark1.setSpark1(m_speed_spark1);



    }
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
