#include <iostream>
#include <sstream>
#include <thread>
using namespace std;

#ifndef __unix__
#define sleep(a) _sleep(a*1000)
#endif

const double MondBeschleunigung=1.635;

class tFaehre {
public:
    tFaehre();
    void bremse(double Schub);
    void zeigeStatus(int Sekunden);
    bool istTankVoll() { return Tank>0; }
    double getHoehe() { return Hoehe; }
    double getGeschw() { return Geschw; }
private:
    double calcHoehe(double Beschleunigung, double altGeschw,
                     double sekunden, double altHoehe);
    double calcGeschwindigkeit(double Beschleunigung,
                     double sekunden, double altGeschw);
    double Hoehe;
    double Geschw;
    double Beschleunigung;
    double Tank;
};

tFaehre::tFaehre()
{
    Hoehe=4000.0;
    Geschw=0.0;
    Beschleunigung=MondBeschleunigung;
    Tank=5000;
}

double tFaehre::calcHoehe(double Beschleunigung,
                          double altGeschw, 
                          double sekunden, double altHoehe)
{
    return -0.5*Beschleunigung*sekunden*sekunden
           +altHoehe+altGeschw*sekunden;
}

double tFaehre::calcGeschwindigkeit(double Beschleunigung,
                                    double sekunden,
                                    double altGeschw)
{
    return -Beschleunigung*sekunden+altGeschw;
}

void tFaehre::bremse(double Schub)
{
    if (Schub<0.0) Schub=0.0;
    if (Schub>100.0) Schub=100.0;
    Beschleunigung = MondBeschleunigung - Schub*0.04;
    if (Schub<=Tank) {
        Tank -= Schub;
    } else {
        Schub = Tank;
        Tank = 0;
    }
    Hoehe =calcHoehe(Beschleunigung, Geschw, 1.0, Hoehe);
    Geschw=calcGeschwindigkeit(Beschleunigung, 1.0, Geschw);
}

void tFaehre::zeigeStatus(int Sekunden)
{
    cout << "Zeit: "
         << Sekunden
         << " Hoehe: " << Hoehe
         << " Geschwindigkeit: "
         << -Geschw
         << " Treibstoff: "
         << Tank
         << endl;
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
            std::this_thread::sleep_for(1);
            //sleep(1); // Falle in Echtzeit
        }
    }
    return -1;
}

