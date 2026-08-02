import java.util.PriorityQueue;
import java.util.HashMap;

// /* Question 1 --> Hospital Emergency Queue */
class Patient {
    private int id;
    private String name;
    private String emergencyLevel;

    Patient(int id, String name, String emLevel) {
        this.id = id;
        this.name = name;
        this.emergencyLevel = emLevel;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return emergencyLevel;
    }
}

class Hospital {
    private String hospitalName;
    private HashMap<Integer, Patient> map = new HashMap<>();
    private PriorityQueue<Patient> pList = new PriorityQueue<>();

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void addPatient(Patient p) {
        if (p != null) {
            map.put(p.getId(), p);
        }
        return;
    }

    public String isRegistered(int id) {
        if(map.containsKey(id)){
            return "Already registered ..";
        }
        return "Patient not exist";
    }
}

public class oops_dsa_6 {
    public static void main(String [] args){
        System.out.println("This is java");
    }
}
