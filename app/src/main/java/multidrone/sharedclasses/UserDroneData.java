package multidrone.sharedclasses;

public class UserDroneData implements java.io.Serializable {
    public float height;
    public float batteryPercent;
    public float alt;
    public float lat;
    public float lng;
    public float yaw;

    public float xNED;
    public float yNED;
    public float zNED;

    public int id;
}
