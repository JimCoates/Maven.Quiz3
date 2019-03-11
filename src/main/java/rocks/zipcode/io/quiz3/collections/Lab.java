package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String name;
    LabStatus status;

    public Lab() {
        this("Name");


    }

    public Lab(String labName) {
        this.name = labName;
        this.status = LabStatus.INCOMPLETE;
    }

    public String getName() {
        return this.name;
    }
    public LabStatus getStatus() {
        return status;
    }

    public void setStatus(LabStatus status) {
        this.status = status;
    }

}
