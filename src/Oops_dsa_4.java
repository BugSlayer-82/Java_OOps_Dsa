// import java.util.Stack;
// import java.util.ArrayList;

// /* Question 3 Inheritance + ArrayList + StringBuilder (Medium) */
// class Vehicle {
//     private String vehicleId;
//     private String brand;
//     private int year;
//     Vehicle(String vehicleId, String brand, int year) {
//         this.vehicleId = vehicleId;
//         this.brand = brand;
//         this.year = year;
//     }
//     public String getVehicleId() {
//         return vehicleId;
//     }
//     public String getBrand() {
//         return brand;
//     }
//     public int getYear() {
//         return year;
//     }
//     public String getVehicleInfo() {
//         return vehicleId + " " + brand + " " + year;
//     }
// }
// class Car extends Vehicle {
//     private int numberOfDoors;
//     Car(String vehicleId, String brand, int year, int numberOfDoors) {
//         super(vehicleId, brand, year);
//         this.numberOfDoors = numberOfDoors;
//     }
//     @Override
//     public String getVehicleInfo() {
//         return super.getVehicleInfo() + " " + numberOfDoors;
//     }
// }
// class Bike extends Vehicle {
//     private String bikeType;
//     Bike(String vehicleId, String brand, int year, String bikeType) {
//         super(vehicleId, brand, year);
//         this.bikeType = bikeType;
//     }
//     @Override
//     public String getVehicleInfo() {
//         return super.getVehicleInfo() + " " + bikeType;
//     }
// }
// class RentalAgency {
//     private String agencyName;
//     private ArrayList<Vehicle> vehList = new ArrayList<Vehicle>();
//     RentalAgency(String agencyName) {
//         this.agencyName = agencyName;
//     }
//     public String getAgencyName() {
//         return agencyName;
//     }
//     public void addVehicle(Vehicle v) {
//         vehList.add(v);
//     }
//     public String getRentalCatalog() {
//         StringBuilder sb = new StringBuilder();
//         for (Vehicle vh : vehList) {
//             sb.append(vh.getVehicleInfo());
//             sb.append("\n");
//         }
//         return sb.toString();
//     }
// }

// /* Question 2 Encapsulation + Stack + StringBuilder (Easy) */
// class CodeEditor {
// private String fileName;
// private StringBuilder sb = new StringBuilder();
// private Stack<String> snapShot = new Stack<>();
// CodeEditor(String fileName) {
// this.fileName = fileName;
// }
// public String getFileName() {
// return fileName;
// }
// public void typeCode(String code) {
// String currContent = sb.toString();
// snapShot.push(currContent);
// sb.append(code);
// }
// public String undo() {
// if (snapShot.isEmpty()) {
// return "Nothing to undo";
// }
// String prevState = snapShot.pop();
// sb.setLength(0);
// sb.append(prevState);
// return "";
// }
// public String getCurrentCode() {
// return sb.toString();
// }
// }

// /* Question 1 Encapsulation + StringBuilder + ArrayList (Easy) */
// class Note {
// private String noteId;
// private String title;
// private StringBuilder sb = new StringBuilder();
// Note(String noteId, String title) {
// this.noteId = noteId;
// this.title = title;
// }
// public void appendContent(String text) {
// sb.append(text);
// }
// public void clearContent() {
// sb.setLength(0);
// }
// public String getContent() {
// return sb.toString();
// }
// public String getNoteId() {
// return noteId;
// }
// public String getTitle() {
// return title;
// }
// }
// class NoteBook {
// private String ownerName;
// private ArrayList<Note> list = new ArrayList<Note>();
// NoteBook(String ownerName) {
// this.ownerName = ownerName;
// }
// public String getOwnerName() {
// return ownerName;
// }
// public void addNote(Note note) {
// list.add(note);
// }
// public Note getNoteById(String noteId) {
// for (Note n : list) {
// if ((n.getNoteId()).equals(noteId)) {
// return n;
// }
// }
// return null;
// }
// public ArrayList<Note> getAllNotes() {
// return list;
// }
// }

public class Oops_dsa_4 {
    public static void main(String[] args) {
        // /* Question 1 ===> Encapsulation + StringBuilder + ArrayList (Easy) */
        // NoteBook nb = new NoteBook("Tony Stark");
        // Note n1 = new Note("N-024", "Graphs");
        // Note n2 = new Note("N-570", "Tree");
        // Note n3 = new Note("N-608", "Set");
        // nb.addNote(n1);
        // nb.addNote(n2);
        // nb.addNote(n3);
        // n1.appendContent("Jarvis ");
        // n1.appendContent("Friday");
        // n2.appendContent("3d-Plain ");
        // n2.appendContent("2d-Plain");
        // n3.appendContent("Green Tree ");
        // n3.appendContent("Yellow Tree");
        // Note nadd = nb.getNoteById("N-570");
        // nadd.clearContent();
        // nadd.appendContent("4d-Plain");
        // for (Note e : nb.getAllNotes()) {
        // System.out.print(
        // "NoteId ==> " + e.getNoteId()
        // + "\n" +
        // "Title ==> " + e.getTitle()
        // + "\n" +
        // "Content ==> " + e.getContent()
        // + "\n");
        // }

        // /* Question 2 ===> Encapsulation + Stack + StringBuilder (Easy) */
        // CodeEditor ce = new CodeEditor("Linux.txt");
        // ce.typeCode("cd");
        // ce.typeCode("ls");
        // ce.typeCode("clear");
        // ce.undo();
        // System.out.println("Current code ==> " + ce.getCurrentCode());
        // ce.undo();
        // System.out.println("Current code ==> " + ce.getCurrentCode());

        // /* Question 3 ===> Inheritance + ArrayList + StringBuilder (Medium) */
        // Car c1 = new Car("C-503", "Porche", 2003, 4);
        // Car c2 = new Car("C-501", "BMW", 2002, 4);
        // Bike b1 = new Bike("B-609", "R15", 2008, "Petrol");
        // Bike b2 = new Bike("B-659", "BMW", 2005, "Electric");
        // RentalAgency ra = new RentalAgency("Tony's Vehicle Dealer");
        // ra.addVehicle(c1);
        // ra.addVehicle(c2);
        // ra.addVehicle(b1);
        // ra.addVehicle(b2);
        // System.out.print(ra.getRentalCatalog());
    }
}
