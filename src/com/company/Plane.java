package com.company;

public class Plane {
    private String planeId;
    private String planeName;
    private boolean status;
    private double timeOfLand;//זמן נחיתה
    public double getTimeOfLand() {
        return timeOfLand;
    }

    public void setTimeOfLand(double timeOfLand) {
        this.timeOfLand = timeOfLand;
    }



    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Plane(String planeId, String planeName) {
        this.planeId = planeId;
        this.planeName = planeName;
    }

    public String getPlaneId() {
        return planeId;
    }

    public void setPlaneId(String planeId) {
        this.planeId = planeId;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }
}
