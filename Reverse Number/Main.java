#include <iostream>
int main() 
{
	// Type your code here
     int n,t,x=0;
    std::cin>> n ;
     while(n!=0)
     {
        t = n%10;
        x = x*10 + t ;
        n = n/10 ;
     }
  std::cout<<x ;
	return 0;
}