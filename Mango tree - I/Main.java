#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
    int a,b,c;
  cin>>a>>b>>c;
  if((c>=1 && c<=b))
    std::cout<<"Yes" ;
  else if(c%b == 0)
    std::cout<<"Yes";
  else if(c%b==1)
    std::cout<<"Yes" ;
  else
    std::cout<<"No" ;
  
   
}