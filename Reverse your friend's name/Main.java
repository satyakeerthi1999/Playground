#include <iostream>
#include <string> 
using namespace std; 
int main()
{
char rev[100]; 
  string str;
int count = 0, end, i;    
//Your code goes here              
   getline(cin,str);
  for (int i=str.length()-1; i>=0; i--) 
    std::cout<<str[i];
  }