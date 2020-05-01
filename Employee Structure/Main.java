#include<iostream>
using namespace std;
struct Emp {char name[20]; int age; int id; char des[20]; long sal; };
int main()
{
  //Type your code here.
  Emp a;
  std::cout << "Enter name:";
  std::cin >> a.name;
  std::cout << "\nEnter ID:";
  std::cin >> a.id;
  std::cout << "\nEnter age:";
  std::cin >> a.age;
  std::cout << "\nEnter designation:";
  std::cin >> a.des;
  std::cout << "\nEnter Salary:";
  std::cin >> a.sal;
  
  std::cout << "\nEmployee Details";
  std::cout << "\nName of the Employee : "<<a.name;
  std::cout << "\nID of the Employee : "<<a.id;
  std::cout << "\nAge of the Employee : "<<a.age;
  std::cout << "\nDesignation of the Employee : "<<a.des;
  std::cout << "\nSalary of the Employee : "<<a.sal;
}