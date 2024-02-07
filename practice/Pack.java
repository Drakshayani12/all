package practice;

import java.util.HashMap;
import java.util.*;

public class Pack {
    HashMap<String,Package> packageMap;

    Pack() {
        packageMap = new HashMap<>();
    }

    public void addItem(Package p){
        packageMap.put(p.getPackageId(), p);
    }
    public Package getValue(String PackageId) {
        if(packageMap.containsKey(PackageId))
        {
            return packageMap.get(PackageId);
        }
        else {
            return null;
        }
    }

    public Package removeItem(String PackageId)
    {
        if(packageMap.containsKey(PackageId))
        {
            return packageMap.remove(PackageId);
        }
        else{
            return null;
        }
    }
}
