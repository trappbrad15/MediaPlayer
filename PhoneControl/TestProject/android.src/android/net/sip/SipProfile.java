/*    */ package android.net.sip;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.io.Serializable;
/*    */ import java.text.ParseException;
/*    */ 
/*    */ public class SipProfile
/*    */   implements Parcelable, Serializable, Cloneable
/*    */ {
/* 37 */   public static final Parcelable.Creator<SipProfile> CREATOR = null;
/*    */ 
/*    */   SipProfile()
/*    */   {
/* 21 */     throw new RuntimeException("Stub!"); } 
/* 22 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 23 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 24 */   public String getUriString() { throw new RuntimeException("Stub!"); } 
/* 25 */   public String getDisplayName() { throw new RuntimeException("Stub!"); } 
/* 26 */   public String getUserName() { throw new RuntimeException("Stub!"); } 
/* 27 */   public String getAuthUserName() { throw new RuntimeException("Stub!"); } 
/* 28 */   public String getPassword() { throw new RuntimeException("Stub!"); } 
/* 29 */   public String getSipDomain() { throw new RuntimeException("Stub!"); } 
/* 30 */   public int getPort() { throw new RuntimeException("Stub!"); } 
/* 31 */   public String getProtocol() { throw new RuntimeException("Stub!"); } 
/* 32 */   public String getProxyAddress() { throw new RuntimeException("Stub!"); } 
/* 33 */   public String getProfileName() { throw new RuntimeException("Stub!"); } 
/* 34 */   public boolean getSendKeepAlive() { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean getAutoRegistration() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static class Builder
/*    */   {
/*    */     public Builder(SipProfile profile)
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public Builder(String uriString) throws ParseException { throw new RuntimeException("Stub!"); } 
/*  9 */     public Builder(String username, String serverDomain) throws ParseException { throw new RuntimeException("Stub!"); } 
/* 10 */     public Builder setAuthUserName(String name) { throw new RuntimeException("Stub!"); } 
/* 11 */     public Builder setProfileName(String name) { throw new RuntimeException("Stub!"); } 
/* 12 */     public Builder setPassword(String password) { throw new RuntimeException("Stub!"); } 
/* 13 */     public Builder setPort(int port) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 14 */     public Builder setProtocol(String protocol) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 15 */     public Builder setOutboundProxy(String outboundProxy) { throw new RuntimeException("Stub!"); } 
/* 16 */     public Builder setDisplayName(String displayName) { throw new RuntimeException("Stub!"); } 
/* 17 */     public Builder setSendKeepAlive(boolean flag) { throw new RuntimeException("Stub!"); } 
/* 18 */     public Builder setAutoRegistration(boolean flag) { throw new RuntimeException("Stub!"); } 
/* 19 */     public SipProfile build() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.sip.SipProfile
 * JD-Core Version:    0.6.2
 */