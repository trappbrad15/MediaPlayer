/*    */ package android.hardware.location;
/*    */ 
/*    */ public final class GeofenceHardware
/*    */ {
/*    */   public static final int MONITORING_TYPE_GPS_HARDWARE = 0;
/*    */   public static final int MONITOR_CURRENTLY_AVAILABLE = 0;
/*    */   public static final int MONITOR_CURRENTLY_UNAVAILABLE = 1;
/*    */   public static final int MONITOR_UNSUPPORTED = 2;
/*    */   public static final int GEOFENCE_ENTERED = 1;
/*    */   public static final int GEOFENCE_EXITED = 2;
/*    */   public static final int GEOFENCE_UNCERTAIN = 4;
/*    */   public static final int GEOFENCE_SUCCESS = 0;
/*    */   public static final int GEOFENCE_ERROR_TOO_MANY_GEOFENCES = 1;
/*    */   public static final int GEOFENCE_ERROR_ID_EXISTS = 2;
/*    */   public static final int GEOFENCE_ERROR_ID_UNKNOWN = 3;
/*    */   public static final int GEOFENCE_ERROR_INVALID_TRANSITION = 4;
/*    */   public static final int GEOFENCE_FAILURE = 5;
/*    */ 
/*    */   GeofenceHardware()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public int[] getMonitoringTypes() { throw new RuntimeException("Stub!"); } 
/*  6 */   public int getStatusOfMonitoringType(int monitoringType) { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean addGeofence(int geofenceId, int monitoringType, GeofenceHardwareRequest geofenceRequest, GeofenceHardwareCallback callback) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean removeGeofence(int geofenceId, int monitoringType) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean pauseGeofence(int geofenceId, int monitoringType) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean resumeGeofence(int geofenceId, int monitoringType, int monitorTransition) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean registerForMonitorStateChangeCallback(int monitoringType, GeofenceHardwareMonitorCallback callback) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean unregisterForMonitorStateChangeCallback(int monitoringType, GeofenceHardwareMonitorCallback callback) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.hardware.location.GeofenceHardware
 * JD-Core Version:    0.6.2
 */