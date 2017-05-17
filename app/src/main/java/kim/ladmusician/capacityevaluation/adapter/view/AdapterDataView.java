package kim.ladmusician.capacityevaluation.adapter.view;

import kim.ladmusician.capacityevaluation.interfaces.OnRecyclerItemClickListener;

/**
 * Created by ladmusician on 2017. 5. 17..
 */

public interface AdapterDataView {
    void refresh();
    void setItemClickListener(OnRecyclerItemClickListener listener);
}
