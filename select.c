#include<stdio.h>
void selectSort(int a[],int size);
void printArray(int arr[], int size);
int main()
{
    int a[]={1,15,66,99,6,3};
    int n = sizeof(a)/sizeof(a[0]); 
    printf("Before sort\t");
    printArray(a,n);
    selectSort(a,n);
    printf("After sort\t");
    printArray(a,n);
}
void selectSort(int a[],int size)
{
    int i,j,min,minpos;
    for(i=0;i<size-1;i++)
    {
        min=a[i];
        minpos=i;
        for(j=i+1;j<size;j++)
        {
            if(a[j]>min)
            {
                min=a[j];
                minpos=j;
            }
        }
        a[minpos]=a[i];
        a[i]=min;
    }

}
void printArray(int a[], int size) 
{ 
    int i; 
    for (i=0; i < size; i++) 
        printf("%d ", a[i]); 
    printf("\n"); 
} 