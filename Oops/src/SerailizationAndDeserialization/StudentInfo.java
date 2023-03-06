package SerailizationAndDeserialization;

import java.io.Serializable;

public class StudentInfo implements Serializable {
    private String name;
    private int rNo;
    private String standard;

    public StudentInfo(String name, int rNo, String standard) {
        this.name = name;
        this.rNo = rNo;
        this.standard = standard;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getrNo() {
        return rNo;
    }

    public void setrNo(int rNo) {
        this.rNo = rNo;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
