/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    * returnSize=2;
    int* r=(int*)malloc(2* sizeof(int));
    for(int i=0;i<numsSize;i++)
    {
        int a=nums[i];
        for(int j=i+1;j<numsSize;j++)
        {
            int b=nums[j];
            if(a+b==target)
            {
                r[0] = i;
                r[1] = j;
                return r;
            }
        }
    }
    return 0;
}