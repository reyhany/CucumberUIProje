package Utilities;

public enum Environments {
    PRODUCTION("production"),
    STAGE("stage");

    public final String name;

    Environments(String name) {
        this.name = name;
    }
}
