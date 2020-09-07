#include <iostream>
#include <sstream>

using namespace std;

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