#include <iostream>

using namespace std;

int fibonacciCalc(int n);

int main()
{
    int t = 1;
    cout << "Welcome to the Fibonacci Calculator!\n";
    do
    {
        int answer;
        int n;
        cout << "Please enter which number of the sequence you want to know: ";
        cin >> n;
        if(n <= 0)
        {
            cout << "Please enter positive integers only. Try again.\n\n";
            continue;
        }
        else
        {
            answer = fibonacciCalc(n);
            cout << answer << endl << endl;
        }

    } while(t == 1);
    return 0;

}

int fibonacciCalc(int n)
{
    if(n <= 2)
    {
        return 1;
    }
    else
    {
        return(fibonacciCalc(n-2) + fibonacciCalc(n-1));
    }
}

