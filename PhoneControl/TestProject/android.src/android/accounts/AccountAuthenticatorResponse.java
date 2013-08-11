/*    */ package android.accounts;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class AccountAuthenticatorResponse
/*    */   implements Parcelable
/*    */ {
/* 12 */   public static final Parcelable.Creator<AccountAuthenticatorResponse> CREATOR = null;
/*    */ 
/*    */   public AccountAuthenticatorResponse(Parcel parcel)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void onResult(Bundle result) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void onRequestContinued() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void onError(int errorCode, String errorMessage) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.accounts.AccountAuthenticatorResponse
 * JD-Core Version:    0.6.2
 */