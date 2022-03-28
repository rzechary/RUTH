package com.company;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.HashMap;
import java.util.List;

public class System <T>{





        HashMap<String, Object> operations;
        HashMap<String,Plane> planes;

        public void SavedPlanes(Plane p) {
            if (planes == null) {
                planes = new HashMap<>();
            }
            if (!planes.containsKey(p.getPlaneId())) {
                planes.put(p.getPlaneId(), p);
            } else {
                System.out.println("This plane is already exist");
            }
        }
        public  void createOperation(T operation)
        {

            if (operations == null) {
                operations = new HashMap<>();
            }

            if(operation.equals(StimulatingOperation.class))
            {
                if (!operations.containsKey(((StimulatingOperation) operation).getOperationName())) {
                    operations.put(((StimulatingOperation) operation).getOperationName(), operation);
                } else {
                    System.out.println("This StimulatingOperation is already exist");
                }
            }
            if(operation.equals(IntelligenceGathering.class))
            {
                if (!operations.containsKey(((IntelligenceGathering) operation).getOperationName())) {
                    operations.put(((IntelligenceGathering) operation).getOperationName(), operation);
                } else {
                    System.out.println("This IntelligenceGathering is already exist");
                }
            }
            if(operation.equals(AttackOperation.class))
            {
                if (!operations.containsKey(((AttackOperation) operation).getOperationName())) {
                    operations.put(((AttackOperation) operation).getOperationName(), operation);
                } else {
                    System.out.println("This AttackOperation is already exist");
                }
            }

        }
        public  void assignPlaneToOperation( T operation)
        {
            if(operation.equals(IntelligenceGathering.class))
            {
                if(!(((IntelligenceGathering) operation).getNumberOfPlanes()>planes.size()))
                {
                    for(Plane p: planes.values()) {
                        if (((IntelligenceGathering) operation).getEndTime() - ((IntelligenceGathering) operation).getBeginTime() + 1>=p.getTimeOfLand())
                        {
                            ((IntelligenceGathering) operation).getPlanes().add(p);
                            p.setStatus(false);
                        }
                    }
                    if(((IntelligenceGathering) operation).getPlanes().size()!=((IntelligenceGathering) operation).getNumberOfPlanes())
                    {
                        System.out.println("There are not enough planes for this operation");

                    }
                }
            }
            else if(operation.equals(AttackOperation.class))
            {
                if(!(((AttackOperation) operation).getNumberOfPlanes()>planes.size()))
                {
                    for(Plane p: planes.values()) {
                        if (((AttackOperation) operation).getEndTime() - ((AttackOperation) operation).getBeginTime() + 1>=p.getTimeOfLand())
                        {
                            ((AttackOperation) operation).getPlanes().add(p);
                            p.setStatus(false);
                        }
                    }
                    if(((AttackOperation) operation).getPlanes().size()!=((AttackOperation) operation).getNumberOfPlanes())
                    {
                        System.out.println("There are not enough planes for this operation");

                    }
                }
            }
            else
            {
                System.out.println(" ");
            }
        }

        public void updateTimeOfOperation(double endTime,double beginTime, Object operation)
        {
            if(operation.equals(IntelligenceGathering.class)) {
                if (!((((IntelligenceGathering) operation).getEndTime() - ((IntelligenceGathering) operation).getBeginTime()) < (endTime - beginTime))) {
                    ((IntelligenceGathering) operation).setBeginTime(beginTime);
                    ((IntelligenceGathering) operation).setEndTime(endTime);
                    assignPlaneToOperation((T) operation);
                } else {
                    System.out.println("there are no side effects after changing schedule ");
                }
            }
            else if(operation.equals(AttackOperation.class)) {
                if (!((((AttackOperation) operation).getEndTime() - ((AttackOperation) operation).getBeginTime()) < (endTime - beginTime))) {
                    ((AttackOperation) operation).setBeginTime(beginTime);
                    ((AttackOperation) operation).setEndTime(endTime);
                    assignPlaneToOperation((T) operation);
                } else {
                    System.out.println("there are no side effects after changing schedule ");
                }
            }
        }
        public static boolean isOperationReady(Object operation)
        {
            LocalDateTime localDateTime = LocalDateTime.now();
            if(operation.equals(AttackOperation.class)) {
                if (((AttackOperation) operation).getNumberOfPlanes() == ((AttackOperation) operation).getPlanes().size() && localDateTime + ((LocalDateTime)((AttackOperation) operation).getBeginTime()) < 10) {
                    return true;
                }
                return false;
            }
            if(operation.equals(IntelligenceGathering.class)) {
                if (((IntelligenceGathering) operation).getNumberOfPlanes() == Math.floor(0.8*((IntelligenceGathering) operation).getPlanes().size()) && localDateTime + ((LocalDateTime)((AttackOperation) operation).getBeginTime()) < 3) {
                    return true;
                }
                return false;
            }
            return false;
        }
        public static void main(String[] args)
        {
            Object operation=new StimulatingOperation("bbb","ddd",1,TypeOfCamera.HEAT,"australia");
        }
    }


}
