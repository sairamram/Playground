#include<stdio.h>
int main()
{
  int r;
  float pi= 3.14, circumference;
  scanf("%d",&r);
  circumference= pi*r*r;
  printf("%0.2f", circumference);
  return 0;
}