package oom.heapSpace;

import java.util.ArrayList;
import java.util.List;

/**
 * -verbose:gc
 * -Xms20m
 * -Xmx20m
 * -Xmn10m
 * -XX:+PrintGCDetails
 * -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
    static class OOMObject{

    }
    public static void main(String [] args){
        List<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
