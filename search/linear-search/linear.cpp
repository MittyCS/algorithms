#include <iostream>

using namespace std;

//Function: findItemInList
//Input: itemToFind (float), itemList (float[]), arrayLength[int]
//Output: Index of item in list, or -1 if the item is not in the list
int findItemInList(float itemToFind, float itemList[], int arrayLength) {
	//Iterate through array
    for (int i = 0; i < arrayLength; i++) {
    	//Check if current item is the item we are looking for
        if (itemList[i] == itemToFind) {
        	//Return index of item and end function
            return i;
        }
    }
    //If item is not found, return -1
    return -1;
}

//Function: linearSearch
//Input: itemToFind (float), itemList (float[]), arrayLength (int)
//Output: Sentence stating result of search.
void linearSearch(float itemToFind, float itemList[], int arrayLength) {
	int itemIndex = findItemInList(itemToFind, itemList, arrayLength);
	if (itemIndex == -1) {
		cout << "Item was not found in list.";
	} else {
		cout << "Item was found in list at position " << itemIndex << ".";
	}
}

int main()
{
   float itemList[5] = {1.0,76.0,93.0,51.0,42.0};
   float itemToFind = 93.0;
   int arrayLength = 5;
   linearSearch(itemToFind, itemList, arrayLength);
   return 0;
}
