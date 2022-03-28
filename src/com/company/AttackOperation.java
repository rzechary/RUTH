package com.company;

import java.util.List;

public class AttackOperation extends IntelligenceGathering {
    private String NZAttack;
    public static final int AttackOperationId= 3;
    public AttackOperation(String operationName, String aboutOperation, int numberOfPlane, TypeOfCamera camera, String travelRoute, double beginTime, double endTime, List<Plane> planes, String NZAttack) {
        super(operationName, aboutOperation, numberOfPlane, camera, travelRoute, beginTime, endTime, planes);
        this.NZAttack = NZAttack;
    }

    public String getNZAttack() {
        return NZAttack;
    }

    public void setNZAttack(String NZAttack) {
        this.NZAttack = NZAttack;
    }
}
