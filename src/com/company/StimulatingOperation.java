package com.company;

public class StimulatingOperation
{


    public static final int StimulatingOperationId= 1;
    private  String operationName;
    private String aboutOperation;
    private int numberOfPlanes;
    private TypeOfCamera camera;
    private String travelRoute;

    public StimulatingOperation(String operationName, String aboutOperation, int numberOfPlane, TypeOfCamera camera, String travelRoute) {
        this.operationName = operationName;
        this.aboutOperation = aboutOperation;
        this.numberOfPlanes = numberOfPlane;
        this.camera = camera;
        this.travelRoute = travelRoute;
    }

    public String getOperationName() {
        return operationName;
    }


    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getAboutOperation() {
        return aboutOperation;
    }

    public void setAboutOperation(String aboutOperation) {
        this.aboutOperation = aboutOperation;
    }

    public int getNumberOfPlanes() {
        return numberOfPlanes;
    }

    public void setNumberOfPlanes(int numberOfPlanes) {
        this.numberOfPlanes = numberOfPlanes;
    }

    public TypeOfCamera getCamera() {
        return camera;
    }

    public void setCamera(TypeOfCamera camera) {
        this.camera = camera;
    }

    public String getTravelRoute() {
        return travelRoute;
    }

    public void setTravelRoute(String travelRoute) {
        this.travelRoute = travelRoute;
    }
}
