package kim.ladmusician.capacityevaluation.adapter.viewholder;

import android.content.Context;
import android.view.View;

import kim.ladmusician.capacityevaluation.entity.Image;
import kim.ladmusician.capacityevaluation.interfaces.OnRecyclerItemClickListener;

/**
 * Created by ladmusician on 2017. 5. 15..
 */

public class ImageViewHolder extends BaseViewHolder<Image> {
    public ImageViewHolder(View itemView, Context ctx) {
        super(itemView, ctx);
    }

    @Override
    public void bindView(int position, Image item, OnRecyclerItemClickListener listener) {

    }
}
