/*   */ package android.hardware.location;
/*   */ 
/*   */ import android.location.Location;
/*   */ 
/*   */ public abstract class GeofenceHardwareCallback
/*   */ {
/*   */   public GeofenceHardwareCallback()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public void onGeofenceTransition(int geofenceId, int transition, Location location, long timestamp, int monitoringType) { throw new RuntimeException("Stub!"); } 
/* 6 */   public void onGeofenceAdd(int geofenceId, int status) { throw new RuntimeException("Stub!"); } 
/* 7 */   public void onGeofenceRemove(int geofenceId, int status) { throw new RuntimeException("Stub!"); } 
/* 8 */   public void onGeofencePause(int geofenceId, int status) { throw new RuntimeException("Stub!"); } 
/* 9 */   public void onGeofenceResume(int geofenceId, int status) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.hardware.location.GeofenceHardwareCallback
 * JD-Core Version:    0.6.2
 */