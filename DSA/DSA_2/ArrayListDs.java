import java.util.ArrayList;


public class ArrayListDs {
   
    public static void removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            boolean isDuplicate = false;
            for (int j = 0; j < newList.size(); j++) {
                if(newList.get(j).equals(current)){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                newList.add(current);
            }
        }

        System.out.println(newList);
    }

    public static void main(String[] args) {
        // /* Question 1 ==> Remove all the duplicate */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        removeDuplicates(list);
    }
}
