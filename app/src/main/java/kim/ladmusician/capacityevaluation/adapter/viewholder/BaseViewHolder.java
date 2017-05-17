package kim.ladmusician.capacityevaluation.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import kim.ladmusician.capacityevaluation.interfaces.OnRecyclerItemClickListener;

public abstract class BaseViewHolder<M> extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }
    public abstract void bindView(
            int position, M item, OnRecyclerItemClickListener listener);
}
