#include<iostream>
#include<cstring>
using namespace std;
struct College { char name[100]; char city[100]; int establishmentYear; float passPercentage; };
int main()
{
  //Type your code here.
  int n, i, j;
  std::cout << "Enter the number of colleges";
  std::cin >> n;
  College a[n], t;
  for (i=0; i<n; i++) {
    std::cout << "\nEnter the details of college " <<i+1;
    std::cout << "\nEnter name";
    std::cout << "\nEnter city";
    std::cout << "\nEnter year of establishment";
    std::cout << "\nEnter pass percentage";
    std::cin >> a[i].name;
    std::cin >> a[i].city;
    std::cin >> a[i].establishmentYear;
    std::cin >> a[i].passPercentage;
  }
  for (i=0; i<n; i++)
    for (j=i+1; j<n; j++) {
      if (strcmp (a[i].name, a[j].name) > 0) {
        t = a[i];
        a[i] = a[j];
        a[j] = t;
      }
    }
  std::cout << "\nDetails of colleges";
  for (i=0; i<n; i++) {
    std::cout << "\nCollege:" << i+1;
    std::cout << "\nName:" << a[i].name;
    std::cout << "\nCity:" << a[i].city;
    std::cout << "\nYear of establishment:" << a[i].establishmentYear;
    std::cout << "\nPass percentage:" << a[i].passPercentage;
  }
}