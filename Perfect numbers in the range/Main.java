#include <iostream>
int perfect(int n)
{
    int sum = 0;
    for(int i=1;i<n;i++)
    {
      if(n%i == 0)
        sum =sum+i ;
    }
    if(sum==n)
      return 1;
    else
      return 0;
}
int main()
{
    int a,b;
  std::cin>>a>>b ;
  for(int i=a;i<=b;i++)
  {
     int x = perfect(i);
     if(x==1)
       std::cout<<i<<" " ;
  }
  return 0;
}
