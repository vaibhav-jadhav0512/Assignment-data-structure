#include<stdio.h>
void insertSort(int a[], int size);
void printArray(int arr[], int size);
int main()
{
    int a[]={1,15,66,99,6,3};
    int n = sizeof(a)/sizeof(a[0]); 
    printf("Before sort\t");
    printArray(a,n);
    insertSort(a,n);
    printf("After sort\t");
    printArray(a,n);
}
void insertSort(int a[], int size)
{
    int i,j,new;

    for(i=0;i<size-1;i++)
    {
        new=a[i+1];
        j=i+1;
        while(j>0 && a[j-1]>new)
        {
            a[j]=a[j-1];
            j--;
        }
        a[j]=new;
    }
}
void printArray(int a[], int size) 
{ 
    int i; 
    for (i=0; i < size; i++) 
        printf("%d ", a[i]); 
    printf("\n"); 
} 