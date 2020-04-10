#include<iostream>
using namespace std;
struct time
{
   int hr;
   int min;
    int sec;
}t1,t2,t;
int main()
{
  //Type your code here.
  std::cin >>t1.hr>>t1.min>>t1.sec;
  std::cin>>t2.hr>>t2.min>>t2.sec ;
  t.sec  = t1.sec - t2.sec;
  if(t.sec < 0)
  {
     t.sec = t.sec +60;
     t1.min = t1.min - 1;
  }
  t.min = t1.min - t2.min ;
  if(t.min < 0)
  {
    t.min = t.min+60;
    t1.hr = t1.hr - 1;
  }
  t.hr = t1.hr - t2.hr;
  std::cout<<t.hr<<":"<<t.min<<":"<<t.sec ;
}