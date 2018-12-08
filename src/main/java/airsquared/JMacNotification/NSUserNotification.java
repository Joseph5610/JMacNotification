package airsquared.JMacNotification;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class NSUserNotification {

    public static native void showNotification(Pointer notification);

    public static native Pointer newNSUserNotification();

    public static native void setTitle(Pointer notification, String title);

    public static native void setSubtitle(Pointer notification, String subtitle);

    public static native void setInformativeText(Pointer notification, String informativeText);

    static {
        Native.register("JMacNotification");
    }

}
