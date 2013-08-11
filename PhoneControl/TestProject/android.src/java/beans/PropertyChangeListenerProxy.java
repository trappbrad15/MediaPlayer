/*   */ package java.beans;
/*   */ 
/*   */ import java.util.EventListener;
/*   */ import java.util.EventListenerProxy;
/*   */ 
/*   */ public class PropertyChangeListenerProxy extends EventListenerProxy
/*   */   implements PropertyChangeListener
/*   */ {
/*   */   public PropertyChangeListenerProxy(String propertyName, PropertyChangeListener listener)
/*   */   {
/* 6 */     super((EventListener)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public String getPropertyName() { throw new RuntimeException("Stub!"); } 
/* 8 */   public void propertyChange(PropertyChangeEvent event) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.beans.PropertyChangeListenerProxy
 * JD-Core Version:    0.6.2
 */