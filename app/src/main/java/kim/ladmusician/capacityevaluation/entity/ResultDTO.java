package kim.ladmusician.capacityevaluation.entity;

import java.util.List;

/**
 * Created by ladmusician on 2017. 5. 17..
 */

public class ResultDTO<T> {
    private List<T> items;
    private int start;
    private int display;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
        this.display = display;
    }
}
