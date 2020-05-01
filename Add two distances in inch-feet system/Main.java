#include<iostream>
using namespace std;
struct len {int f; float i; };
int main()
{
  //Type your code here.
  len a, b, s;
  std::cin >> a.f;
  std::cin >> a.i;
  std::cin >> b.f;
  std::cin >> b.i;
  s.f = a.f + b.f;
  s.i = a.i + b.i;
  if (s.i >= 12) {
    s.f++;
    s.i -= 12;
  }
  std::cout << s.f << "'-" << s.i << "\"";
}