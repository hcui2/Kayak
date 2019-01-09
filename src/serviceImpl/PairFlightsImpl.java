package serviceImpl;

import beans.Flight;
import service.PairFlights;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by pianobean on 3/13/15.
 */
public class PairFlightsImpl implements PairFlights{
    public List<List<List<Flight>>> pairOneStop(List<List<Flight>> goFlights, List<List<Flight>> comeFlights){
        List list = new ArrayList();
        Iterator it = goFlights.iterator();
        while (it.hasNext()){
            List go = (List) it.next();
            for(int i=0; i<comeFlights.size(); i++){
                List pair = new ArrayList();
                List come = comeFlights.get(i);
                pair.add(go);
                pair.add(come);
                list.add(pair);
            }
        }
        return list;
    }

    public List<List<Flight>> pairNonStop(List<Flight> goFlights, List<Flight> comeFlights){
        List list = new ArrayList();
        Iterator it = goFlights.iterator();
        while (it.hasNext()){
            Flight go = (Flight) it.next();
            for(int i=0; i<comeFlights.size(); i++){
                List pair = new ArrayList();
                Flight come = comeFlights.get(i);
                pair.add(go);
                pair.add(come);
                list.add(pair);
            }
        }
        return list;
    }
}
