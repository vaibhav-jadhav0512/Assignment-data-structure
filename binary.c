#include<stdio.h>
int binarySearch(int a[],int start,int end,int key);
int main()
{
    int arr[] = { 2, 3, 4, 10, 40 }; 
	int n = sizeof(arr) / sizeof(arr[0]); 
	int x = 2; 
	int result = binarySearch(arr, 0, n - 1, x); 
	(result == -1) ? printf("Element is not present in array") 
				: printf("Element is present at index %d", 
							result); 
	return 0; 
}
int binarySearch(int a[],int start,int end,int key)
{
    if(start==end)
    {
        if(key==a[start])
            return start;
        else
            return -1;
    }
    else 
    {
        int mid=(start+end)/2;
        if(a[mid]==key)
        return mid;
        else
        {
            if(key<a[mid])
            binarySearch(a,start,mid-1,key);
            else
            binarySearch(a,mid+1,end,key);
        }
        
    }
}
