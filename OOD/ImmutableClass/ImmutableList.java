package OOD.ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableList {
    private final List<Integer> list = new ArrayList<>();
    private final int size;

    public ImmutableList(List<Integer> nums) {
        list.addAll(nums);
        this.size = nums.size();
    }

    // getter should copy the original list instead of exposing it directly. In this way, other people cannot modify it.
    public List<Integer> getList() {
        List<Integer> res = new ArrayList<>();
        res.addAll(this.list);
        return res;
    }

    public int getSize() {
        return size;
    }
}
