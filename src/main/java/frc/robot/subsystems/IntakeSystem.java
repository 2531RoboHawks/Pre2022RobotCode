/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * Add your docs here.
 */
public class IntakeSystem extends SubsystemBase {
  TalonSRX bottomWheelSrx = new TalonSRX(12);
  TalonSRX intakeSrx = new TalonSRX(13);

  public void intake(double power) {
    intakeSrx.set(ControlMode.PercentOutput, power);
  }

  public void bottomWheel(double power) {
    bottomWheelSrx.set(ControlMode.PercentOutput, power);
  }

  public void stopIntake() {
    intake(0);
  }

  public void stopBottomWheel() {
    bottomWheel(0);
  }

  public void stopAll() {
    stopIntake();
    stopBottomWheel();
  }
}
