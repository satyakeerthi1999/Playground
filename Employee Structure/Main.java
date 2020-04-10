#include<iostream>
#include<string>
using namespace std;
struct emp
{
  std::string name;
  int id;
  int age;
  std::string desc;
  int sal;
}e;
int main()
{
  //Type your code here.
  std::cout<<"Enter name:\n";
  getline(std::cin,e.name);
  std::cout<<"Enter ID:\n";
  std::cin >>e.id;
  std::cout<<"Enter age:\n";
  std::cin >> e.age ;
  std::cout<< "Enter designation:\n";
  //getline(std::cin,e.desc);
  std::cin >> e.desc ;
  std::cout<<"Enter Salary:\n";
  std::cin >> e.sal;
  
  std::cout<<"Employee Details\n";
  std::cout<<"Name of the Employee : "<<e.name<<"\n" ;
  std::cout<<"ID of the Employee : "<<e.id<<"\n";
  std::cout<<"Age of the Employee : "<<e.age<<"\n";
  std::cout<<"Designation of the Employee : "<<e.desc<<"\n" ;
  std::cout<<"Salary of the Employee : "<<e.sal;
}  
  