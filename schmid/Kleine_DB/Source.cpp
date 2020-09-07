#include<iostream>
#include <string.h>

using namespace std;

struct adresse {
    string vorname;
    string nachname;
    int gbj;
    int plz;
};

int main() {
    //Dek
    char jn;
    int i = 0;
    //-------------

    string vname[] = {
        "Tim",
        "Tom",
        "Jan",
        "Tom"
    };
    string * pvname = vname;
    string nname[] = {
        "Schulz",
        "Meyer",
        "Bond",
        "Evil"
    };
    string * pnname = nname;
    int gjahr[] = {
        91,
        92,
        93,
        94
    };
    int * pgjahr = gjahr;
    int postlz[] = {
        68123,
        68456,
        68789,
        68567
    };
    int * ppostlz = postlz;

    struct adresse leute[20];
    struct adresse * pleute = NULL;
    struct adresse * ppleute = NULL;
    pleute = & leute[0];

    do {
        if (i < 4) //....DS vom Array
        {
            cout << "Vorname: ---\t";
            pleute -> vorname = * pvname;

            cout << "Nachname ---:\t";
            pleute -> nachname = * pnname;

            cout << "Gebjahr: ---\t";
            pleute -> gbj = * pgjahr;

            cout << "PLZ: ---\t\t";
            pleute -> plz = * ppostlz;

            pvname++;
            pnname++;
            pgjahr++;
            ppostlz++;
        } else //...DS per Hand
        {
            cout << "Vorname:\t";
            cin >> pleute -> vorname;

            cout << "Nachname:\t";
            cin >> pleute -> nachname;

            cout << "Gebjahr:\t";
            cin >> pleute -> gbj;

            cout << "PLZ:\t\t";
            cin >> pleute -> plz;
        }
        pleute++;
        i++;

        cout << "Nochmal <j/n>: ";
        cin >> jn;
    } while (jn != 'n' && jn != 'N');
    //wir speichern die Endadresse des Pointers!!!
    ppleute = pleute;
    cout << "pointer 1" << pleute << endl;
    cout << "pointer 2" << ppleute << endl;

    //Kontrollausgabe aber Datensatz untereinander!!!

    cout << "\n\nKontrollausgabe\n";
    pleute = & leute[0];
    cout << "pointer 1" << pleute << endl;
    while (pleute < ppleute) {
        cout << pleute -> vorname << "\t";
        pleute++;
    }
    cout << endl;
    pleute = & leute[0];
    while (pleute < ppleute) {
        cout << pleute -> nachname << "\t";
        pleute++;
    }
    cout << endl;
    pleute = & leute[0];
    while (pleute < ppleute) {
        cout << pleute -> gbj << "\t";
        pleute++;
    }
    cout << endl;
    pleute = & leute[0];
    while (pleute < ppleute) {
        cout << pleute -> plz << "\t";
        pleute++;
    }

    //----Suchfunktion------------------------
    struct adresse * suchBuffer[20] = {};
    
    int suchCounter = 0;
    char vngp;
    string suchbegriff;
    int suchzahl;
    cout << "Suchkriterien <v/n/g/p>: ";
    cin >> vngp;
    struct adresse * pflag = NULL;
    pleute = & leute[0];
    switch (vngp) {
    case 'v':
        cout << "Vorname: ";
        cin >> suchbegriff;
        while (pleute < ppleute) {
            if (suchbegriff == pleute -> vorname) {
                suchBuffer[suchCounter] = pleute;
                suchCounter++;
                pflag = pleute;
            } //Ausgabe des ganzen DS
            pleute++;
        }
        break;
    case 'n':
        cout << "Nachname: ";
        cin >> suchbegriff;
        while (pleute < ppleute) {
            if (suchbegriff == pleute -> nachname) {
                suchBuffer[suchCounter] = pleute;
                suchCounter++;
                pflag = pleute;
            } //Ausgabe des ganzen DS
            pleute++;
        }
        break;
    case 'g':
        cout << "Geburtsjahr: ";
        cin >> suchzahl;
        while (pleute < ppleute) {
            if (suchzahl == pleute -> gbj) {
                suchBuffer[suchCounter] = pleute;
                suchCounter++;
                pflag = pleute;
            } //Ausgabe des ganzen DS
            pleute++;
        }
        break;
    case 'p':
        cout << "PLZ: ";
        cin >> suchzahl;
        while (pleute < ppleute) {
            if (suchzahl == pleute -> plz) {
                suchBuffer[suchCounter] = pleute;
                suchCounter++;
                pflag = pleute;
            } //Ausgabe des ganzen DS
            pleute++;
        }
        break;
    default:
        break;
    }

    //--------Ausgabe
    if (pflag != NULL) {
        while (true)
        {
            cout << "Vorname:: " << suchBuffer[suchCounter -1] -> vorname << ",";
            cout << "Nachname:: " << suchBuffer[suchCounter -1] -> nachname << ",";
            cout << "GeburtsTag:: " << suchBuffer[suchCounter -1] -> gbj << ",";
            cout << "PLZ:: " << suchBuffer[suchCounter -1] -> plz << endl << endl;

            suchCounter--;
            if (suchCounter <= 0)
            {
                break;
            }
            
        }

    } else {
        cout << "Keine Uebereinstimmung vorhanden....\n";

    }

    return -1;
}