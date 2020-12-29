#include<stdio.h>
void bubbleSort(int a[],int size);
void printArray(int arr[], int size);
int main()
{
    int a[]={1,15,66,99,6,3};
    int n = sizeof(a)/sizeof(a[0]); 
    printf("Before sort\t");
    printArray(a,n);
    bubbleSort(a,n);
    printf("After sort\t");
    printArray(a,n);
}
void bubbleSort(int a[],int size)
{
    int i,j,t;
    for(i=0;i<size-1;i++)
    {
        for(j=0;j<size-1;j++)
        {
            if(a[j]>a[j+1])
            {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
    }

}
void printArray(int a[], int size) 
{ 
    int i; 
    for (i=0; i < size; i++) 
        printf("%d ", a[i]); 
    printf("\n"); 
} 