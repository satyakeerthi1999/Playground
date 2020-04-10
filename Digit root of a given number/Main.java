#include<iostream>
int main()
{
   int n,sum=0;
  std::cin>>n ;
  while(1)
  {  
    sum = 0;
  while(n!=0)
  {
    int t = n%10;
    sum =sum+t;
    n = n/10;
  }
    n = sum;
    if(sum <= 9)
      break;
  }  
  std::cout<<sum;
}
