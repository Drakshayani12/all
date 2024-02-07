package practice;

public class Package {
    private String packageId;
    private String packageName;
    private String packageHisory;

    public Package(String packageId,String packageName,String packageHisory)
    {
        this.packageHisory= packageHisory;
        this.packageId = packageId;
        this.packageName = packageName;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageHisory() {
        return packageHisory;
    }

    public void setPackageHisory(String packageHisory) {
        this.packageHisory = packageHisory;
    }
    
}
