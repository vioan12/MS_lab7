import java.util.ArrayList;
import java.util.List;

/**
 * Created by ioan on 12/2/17.
 */
public class WorkeriMutex extends PetriNet
{
    private int k;
    WorkeriMutex(int valueofk)
    {
        Tranzitie tranzitia1,tranzitia2,tranzitia3,tranzitia4;
        Arc arcul1,arcul2,arcul3,arcul4,arcul5,arcul6,arcul7,arcul8;
        Locatie locatia1,locatia2,locatia3;

        this.k=valueofk;
        List<Arc> templistaarce;
        Tranzitii = new ArrayList<Tranzitie>();

        locatia1 =  new Locatie("Workeri",k);
        arcul8 = new Arc(locatia1,1,"in");
        arcul4 = new Arc(locatia1,k,"in");
        arcul5 = new Arc(locatia1,1,"out");
        arcul1 = new Arc(locatia1,k,"out");

        locatia2 =  new Locatie("Writing",0);
        arcul2 = new Arc(locatia2,1,"in");
        arcul3 = new Arc(locatia2,1,"out");

        locatia3 =  new Locatie("Reading",0);
        arcul6 = new Arc(locatia3,1,"in");
        arcul7 = new Arc(locatia3,1,"out");

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul1);
        templistaarce.add(arcul2);
        tranzitia1 = new Tranzitie("SW",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul3);
        templistaarce.add(arcul4);
        tranzitia2 = new Tranzitie("EW",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul5);
        templistaarce.add(arcul6);
        tranzitia3 = new Tranzitie("SR",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul7);
        templistaarce.add(arcul8);
        tranzitia4 = new Tranzitie("ER",templistaarce);

        Tranzitii.add(tranzitia1);
        Tranzitii.add(tranzitia2);
        Tranzitii.add(tranzitia3);
        Tranzitii.add(tranzitia4);
    }

    protected void afisare_taglocatiejeton()
    {
        List<Locatie> listalocatii;
        listalocatii=starejetoatelocatii();
        for(int i=0;i<listalocatii.size();i++){
            System.out.println(listalocatii.get(i).Get_tag()+": "+listalocatii.get(i).Get_jetoane());
        }
    }
}
