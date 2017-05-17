package kim.ladmusician.capacityevaluation.adapter.model;

/**
 * Created by ladmusician on 2017. 5. 17..
 */

public interface AdapterDataModel<M> {
    void add(M item);
    void remove(int position);
}
