package cn.coolcc.designPatterns.singleton;

public enum EnumSingle {
    INSTANCE;

    private Resource resource;

    EnumSingle() {
        resource = new Resource();
    }

    public Resource getInstance() {
        return resource;
    }

}
