#include <iostream>

using namespace std;

//Function: findItemInList
//Input: itemToFind (float), itemList (float[]), arrayLength[int]
//Output: Index of item in list, or -1 if the item is not in the list
int findItemInList(float itemToFind, float itemList[], int arrayLength) {
	//Iterate through
    for (int i = 0; i < arrayLength; i++) {
        if (itemList[i] == itemToFind) {
            return i;
        }
    }
    return -1;
}

int main()
{
   float itemList[5] = {1.0,76.0,93.0,51.0,42.0};
   float itemToFind = 93.0;
   int arrayLength = 5;
   
   int itemIndex = findItemInList(itemToFind, itemList, arrayLength);
   
    cout << itemIndex;
      
   return 0;
}
