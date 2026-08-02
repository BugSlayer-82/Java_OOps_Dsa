// import java.util.HashMap;
// import java.util.PriorityQueue;

// /* Question 1 --> Hospital Emergency Queue */
// enum EmergencyLevel {
//     HIGH, // Index Original = 0
//     MEDIUM, // Index Original = 1
//     LOW // Index Original = 2
// }
// class Patient implements Comparable<Patient> {
//     private int id;
//     private String name;
//     private EmergencyLevel emergencyLevel;
//     Patient(int id, String name, EmergencyLevel emLevel) {
//         this.id = id;
//         this.name = name;
//         this.emergencyLevel = emLevel;
//     }
//     public int getId() {
//         return id;
//     }
//     public String getName() {
//         return name;
//     }
//     public EmergencyLevel getLevel() {
//         return emergencyLevel;
//     }
//     @Override
//     public int compareTo(Patient p) {
//         return this.emergencyLevel.compareTo(p.emergencyLevel);
//     }
// }
// class Hospital {
//     private String hospitalName;
//     private HashMap<Integer, Patient> map = new HashMap<>();
//     private PriorityQueue<Patient> pList = new PriorityQueue<>();
//     Hospital(String hospitalName) {
//         this.hospitalName = hospitalName;
//     }
//     public String getHospitalName() {
//         return hospitalName;
//     }
//     public void addPatient(Patient p) {
//         if (p != null) {
//             map.put(p.getId(), p);
//             pList.offer(p);
//         }
//         return;
//     }
//     public String isRegistered(int id) {
//         if (map.containsKey(id)) {
//             return "Already registered ..";
//         }
//         return "Patient not exist";
//     }
//     public Patient treatPatient() {
//         Patient patient = pList.poll();
//         if (patient != null) {
//             return map.remove(patient.getId());
//         }
//         return patient;
//     }
// }

public class oops_dsa_6 {
    public static void main(String[] args) {

        // /* Question 1 --> Hospital Emergency Queue */
        // Hospital hospital = new Hospital("City Care Hospital");
        // // Patients added in random order
        // hospital.addPatient(new Patient(101, "Alice", EmergencyLevel.LOW));
        // hospital.addPatient(new Patient(102, "Bob", EmergencyLevel.HIGH));
        // hospital.addPatient(new Patient(103, "Charlie", EmergencyLevel.MEDIUM));
        // System.out.println("ID 102 check: " + hospital.isRegistered(102)); // Quick
        // O(1) registration check
        // // Processing order according to priority (HIGH -> MEDIUM -> LOW)
        // Patient treated1 = hospital.treatPatient();
        // System.out.println("Treated First: " + treated1.getName() + " (" +
        // treated1.getLevel() + ")");
        // Patient treated2 = hospital.treatPatient();
        // System.out.println("Treated Second: " + treated2.getName() + " (" +
        // treated2.getLevel() + ")");
        // Patient treated3 = hospital.treatPatient();
        // System.out.println("Treated Third: " + treated3.getName() + " (" +
        // treated3.getLevel() + ")");
    }
}
