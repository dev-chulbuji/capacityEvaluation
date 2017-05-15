package kim.ladmusician.capacityevaluation.adapter.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;
import kim.ladmusician.capacityevaluation.interfaces.OnRecyclerItemClickListener;

/**
 * Created by ladmusician on 2017. 5. 15..
 */

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {
    private final Context mContext;

    public BaseViewHolder(View itemView, Context ctx) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        mContext = ctx;
    }

    protected abstract void bindView(
            int position, T item, OnRecyclerItemClickListener listener);
}
