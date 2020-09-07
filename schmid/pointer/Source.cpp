#include <iostream>
using namespace std;

void up1(int*);
void up2(int*);
void up3(int*,int);

int main(){

    int xy = 5;
    int* pxy = &xy;

    cout << xy << endl;
    cout << &xy << endl; // Speicherstalle

    cout << "Pointer oder Zeiger \n";

    cout << *pxy << endl; // Der Ihnhalt des Pointers ist immer die adresse der Variable,auf die er zeigt!
    cout << pxy << endl; //  Der Pointer ansicht greift auf den Ihnhalt der variable zu auf die er zeigt!
    cout << "\nHallo Welt \n\n";

    *pxy = 7;
    cout << xy << endl;

    up1(&xy);

    cout << "Nach UP1: " << xy << endl;

    //Pinter auf array 

    int ba[] = {1,55,3,17,111,33,44};
    int balen = sizeof(ba)/sizeof(ba[0]);
    // int* pba = &ba[0]; Complett Useless

    up2(ba); // Der Name Eines Array ist immer der Zeiger auf die erste addresse

    up3(&ba[6],balen);
    return -1;
}

// Pointer auf Funktionen
// Habe ich in einer Funktion  einen Pointer auf eine Variable Kann ich Direkt darauf zugreifen/manipulieren
// Beachte, die Übliche Schnittstelle,verlieren ihre Bedeutung

void up1(int* p1){

*p1 = 1007;

}

void up2(int* p1){
    cout << endl << "UP2" << endl;
    cout << *p1 << "---" << p1 << endl;
    *p1++;
    cout << *p1 << "---" << p1 << endl;
    *p1++;
    cout << *p1 << "---" << p1 << endl;
    *p1++;
    cout << *p1 << "---" << p1 << endl;

}

void up3(int* p1,int len){

    cout << "---------------------------\n";
    cout << "            Up3            \n";
    cout << "---------------------------\n";

    for (int i = 0; i < len; i++)
    {
        cout << *p1 << endl;
        p1--;
    }
    

}