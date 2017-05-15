package kim.ladmusician.capacityevaluation.adapter.view;

import kim.ladmusician.capacityevaluation.interfaces.OnRecyclerItemClickListener;

/**
 * Created by ladmusician on 4/5/16.
 */
public interface AdapterDataView {
    void refresh();
    void setOnRecyclerItemClickListener(OnRecyclerItemClickListener onRecyclerItemClickListener);
}