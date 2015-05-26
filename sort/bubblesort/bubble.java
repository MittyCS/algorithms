import java.util.ArrayList;

class bubble {
  public static void main() {
  
  }
  
  public static ArrayList<Double> bubblesort(ArrayList<Double> unsortedlist) {
    for (int i=0; i < unsortedlist.size(); i++) {
      for (int j=0; j < unsortedlist.size() - i - 1; j++) {
        if (unsortedlist.get(j) > unsortedlist.get(j+1)) {
          Double temp = unsortedlist.get(j+1);
          unsortedlist.set(j+1, unsortedlist.get(j));
          unsortedlist.set(j, temp);
        }
      }
    }
    return unsortedlist;
  }
}
