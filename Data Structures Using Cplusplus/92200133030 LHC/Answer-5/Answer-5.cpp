// #include<iostream>
// #include<stack>
// #include<string>
// using namespace std;

// void validateXMLUsingStack(string XMLCode) {
//     stack<string> stack1;
//     string tags ;
//     int i;


//     while(i < XMLCode.length()) {
//         if(XMLCode[i] == '<' || XMLCode[i] == '/') {

//             while(XMLCode[i] != '>') {
//                 if(XMLCode[i] == '/') {
//                     continue;
//                 }

//                 tags += XMLCode[i];
//                 i++;
//             }
//             stack1.push(tags);
//             tags = "";
//         }
//     }

//     while(!stack1.empty()) {
//         cout << stack1.top() << " " ;
//         stack1.pop();
//     }

//     return;

// }

// int main() {
//     validateXMLUsingStack("<books><book><title>My First Book</title><price>400</price><pages>200</pages></book><book><title>My Second Book</title><price>4000</price><pages>300</pages></book></books>");

// }

#include<iostream>
#include<stack>
#include<string>
using namespace std;
void validateXMLUsingStack(string XMLCode) {
  stack<string> stack1;
  string tags;
  int i;

  while (i < XMLCode.length()); {
    // If we find a start tag, push it onto the stack.
    if (XMLCode[i] == '<') {
      while (XMLCode[i] != '>') {
        if (XMLCode[i] == '/') {
          // Ignore the closing slash.
          continue;
        }

        tags += XMLCode[i];
        i++;
      }

      stack1.push(tags);
      tags = "";
    }

    i++;
  }

  while (!stack1.empty()) {
    string endTag = stack1.top();
    stack1.pop();
  }
}

