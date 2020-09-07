#include <iostream>
using namespace std;



int main(){

    //DeklarationsTeil

    struct adressliste
    {
        char nachname[30];
        char vorname[30];
        char strasse[30];
        char hnr[5];
        char plz[10];
        char ort[30];

    };
    
    int aa;

    //----------------------------------------

    cout << "Anzahl der Adressen:"; cin >> aa;

    

    struct adressliste person[10];

    //----------Einlesen------------------

    for (int i = 0; i < aa ; i++)
    {
        
        cin.ignore();

        cout << "\nNAchname:   \t";cin.getline(person[i].nachname,29);
        cout << "Vorchname:   \t";cin.getline(person[i].vorname,29);
        cout << "Strasse:   \t";cin.getline(person[i].strasse,29);

        cout << "Hausnummer:   \t";cin >> person[i].hnr;
        cout << "\nPLZ:     \t";cin >> person[i].plz;
        
        
    }
    
    //----------Ausgabe------------------

    cout << "\n\nTest Ausgabe\n";
    
        for (int i = 0; i < aa ; i++)
    {
        cout << "\nNAchname:   \t" << person[i].nachname;
        cout << "\nVorchname:   \t" << person[i].vorname;
        cout << "\nStrasse:   \t" << person[i].strasse;

        cout << "\nHausnummer:   \t" << person[i].hnr;
        cout << "\nPLZ:     \t" << person[i].plz;
        
        
    }


    return -1;
}
