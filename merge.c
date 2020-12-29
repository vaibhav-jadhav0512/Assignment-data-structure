#include <stdio.h>
void mergeSort(int a[], int start, int end);
void merger(int a[], int start, int mid, int end);
void printArray(int arr[], int size);
int main()
{
    int a[] = {1, 15, 66, 99, 6, 3};
    int n = sizeof(a) / sizeof(a[0]);
    printf("Before sort\t");
    printArray(a, n);
    mergeSort(a, 0, 5);
    printf("After sort\t");
    printArray(a, n);
}
void mergeSort(int a[], int start, int end)
{
    if (start < end)
    {
        int mid = (start + end) / 2;
        (mergeSort(a, start, mid));
        (mergeSort(a, mid + 1, end));
        merger(a, start, mid, end);
    }
}
static int temp[6] = {};
void merger(int a[], int start, int mid, int end)
{
    int i, j, tindex;
    i = start;
    j = mid + 1;
    tindex = start;

    while (i <= mid && j <= end)
    {
        if (a[i] < a[j])
            temp[tindex++] = a[i++];
        else
            temp[tindex++] = a[j++];
    }

    while (j <= end)
        temp[tindex++] = a[j++];
    while (i <= end)
        temp[tindex++] = a[i++];

    for (i = start; i <= end; i++)
    {
        a[i] = temp[i];
    }
}
void printArray(int a[], int size)
{
    int i;
    for (i = 0; i < size; i++)
        printf("%d ", a[i]);
    printf("\n");
}