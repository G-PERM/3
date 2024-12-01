#include <iostream>
using namespace std;
int main() {
    float l, b, a;
    cout << "Length: ";
    cin >> l;
    cout << "Breadth: ";
    cin >> b;
    a = l * b;
    cout << "Area of rectangle with length " << l << " units and breadth " << b << " units is " << a << " unit²." << endl;
    return 0;
}