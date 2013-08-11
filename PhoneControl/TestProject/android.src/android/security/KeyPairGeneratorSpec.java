/*    */ package android.security;
/*    */ 
/*    */ import android.content.Context;
/*    */ import java.math.BigInteger;
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ import java.util.Date;
/*    */ import javax.security.auth.x500.X500Principal;
/*    */ 
/*    */ public final class KeyPairGeneratorSpec
/*    */   implements AlgorithmParameterSpec
/*    */ {
/*    */   KeyPairGeneratorSpec()
/*    */   {
/* 16 */     throw new RuntimeException("Stub!"); } 
/* 17 */   public String getKeystoreAlias() { throw new RuntimeException("Stub!"); } 
/* 18 */   public Context getContext() { throw new RuntimeException("Stub!"); } 
/* 19 */   public X500Principal getSubjectDN() { throw new RuntimeException("Stub!"); } 
/* 20 */   public BigInteger getSerialNumber() { throw new RuntimeException("Stub!"); } 
/* 21 */   public Date getStartDate() { throw new RuntimeException("Stub!"); } 
/* 22 */   public Date getEndDate() { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean isEncryptionRequired() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static final class Builder
/*    */   {
/*    */     public Builder(Context context)
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public Builder setAlias(String alias) { throw new RuntimeException("Stub!"); } 
/*  9 */     public Builder setSubject(X500Principal subject) { throw new RuntimeException("Stub!"); } 
/* 10 */     public Builder setSerialNumber(BigInteger serialNumber) { throw new RuntimeException("Stub!"); } 
/* 11 */     public Builder setStartDate(Date startDate) { throw new RuntimeException("Stub!"); } 
/* 12 */     public Builder setEndDate(Date endDate) { throw new RuntimeException("Stub!"); } 
/* 13 */     public Builder setEncryptionRequired() { throw new RuntimeException("Stub!"); } 
/* 14 */     public KeyPairGeneratorSpec build() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.security.KeyPairGeneratorSpec
 * JD-Core Version:    0.6.2
 */