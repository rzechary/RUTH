package com.company;

import java.util.HashMap;
import java.util.List;

public class System <T>{
//try
    HashMap<String, AttackOperation> operations;
    HashMap<String,Plane> planes;
    //שמירה של מטוס חדש במידה ולא קיים כבר
    public void SavedPlanes(Plane p) {
        //מבנה נתונים שמתנהג כמו מילון -כל מפתח חייב להיות ייחודי
        if (planes == null) {
            planes = new HashMap<>();
        }
        if (!planes.containsKey(p.getPlaneId())) {
            planes.put(p.getPlaneId(), p);
        } else {
            System.out.println("This plane is already exist");
        }
    }

    //יצירת מבצע מגירה ושמירת אובייקט מסוג מבצע מגירה
    public void StimulatingOperation(StimulatingOperation s) {
        if (operations == null) {
            operations = new HashMap<>();
        }
        if (!operations.containsKey(s.getOperationName())) {
            operations.put(s.getOperationName(), s);
        } else {
            System.out.println("This StimulatingOperation is already exist");
        }
    }

    public void AttackOrGathering(IntelligenceGathering IOperation, AttackOperation AOperation)
    {
        if (operations == null) {
            operations = new HashMap<>();
        }
        /*
        * if(operations.getkey()
        * {
        * if(typeOfClass==1)
        *     StimulatingOperation
        * if(typeOfClass==2)
        *
        * */
        if(!operations.containsKey(IOperation.getOperationName()))
        {
            operations.put(IOperation.getOperationName(),IOperation);
        }
        if(!operations.containsKey(AOperation.getOperationName()))
        {
            operations.put(AOperation.getOperationName(),AOperation);
        }
        else {
            System.out.println("This AttackOrGathering is already exist");
        }


    }
    public void assignPlaneToOperation(AttackOperation operation)
    {
      if(!(operation.getNumberOfPlanes()>planes.size()))
      {
          for(Plane p: planes.values()) {
              if ((operation.getEndTime() - operation.getBeginTime() + 1) >=p.getTimeOfLand())
              {
                  operation.getPlanes().add(p);
                  p.setStatus(false);
              }
          }
          if(operation.getPlanes().size()!=operation.getNumberOfPlanes())
          {
              System.out.println("There are not enough planes for this operation");

          }
      }
    }

    /*syntax*/
    public List<AttackOperation> operationsAccordingToSpecificTime(double endTime,double beginTime)
    {
        //end=5,beg=1,oend=4,obeg=3
        for(AttackOperation attackOperation: operations.values())
        {

        }

    }
    public void updateTimeOfOperation(double endTime,double beginTime, AttackOperation a)
    {
        if(!((a.getEndTime()- a.getBeginTime())<(endTime-beginTime)))
        {
            a.setBeginTime(beginTime);
            a.setEndTime(endTime);
            assignPlaneToOperation(a)   ;
        }
        else
        {
            System.out.println("there are no side effects after changing schedule ");
        }

    }
    public void checkIfOperationIsReady(AttackOperation a)
    {

    }


}
