/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package getfit;

/**
 *
 * @author lab_services_student
 */
public class Running extends Workouts{
    private int distance; // in kilometers

    public Running(String date, int duration, int distance) {
        super(date, duration);
        this.distance = distance;
    }

    @Override
    public int calculateCaloriesBurned() {
        return distance * 60; //60 calories per km
    }

    @Override
    public String getWorkoutType() {
        return "Running";
    }
}
    

