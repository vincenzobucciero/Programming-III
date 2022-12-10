
//Classificare i terremoti in base alla scossa in magnitudo
public class EarthQuake {
    private double richter;
    public EarthQuake (double magnitude) {
        richter = magnitude;
    }
    public String getEarthQuake () {
        String r;
        if (richter >= 8.0)
            r = "Gran parte delle strutture crollate";
        else if (richter >= 7.0)
            r = "Molti edifici distrutti";
        else if (richter >= 6.0)
            r = "Molti edifici con danni considerevoli, alcuni collassati";
        else if (richter >= 4.5)
            r = "Danni a edifici mal costruiti";
        else if (richter >= 3.5)
            r = "Avvertito da molte persone, ma senza distruzioni";
        else if (richter >= 0)
            r = "In genere non avvertito dalle persone";
        else
            r = "I numeri negativi non sono ammessi";
        return r;
    }
}
