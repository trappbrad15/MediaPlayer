/*    */ package android.net.wifi;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.security.PrivateKey;
/*    */ import java.security.cert.X509Certificate;
/*    */ 
/*    */ public class WifiEnterpriseConfig
/*    */   implements Parcelable
/*    */ {
/* 45 */   public static final Parcelable.Creator<WifiEnterpriseConfig> CREATOR = null;
/*    */ 
/*    */   public WifiEnterpriseConfig()
/*    */   {
/* 23 */     throw new RuntimeException("Stub!"); } 
/* 24 */   public WifiEnterpriseConfig(WifiEnterpriseConfig source) { throw new RuntimeException("Stub!"); } 
/* 25 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setEapMethod(int eapMethod) { throw new RuntimeException("Stub!"); } 
/* 28 */   public int getEapMethod() { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setPhase2Method(int phase2Method) { throw new RuntimeException("Stub!"); } 
/* 30 */   public int getPhase2Method() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setIdentity(String identity) { throw new RuntimeException("Stub!"); } 
/* 32 */   public String getIdentity() { throw new RuntimeException("Stub!"); } 
/* 33 */   public void setAnonymousIdentity(String anonymousIdentity) { throw new RuntimeException("Stub!"); } 
/* 34 */   public String getAnonymousIdentity() { throw new RuntimeException("Stub!"); } 
/* 35 */   public void setPassword(String password) { throw new RuntimeException("Stub!"); } 
/* 36 */   public String getPassword() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void setCaCertificate(X509Certificate cert) { throw new RuntimeException("Stub!"); } 
/* 38 */   public X509Certificate getCaCertificate() { throw new RuntimeException("Stub!"); } 
/* 39 */   public void setClientKeyEntry(PrivateKey privateKey, X509Certificate clientCertificate) { throw new RuntimeException("Stub!"); } 
/* 40 */   public X509Certificate getClientCertificate() { throw new RuntimeException("Stub!"); } 
/* 41 */   public void setSubjectMatch(String subjectMatch) { throw new RuntimeException("Stub!"); } 
/* 42 */   public String getSubjectMatch() { throw new RuntimeException("Stub!"); } 
/* 43 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static final class Phase2
/*    */   {
/*    */     public static final int NONE = 0;
/*    */     public static final int PAP = 1;
/*    */     public static final int MSCHAP = 2;
/*    */     public static final int MSCHAPV2 = 3;
/*    */     public static final int GTC = 4;
/*    */ 
/*    */     Phase2()
/*    */     {
/* 16 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static final class Eap
/*    */   {
/*    */     public static final int NONE = -1;
/*    */     public static final int PEAP = 0;
/*    */     public static final int TLS = 1;
/*    */     public static final int TTLS = 2;
/*    */     public static final int PWD = 3;
/*    */ 
/*    */     Eap()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.wifi.WifiEnterpriseConfig
 * JD-Core Version:    0.6.2
 */