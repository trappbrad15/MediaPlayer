/*   */ package android.content;
/*   */ 
/*   */ import android.accounts.Account;
/*   */ import android.os.Parcel;
/*   */ import android.os.Parcelable;
/*   */ 
/*   */ public class SyncInfo
/*   */   implements Parcelable
/*   */ {
/*   */   public final Account account;
/*   */   public final String authority;
/*   */   public final long startTime;
/*   */ 
/*   */   SyncInfo()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 7 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.SyncInfo
 * JD-Core Version:    0.6.2
 */