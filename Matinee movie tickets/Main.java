#include<iostream>
using namespace std;
#include <iostream>
#include <iomanip>

int main()
{
  //Type your code here.
  int age;
  float tim;
  float res;
  std::cin>>age>>tim ;
  //std::cout<<tim ;
  if(age > 13)
  {
       if(tim==13.30f)
         res = 5.00;
       else
         res = 8.00;
  }
  else
  { 
      if(tim==13.30f)
         res = 2.00;
       else
         res = 4.00;
   
  }
  
  //std::cout<<"$"<<res ;
    // printf("$%.2f", res);  
      	cout<<fixed<<setprecision(2)<<"$"<<res<<endl;


}