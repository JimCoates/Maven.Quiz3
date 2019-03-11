package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    Map<Lab, LabStatus> labMap;

    public Student() {
        labMap = new HashMap<>();
    }

    public Student(Map<Lab, LabStatus> map) {
        this.labMap = map;
    }

    public Lab getLab(String labName) {
        for (Lab lab: labMap.keySet()) {
            if (lab.getName().equals(labName)) {
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = getLab(labName);
        labMap.put(lab,labStatus);
    }


    public void forkLab(Lab lab) {
        this.labMap.put(lab,LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        return this.labMap.get(getLab(labName));
    }

    public String toString(){
        StringBuilder answer = new StringBuilder();
        for (Lab lab: labMap.keySet()) {
            answer.append(lab.getName() + " > " + lab.getStatus() + "\n");
        }
        return answer.toString();
    }
}
