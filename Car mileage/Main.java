#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float m;
  int l,d;
  std::cin>>m>>l>>d;
  float res = d/m;
 // float d = float(d);
  if(l > res)
    std::cout<<"Can reach" ;
  else
    std::cout<<"Cannot reach" ;
  
}