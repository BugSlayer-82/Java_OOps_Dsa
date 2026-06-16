
// import java.util.ArrayList;
import java.util.Stack;
// import java.util.Queue;
// import java.util.LinkedList;

// /* Question 8 Abstract + Interface + Stack (Medium-Hard) */
interface Executable {
    String execute();
    String undo();
}

abstract class TextCommand {
    private String commandText;
    protected String targetText;

    TextCommand(String commandText, String targetText) {
        this.commandText = commandText;
        this.targetText = targetText;
    }

    public String getCommandText() {
        return commandText;
    }

    public String getTargetText() {
        return targetText;
    }

    abstract String getDescription();
}

class TypeCommand extends TextCommand implements Executable {
    TypeCommand(String commandText, String targetText) {
        super(commandText, targetText);
    }

    public String execute() {
        return "Typed : " + targetText;
    }

    public String undo() {
        return "Removed : " + targetText;
    }

    // Write your own descirption
    public String getDescription() {
        return getCommandText()+"text :'"+getTargetText()+"'";
    }
}

class DeleteCommand extends TextCommand implements Executable {
    DeleteCommand(String commandText, String targetText) {
        super(commandText, targetText);
    }

    public String execute() {
        return "Deleted : " + targetText;
    }

    public String undo() {
        return "Restored : " + targetText;
    }

    // Write your own description
    public String getDescription() {
        return "";
    }
}

class TextEditor {
    private String editorName;
}

// /* Question 7 Static + Composition + ArrayList (Medium) */
// class MenuItem {
// private String itemName;
// private double price;
// private static int totalMenuItems = 0;
// MenuItem(String itemName, double price) {
// this.itemName = itemName;
// this.price = price;
// totalMenuItems++;
// }
// public String getItemName() {
// return itemName;
// }
// public double getPrice() {
// return price;
// }
// public static int getTotalMenuItems() {
// return totalMenuItems;
// }
// }
// class Order {
// private String orderId;
// private String customerName;
// private static int totalOrders = 0;
// private ArrayList<MenuItem> list = new ArrayList<>();
// Order(String orderId, String customerName) {
// this.orderId = orderId;
// this.customerName = customerName;
// totalOrders++;
// }
// public void addItem(MenuItem item) {
// list.add(item);
// }
// public double getOrderTotal() {
// double totalPrice = 0;
// for (MenuItem menuItem : list) {
// totalPrice += menuItem.getPrice();
// }
// return totalPrice;
//
// public String getOrderSummary() {
// return orderId + " " + customerName + " " + getOrderTotal();
// }
// public static int getTotalOrders() {
// return totalOrders;
// }
// }

// /* Question 6 Polymorphism + ArrayList (Medium)*/
// class Animal {
// private String animalName;
// private String animalId;
// private int age;
// Animal(String animalId,String animalName, int age) {
// this.animalName = animalName;
// this.animalId = animalId;
// this.age = age;
// }
// public String getAnimalName() {
// return animalName;
// }
// public String getAnimalId() {
// return animalId;
// }
// public int getAge() {
// return age;
// }
// public String getFeedingSchedule() {
// return "Generic feeding schedule for " + animalName;
// }
// }
// class Lion extends Animal {
// private String preyType;
// Lion(String animalId,String animalName, int age, String preyType) {
// super(animalId,animalName, age);
// this.preyType = preyType;
// }
// @Override
// public String getFeedingSchedule() {
// return super.getFeedingSchedule()+" "+"Two-Four day";
// }
// public String getPreyType(){
// return preyType;
// }
// }
// class Elephant extends Animal {
// private int dailyFoodKg;
// Elephant(String animalId,String animalName, int age, int dailyFoodKg) {
// super(animalId,animalName, age);
// this.dailyFoodKg = dailyFoodKg;
// }
// @Override
// public String getFeedingSchedule() {
// return super.getFeedingSchedule() + " " + "Daily Continuously";
// }
// public int getDailyFood(){
// return dailyFoodKg;
// }
// }
// class Parrot extends Animal {
// private String favouriteFruit;
// Parrot(String animalId,String animalName, int age, String favouriteFruit) {
// super(animalId,animalName, age);
// this.favouriteFruit = favouriteFruit;
// }
// @Override
// public String getFeedingSchedule() {
// return super.getFeedingSchedule() + " "+"Twice daily";
// }
// public String getFavouriteFruit(){
// return favouriteFruit;
// }
// }
// class Zoo {
// private String zooName;
// private ArrayList<Animal> list = new ArrayList<Animal>();
// Zoo(String zooName) {
// this.zooName = zooName;
// }
// public void addAnimal(Animal animal) {
// list.add(animal);
// }
// public String getZooName(){
// return zooName;
// }
// public String getFeedingReport() {
// String str = "";
// for(Animal anm : list){
// str += anm.getFeedingSchedule()+ "\n";
// }
// return str;
// }
// }

// /* Queustion 5 Interface + LinkedList (Medium) */
// interface Manageable {
// String getTaskId()
// String getStatus();
// String updateStatus(String newStatus);
// }
// class Task implements Manageable {
// private String taskId;
// private String taskName;
// private String status;
// Task(String taskId, String taskName) {
// this.taskId = taskId;
// this.taskName = taskName;
// this.status = "PENDING";
// }
// public String updateStatus(String newStatus) {
// this.status = newStatus;
// return "Status updated to : " + newStatus;
// }
// public String getStatus() {
// return status;
// }
// public String getTaskId() {
// return taskId;
// }
// public String getTaskName() {
// return taskName;
// }
// }
// class TaskManager {
// private String managerName;
// private LinkedList<Task> list = new LinkedList<Task>();
// TaskManager(String managerName) {
// this.managerName = managerName;
// }
// public String getManagerName() {
// return managerName;
// }
// public void addTask(Task task) {
// list.add(task);
// }
// public Task getTaskById(String taskId) {
// for (int i = 0; i < list.size(); i++) {
// String temp = (list.get(i)).getTaskId();
// if (taskId.equals(temp)) {
// return list.get(i);
// }
// }
// return null;
// }
// public LinkedList<Task> getAllTasks() {
// return list;
// }
// }

// /* Question 4 Abstraction + Queue (Medium) */
// abstract class SupportTicket {
// private String ticketId;
// private String customerName;
// private String issueDescription;
// SupportTicket(String ticketId, String customerName, String issueDescription)
// {
// this.ticketId = ticketId;
// this.customerName = customerName;
// this.issueDescription = issueDescription;
// }
// public String getTicketId() {
// return ticketId;
// }
// public String getCustomerName() {
// return customerName;
// }
// public String getIssueDescription() {
// return issueDescription;
// }
// abstract String getPriority();
// public String getTicketSummary() {
// return ticketId + " " + customerName + " " + issueDescription + " " +
// getPriority();
// }
// }
// class UrgentTicket extends SupportTicket {
// public String getPriority() {
// return "HIGH";
// }
// UrgentTicket(String ticketId, String customerName, String issueDescription) {
// super(ticketId, customerName, issueDescription);
// }
// }
// class NormalTicket extends SupportTicket {
// public String getPriority() {
// return "LOW";
// }
// NormalTicket(String ticketId, String customerName, String issueDescription) {
// super(ticketId, customerName, issueDescription);
// }
// }
// class TicketQueue {
// private Queue<SupportTicket> q = new LinkedList<SupportTicket>();
// public void addTicket(SupportTicket ticket) {
// q.add(ticket);
// }
// public SupportTicket processNextTicket() {
// if (q.isEmpty()) {
// return null;
// }
// SupportTicket tck = q.remove();
// return tck;
// }
// public int getQueueSize() {
// return q.size();
// }
// }

// /* Question 3 Inheritance + ArrayList (Easy) */
// class LibraryItem {
// private String itemId;
// private String title;
// LibraryItem(String itemId, String title) {
// this.itemId = itemId;
// this.title = title;
// }
// public String getItemId() {
// return itemId;
// }
// public String getTitle() {
// return title;
// }
// public String getItemInfo() {
// return itemId + " " + title;
// }
// }
// class Book extends LibraryItem {
// private String author;
// Book(String author, String itemId, String title) {
// super(itemId, title);
// this.author = author;
// }
// @Override
// public String getItemInfo() {
// String str = super.getItemInfo();
// return author + " ".concat(str);
// }
// }
// class Magazine extends LibraryItem {
// private int issueNumber;
// Magazine(int issueNumber, String itemId, String title) {
// super(itemId, title);
// this.issueNumber = issueNumber;
// }
// @Override
// public String getItemInfo() {
// String prev = super.getItemInfo();
// return Integer.toString(issueNumber) + " ".concat(prev);
// }
// }
// class Library {
// private String libraryName;
// private ArrayList<LibraryItem> liblist = new ArrayList<LibraryItem>();
// Library(String libraryName) {
// this.libraryName = libraryName;
// }
// public String getLibraryName() {
// return libraryName;
// }
// public void addItem(LibraryItem item) {
// liblist.add(item);
// }
// public ArrayList<LibraryItem> getAllItems() {
// return new ArrayList<>(liblist);
// }
// }

// /* Question 2 Encapsulation + Stack (Easy) */
// s BrowserHistory {
// private String browserName;
// private Stack<String> history = new Stack<String>();
// serHistory(String browserName) {
// this.browserName = browserName;
// }
// ic void visitPage(String url) {
// url == null) {
// return;
// }
// history.push(url);
// }
// ic String goBack() {
// history.isEmpty()) {
// return "No history found";
// }
// String oldHistory = history.pop();
// return oldHistory;
// }
// ic String getBrowseName() {
// return browserName;
// }
// ic int getHistorySize() {
// return history.size();
// }
// }

// /* Question 1 Encapsulation + ArrayList (Easy) */
// class Playlist {
// private ArrayList<String> list = new ArrayList<String>();
// private String playlistName;
// Playlist(String playlistName) {
// this.playlistName = playlistName;
// }
// public String addSong(String song) {
// if (song == null) {
// return "Invalid song ....!";
// } else {
// list.add(song);
// return "Song added successfully ....";
// }
// }
// public String removeSong(String songName) {
// if (list.isEmpty()) {
// return "Playlist is empty ..!";
// }
// if (list.contains(songName)) {
// list.remove(songName);
// return "Song is remove ....";
// }
// return "Song name does not exist ..!";
// }
// public String getPlaylist() {
// return playlistName;
// }
// public ArrayList<String> getAllSong() {
// return list;
// }
// }

public class Oops_dsa_3 {

    public static void main(String[] args) {
        // /* Question 1 ===> Encapsulation + ArrayList (Easy) */
        // Playlist play = new Playlist("Hollywood");
        // System.out.println(play.addSong("Terebin"));
        // System.out.println(play.addSong("Sitaare"));
        // System.out.println(play.addSong("Barbaad"));
        // System.out.println(play.removeSong("Sitaare"));
        // System.out.println("Remaining Songs are :- ");
        // System.out.println(play.getAllSong());

        // /* Question 2 ===> Encapsulation + Stack (Easy) */
        // BrowserHistory bh = new BrowserHistory("firefox");
        // bh.visitPage("Google.com");
        // bh.visitPage("ChatGpt.com");
        // bh.visitPage("Claude.com");
        // bh.visitPage("Apple.com");
        // System.out.println("Browser name ==> " + bh.getBrowseName());
        // System.out.println(bh.goBack());
        // System.out.println(bh.getHistorySize());
        // System.out.println(bh.goBack());
        // System.out.println(bh.getHistorySize());

        // /* Question 3 ===> Inheritance + ArrayList (Easy) */
        // Book b1 = new Book("WilliamShakespeare", "WS-206", "Merchant of Venice");
        // Book b2 = new Book("Yashvant Kanethkar", "YK-406", "Let Us C");
        // Magazine m1 = new Magazine(104, "JL-109", "India Today");
        // Library lib = new Library("City Library");
        // lib.addItem(b1);
        // lib.addItem(b2);
        // lib.addItem(m1);
        // System.out.println("Library name ==> " + lib.getLibraryName());
        // ArrayList<LibraryItem> list = lib.getAllItems();
        // int i = 0;
        // while (i < list.size()) {
        // System.out.println((list.get(i).getItemInfo()));
        // i++;
        // }

        // /* Question 4 ===> Abstraction + Queue (Medium) */
        // UrgentTicket ut1 = new UrgentTicket("TU-152", "Tony", "Server issue");
        // UrgentTicket ut2 = new UrgentTicket("TU-122", "Popoye", "Payment issue");
        // NormalTicket nt1 = new NormalTicket("TN-435", "Banner", "Late booking");
        // NormalTicket nt2 = new NormalTicket("TN-345", "Steve", "Late entry");
        // TicketQueue tq = new TicketQueue();
        // tq.addTicket(ut1);
        // tq.addTicket(ut2);
        // tq.addTicket(nt1);
        // tq.addTicket(nt2);
        // int i = 0;
        // while (i != 4) {
        // SupportTicket ticket = tq.processNextTicket();
        // if (ticket != null) {
        // System.out.println("Ticket Summary ==> " + ticket.getTicketSummary());
        // }
        // System.out.println("Queue Size ==> " + tq.getQueueSize());
        // i++;
        // }

        // /* Question 5 ===> Interface + LinkedList (Medium) */
        // Task t0 = new Task("T-105", "Terminal");
        // Task t1 = new Task("T-106", "VsCode");
        // Task t2 = new Task("T-108", "Safari");
        // TaskManager tm = new TaskManager("Tony Stark");
        // System.out.println(tm.getManagerName());
        // tm.addTask(t0);
        // tm.addTask(t1);
        // tm.addTask(t2);
        // Task ts = tm.getTaskById("T-105");
        // System.out.println(ts.updateStatus("Active"));
        // LinkedList<Task> list = tm.getAllTasks();
        // int i = 0;
        // while (i < list.size()) {
        // Task task = list.get(i);
        // System.out.println(task.getTaskName() + " " + task.getTaskId() + " " + " " +
        // task.getStatus());
        // i++;
        // }

        // /* Question 6 ===> Polymorphism + ArrayList (Medium)*/
        // Animal a1 = new Lion("A-589","Lion",56,"Wildbeests");
        // Animal a2 = new Elephant("A-425","Elephant", 40,140);
        // Animal a3 = new Parrot("A-756","Parrot",20,"Bananas");
        // Zoo zn = new Zoo("Kanpur Zoo");
        // zn.addAnimal(a1);
        // zn.addAnimal(a2);
        // zn.addAnimal(a3);
        // System.out.println("Zoo Name ==> "+zn.getZooName());
        // System.out.println("Feeding reports are :- ");
        // System.out.print(zn.getFeedingReport());

        // /* Question 7 ===> Static + Composition + ArrayList (Medium) */
        // MenuItem m1 = new MenuItem("Pizza", 250.65d);
        // MenuItem m2 = new MenuItem("Burger", 79.0d);
        // MenuItem m3 = new MenuItem("Pasta", 60.87d);
        // Order o1 = new Order("O-789", "Tony-Stark");
        // Order o2 = new Order("O-456", "Strange");
        // o1.addItem(m3);
        // o2.addItem(m1);
        // System.out.println("Order summary ==> " + o1.getOrderSummary());
        // System.out.println("Order Summary ==> " + o2.getOrderSummary());
        // System.out.println("Total Menu ==> " + MenuItem.getTotalMenuItems());
        // System.out.println("Total Order ==> " + Order.getTotalOrders());

        // /* Question 8 ===> Abstract + Interface + Stack (Medium-Hard) *


    }
}
