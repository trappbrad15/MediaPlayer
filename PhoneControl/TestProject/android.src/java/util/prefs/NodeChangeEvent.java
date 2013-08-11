/*   */ package java.util.prefs;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ import java.util.EventObject;
/*   */ 
/*   */ public class NodeChangeEvent extends EventObject
/*   */   implements Serializable
/*   */ {
/*   */   public NodeChangeEvent(Preferences p, Preferences c)
/*   */   {
/* 6 */     super((Object)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public Preferences getParent() { throw new RuntimeException("Stub!"); } 
/* 8 */   public Preferences getChild() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.prefs.NodeChangeEvent
 * JD-Core Version:    0.6.2
 */