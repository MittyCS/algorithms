def bubblesort(nums):
  for i in range(len(nums)):        #First iterative loop for n iterations
    for j in range(len(nums)-i-1):  #Second loop for actual swapping    
      if nums[j] > nums[j+1]:       #Check if swap is necessary
        nums[j], nums[j+1] = nums[j+1], nums[j] #Perform swap
        
  return nums #Return sorted array.
  
