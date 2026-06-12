import java.util.ArrayList;
// import java.util.Stack;

// /* Question 3 Inheritance + ArrayList (Easy) */ 
class LibraryItem {
    private String itemId;
    private String title;

    LibraryItem(String itemId, String title) {
        this.itemId = itemId;
        this.title = title;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getItemInfo() {
        return itemId + " " + title;
    }
}

class Book extends LibraryItem {
    private String author;

    Book(String author, String itemId, String title) {
        super(itemId, title);
        this.author = author;
    }

    @Override
    public String getItemInfo() {
        String str = super.getItemInfo();
        return author.concat(str);
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

    Magazine(int issueNumber, String itemId, String title) {
        super(itemId, title);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getItemInfo() {
        String prev = super.getItemInfo();
        return Integer.toString(issueNumber) + " ".concat(prev);
    }
}

class Library {
    private String libraryName;
    private ArrayList<LibraryItem> liblist = new ArrayList<LibraryItem>();

    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addItem(LibraryItem item) {
        liblist.add(item);
    }

    public ArrayList<LibraryItem> getAllItems() {
        return liblist;
    }
}

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
        Book b1 = new Book("William Shakespeare", "WS-206", "Merchant of Venice");
        Book b2 = new Book("Yashvant Kanethkar", "YK-406", "Let Us C");
        Magazine m1 = new Magazine(104, "JL-109", "India Today");
        Library lib = new Library("My Library");
        lib.addItem(b1);
        lib.addItem(b2);
        lib.addItem(m1);
        System.out.println("Library Info ==> " + lib.getAllItems());
    }
}
