package nl.blue4it.stolwijk.sandbox.cucumber5.model;

public class Version {

    private final int major;
    private final int minor;
    private final int patch;

    Version() {
        this.major = 0;
        this.minor = 0;
        this.patch = 0;
    }

    public Version(String version) {
        String[] parts = version.split("\\.");
        this.major = Integer.parseInt(parts[0]);
        this.minor = Integer.parseInt(parts[1]);
        this.patch = Integer.parseInt(parts[2]);
    }
}
