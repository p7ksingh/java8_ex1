package collectionlambda;

public class Product {
    private String pid;
    private String name;
    private String desc;
    public String getPid() {
        return pid;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    @Override
    public String toString() {
        return "Product [pid=" + pid + ", name=" + name + ", desc=" + desc + "]";
    }
    
}
