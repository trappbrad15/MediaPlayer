/*    */ package android.security;
/*    */ 
/*    */ import android.content.Context;
/*    */ import java.security.KeyStore.ProtectionParameter;
/*    */ 
/*    */ public final class KeyStoreParameter
/*    */   implements KeyStore.ProtectionParameter
/*    */ {
/*    */   KeyStoreParameter()
/*    */   {
/* 11 */     throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isEncryptionRequired() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static final class Builder
/*    */   {
/*    */     public Builder(Context context)
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public Builder setEncryptionRequired(boolean required) { throw new RuntimeException("Stub!"); } 
/*  9 */     public KeyStoreParameter build() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.security.KeyStoreParameter
 * JD-Core Version:    0.6.2
 */