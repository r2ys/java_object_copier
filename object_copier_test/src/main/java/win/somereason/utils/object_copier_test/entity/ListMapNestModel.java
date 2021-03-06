package win.somereason.utils.object_copier_test.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

/**
 * on 2017/4/20.
 */
@Setter
@Getter
public class ListMapNestModel {
    protected Integer int1;
    protected int int2;
    protected String string1;
    protected LocalDateTime time1;
    protected SimpleModel test2;
    protected List<Integer> arr1;
    protected HashMap<Integer,String> map1;
}
