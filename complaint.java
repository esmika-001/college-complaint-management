import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class complaint implements Serializable {
    private int cNo;
    private String dept;
    private String comp;
    private String soln;
    private int priority;
    private String type;
    private String email;
    private String address; // Added address field
    private Date lodgedDate;
    private Date resolvedDate;

    public complaint(int cNo, String dept, String comp, String soln, int priority, String type, String email, String address) {
        this.cNo = cNo;
        this.dept = dept;
        this.comp = comp;
        this.soln = soln;
        this.priority = priority;
        this.type = type;
        this.email = email;
        this.address = address;
        this.lodgedDate = new Date(); // Set the lodged date when the complaint is created
    }
    // Add getAddress method
    

    public int getcNo() {
        return cNo;
    }

    public String getDept() {
        return dept;
    }

    public String getComp() {
        return comp;
    }

    public String getSoln() {
        return soln;
    }

    public int getPriority() {
        return priority;
    }

    public String getType() {
        return type;
    }
    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
    public Date getLodgedDate() {
        return lodgedDate;
    }
    
    public Date getResolvedDate() {
        return resolvedDate;
    }

    public void resolveComplaint(String solution) {
        this.soln = solution;
        this.resolvedDate = new Date(); // Set the resolved date when the complaint is resolved
    }

    @Override
    public String toString() {
        return "Complaint No: " + cNo + "\nDepartment: " + dept + "\nComplaint: " + comp +
                "\nSolution: " + soln + "\nPriority: " + priority + "\nType: " + type ;
    }
}
