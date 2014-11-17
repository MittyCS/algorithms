public class linear {
    public static void main(String args[]) {
        
      //Linear search example 1    
      double itemToFind = 5;
      double[] itemList = {6, 8, 12, 5, 12};
      linearSearch(itemToFind, itemList);
      //Function output:
      //
      //Item was found in list at position 3.
      
      //Linear search example 2
      double itemToFind2 = 85;
      double[] itemList2 = {7,91,65,23,76};
      linearSearch(itemToFind2, itemList2);
      //Function output:
      //
      //Item was not found in list.
      
    }
    
    //Function: findItemInList
    //Input: itemToFind (double), itemList (double[])
    //Output: Index of item in list, or -1 if the item is not in the list
    public static int findItemInList(double itemToFind, double[] itemList) {
        //Iterate through list
        for (int i = 0; i < itemList.length; i++) {
          //Check if current item is item we are looking for
          if (itemList[i] == itemToFind) {
            //Return index of item and finish function
            return i;
          }
        }
        //If no item is found, return -1
        return -1;
    }
  
    //Function: linearSearch
    //Input: itemToFind (double), itemList (double[])
    //Output: Sentence stating result of search.
    public static void linearSearch(double itemToFind, double[] itemList) {
        int itemIndex = findItemInList(itemToFind, itemList);
        if (itemIndex == -1) {
            System.out.println("Item was not found in list.");
        } else {
            System.out.println("Item was found in list at position " + Integer.toString(itemIndex) + ".");
        }
    }

  
}
