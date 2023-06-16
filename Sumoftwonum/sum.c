#include<stdio.h>
#include"math.h"
void sum() 
{
    int num1, num2, result;
    
    printf("Enter num1: ");
    scanf("%d", &num1);
    
    printf("Enter num2: ");
    scanf("%d", &num2);
    
    result = num1 + num2;
    
    printf("The sum of %d and %d is: %d\n\n", num1, num2, result);
}
