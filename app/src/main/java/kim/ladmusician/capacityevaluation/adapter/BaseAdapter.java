package kim.ladmusician.capacityevaluation.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import kim.ladmusician.capacityevaluation.adapter.model.AdapterDataModel;
import kim.ladmusician.capacityevaluation.adapter.view.AdapterDataView;
import kim.ladmusician.capacityevaluation.interfaces.OnRecyclerItemClickListener;

/**
 * Created by ladmusician on 2017. 5. 15..
 */

public abstract class BaseAdapter<H, M>
        extends RecyclerView.Adapter<H>
        implements AdapterDataModel<M>, AdapterDataView {
    @Override
    public H onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(H holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void addItem(M item) {

    }

    @Override
    public void deleteItem(int position) {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void setOnRecyclerItemClickListener(OnRecyclerItemClickListener onRecyclerItemClickListener) {

    }

    @Override
    public void clear() {

    }

    @Override
    public M getItem(int position) {
        return null;
    }

    @Override
    public void updateItem(int position, M item) {

    }

    @Override
    public void updateItems(List<M> items) {

    }

    @Override
    public void onClickedState(boolean state) {

    }

    @Override
    public void refresh() {

    }
}
