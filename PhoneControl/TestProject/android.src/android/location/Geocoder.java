/*   */ package android.location;
/*   */ 
/*   */ import android.content.Context;
/*   */ import java.io.IOException;
/*   */ import java.util.List;
/*   */ import java.util.Locale;
/*   */ 
/*   */ public final class Geocoder
/*   */ {
/*   */   public Geocoder(Context context, Locale locale)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public Geocoder(Context context) { throw new RuntimeException("Stub!"); } 
/* 6 */   public static boolean isPresent() { throw new RuntimeException("Stub!"); } 
/* 7 */   public List<Address> getFromLocation(double latitude, double longitude, int maxResults) throws IOException { throw new RuntimeException("Stub!"); } 
/* 8 */   public List<Address> getFromLocationName(String locationName, int maxResults) throws IOException { throw new RuntimeException("Stub!"); } 
/* 9 */   public List<Address> getFromLocationName(String locationName, int maxResults, double lowerLeftLatitude, double lowerLeftLongitude, double upperRightLatitude, double upperRightLongitude) throws IOException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.location.Geocoder
 * JD-Core Version:    0.6.2
 */