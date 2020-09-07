// #ifndef __unix__
// #define sleep(a) _sleep(a*1000)
// #endif
#include <chrono>
#include <thread>

#include "Header.h"

double ZahlenEingabe();
void Bewertung(double);

int main()
{
    tFaehre Faehre;
    int Sekunden = 0;
    double Schub=0.0;
    while (Faehre.getHoehe()>0) {
        Sekunden++;
        Faehre.bremse(Schub);
        Faehre.zeigeStatus(Sekunden);
        if (Faehre.getHoehe()<=0.0) {
            Bewertung(Faehre.getGeschw());
        } else if (Faehre.istTankVoll()) {
            cout << "Wieviel Schub (0-100): " << endl;
            Schub = ZahlenEingabe();
        } else {
            std::this_thread::sleep_for(std::chrono::seconds(1));
            //Sleep(1); // Falle in Echtzeit
        }
    }
    return -1;
}

double ZahlenEingabe()
{
    string str;
    getline(cin, str);
    istringstream inStream(str);
    double out;
    inStream >> out;
    return out;
}

void Bewertung(double Geschw)
{
    if (Geschw<5.0) {
        cout << "Sehr gelungene Landung!";
    } else if (Geschw<10.0) {
        cout << "Sauber gelandet!";
    } else if (Geschw<20.0) {
        cout << "Verletzt gelandet!";
    } else {
        cout << "Ein Krater wird Ihren Namen tragen!";
    }
    cout << endl;
}

