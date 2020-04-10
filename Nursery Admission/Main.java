#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  std::string s;
  std::cin>>s;
  int l = 0;
  for(int i=0;s[i]!='\0';i++)
    l =l +1;
  
  std::cout<<"The number of letters in the name is "<<l ;
}