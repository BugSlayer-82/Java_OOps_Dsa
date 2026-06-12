// import java.util.ArrayList;
// import java.util.Stack;

// /* Question 3 Inheritance + ArrayList (Easy) */

// /* Question 2 Encapsulation + Stack (Easy) */
// class BrowserHistory {
//     private String browserName;
//     private Stack<String> history = new Stack<String>();
//     BrowserHistory(String browserName) {
//         this.browserName = browserName;
//     }
//     public void visitPage(String url) {
//         if (url == null) {
//             return;
//         }
//         history.push(url);
//     }
//     public String goBack() {
//         if (history.isEmpty()) {
//             return "No history found";
//         }
//         String oldHistory = history.pop();
//         return oldHistory;
//     }
//     public String getBrowseName() {
//         return browserName;
//     }
//     public int getHistorySize() {
//         return history.size();
//     }
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

    }
}
