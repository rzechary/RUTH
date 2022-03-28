package com.company;

import java.util.List;

public class IntelligenceGathering extends StimulatingOperation {

    public static final int IntelligenceGatheringId= 2;

    private  double beginTime;
    private double endTime;
    private List<Plane> planes;


    public IntelligenceGathering(String operationName, String aboutOperation, int numberOfPlane, TypeOfCamera camera, String travelRoute, double beginTime, double endTime, List<Plane> planes) {
        super(operationName, aboutOperation, numberOfPlane, camera, travelRoute);
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.planes = planes;
    }

    public double getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(double beginTime) {
        this.beginTime = beginTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }
}
