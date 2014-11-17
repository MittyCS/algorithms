'''
Function: find_item_in_list
Input: item_to_find (variable), item_list (list)
Output: Item index if found, or -1 if the item is not in the list
'''
def find_item_in_list(item_to_find, item_list):
  #Iterate through list
  for i in range(len(item_list)):
    #Check if current item is what we are looking for
    if (item_list[i] == item_to_find):
      #Return index of item
      return i
  #Since item was never found, return -1
  return -1

'''
Function: linear_search
Input: item_to_find, variable, item_list (list)
Output: Sentence stating result of search.
'''
def linear_search(item_to_find, item_list):
    item_index = find_item_in_list(item_to_find, item_list)
    if item_index == -1:
        print "Item not found in list."
    else:
        print "Item was found in list at position " + str(item_index) + "."


#Linear search case 1
item_list = [4, 7, 12, 44, 2]
item_to_find = 12
linear_search(item_to_find, item_list)
'''
Function output: 

Item was found in list at position 2.
'''

#Linear search case 1
item_list = [12,42,8,95]
item_to_find = 120
linear_search(item_to_find, item_list)
'''
Function output: 

Item was not found in list.
'''

