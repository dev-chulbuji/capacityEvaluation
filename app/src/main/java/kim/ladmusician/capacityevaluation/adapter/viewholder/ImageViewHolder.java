package kim.ladmusician.capacityevaluation.adapter.viewholder;

import android.view.View;

import butterknife.ButterKnife;
import kim.ladmusician.capacityevaluation.entity.Image;
import kim.ladmusician.capacityevaluation.interfaces.OnRecyclerItemClickListener;

/**
 * Created by ladmusician on 2017. 5. 15..
 */

public class ImageViewHolder extends BaseViewHolder<Image> {
    public ImageViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void bindView(int position, Image item, OnRecyclerItemClickListener listener) {

    }
}
