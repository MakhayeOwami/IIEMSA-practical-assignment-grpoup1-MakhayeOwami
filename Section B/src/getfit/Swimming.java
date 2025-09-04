/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package getfit;

/**
 *
 * @author lab_services_student
 */
public class Swimming extends Workouts{
     private int laps; // number of laps

    public Swimming(String date, int duration, int laps) {
        super(date, duration);
        this.laps = laps;
    }

    @Override
    public int calculateCaloriesBurned() {
        return laps * 15; //15 calories per lap
    }

    @Override
    public String getWorkoutType() {
        return "Swimming";
    }
}
    
    

