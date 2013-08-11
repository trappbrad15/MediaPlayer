/*   */ package java.util.prefs;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ import java.util.EventObject;
/*   */ 
/*   */ public class PreferenceChangeEvent extends EventObject
/*   */   implements Serializable
/*   */ {
/*   */   public PreferenceChangeEvent(Preferences p, String k, String v)
/*   */   {
/* 6 */     super((Object)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public String getKey() { throw new RuntimeException("Stub!"); } 
/* 8 */   public String getNewValue() { throw new RuntimeException("Stub!"); } 
/* 9 */   public Preferences getNode() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.prefs.PreferenceChangeEvent
 * JD-Core Version:    0.6.2
 */