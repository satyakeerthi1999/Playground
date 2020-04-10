#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  std::string s;
  std::string s1;
  std::cin>> s;
  for(int i=0;s[i]!='\0';i++)
  {
     int x = s[i] ;
    if( (65 <= x && x<=90) || (97<=x && x<=122) )
    {
      s1 = s1+s[i] ;
    }
  }
  std::cout<<s1;
}