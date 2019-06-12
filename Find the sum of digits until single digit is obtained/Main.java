#include<stdio.h>
int main()
{
  int n,sum,a,b,c,d,res;
  scanf("%d",&n);
  a=n%10;
  b=n/10;
  sum=a+b;
  c=sum%10;
  d=sum/10;
  res=c+d;
  printf("%d",res);
  return 0;
}