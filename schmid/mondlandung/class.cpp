#include "Header.h"

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