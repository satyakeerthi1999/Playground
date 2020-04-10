#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fs,sa,sd,ss,aa,ad,as ;
  std::cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as ;
  int rf,rs,ra ;
  rf = (fa - (fa*fd)/100) + fs;
    rs = (sa - (sa*sd)/100) + ss;
    ra = (aa - (aa*ad)/100) + as;
  std::cout<<"In Flipkart Rs."<<rf;
  std::cout<<"\nIn Snapdeal Rs."<<rs;
  std::cout<<"\nIn Amazon Rs."<<ra;
  if(rf<=rs && rf<=ra)
    std::cout<<"\nHe will prefer Flipkart" ;
  else if(rs<=rf && rs<=ra)
    std::cout<<"\nHe will prefer Snapdeal" ;
  else
    std::cout<<"\nHe will prefer Amazon" ;
    

}