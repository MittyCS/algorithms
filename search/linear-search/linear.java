public class linear {
  public static void main(String args[]) {
  }
  
  //Function: findItemInList
  //Input: itemToFind (Object), itemList (ArrayList<Object>)
  //Output: Index of item in list, or -1 if the item is not in the list
  public static int findItemInList(Object itemToFind, ArrayList<Object> itemList) {
    //Iterate through list
    for (int i = 0; i < itemList.size(); i++) {
      //Check if current item is item we are looking for
      if (itemList.get(i).equals(itemToFind)) {
        //Return index of item and finish function
        return i;
      }
    }
    //If no item is found, return -1
    return -1;
  }
}
