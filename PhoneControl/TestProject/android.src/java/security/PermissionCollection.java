/*    */ package java.security;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Enumeration;
/*    */ 
/*    */ public abstract class PermissionCollection
/*    */   implements Serializable
/*    */ {
/*    */   public PermissionCollection()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract void add(Permission paramPermission);
/*    */ 
/*    */   public abstract Enumeration<Permission> elements();
/*    */ 
/*    */   public abstract boolean implies(Permission paramPermission);
/*    */ 
/*  9 */   public boolean isReadOnly() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setReadOnly() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.PermissionCollection
 * JD-Core Version:    0.6.2
 */