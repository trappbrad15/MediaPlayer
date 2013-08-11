/*    */ package java.security;
/*    */ 
/*    */ import java.io.ObjectStreamException;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class KeyRep
/*    */   implements Serializable
/*    */ {
/*    */   public KeyRep(Type type, String algorithm, String format, byte[] encoded)
/*    */   {
/* 11 */     throw new RuntimeException("Stub!"); } 
/* 12 */   protected Object readResolve() throws ObjectStreamException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static enum Type
/*    */   {
/*  7 */     PRIVATE, 
/*  8 */     PUBLIC, 
/*  9 */     SECRET;
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.KeyRep
 * JD-Core Version:    0.6.2
 */