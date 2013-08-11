/*    */ package android.nfc;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class NdefMessage
/*    */   implements Parcelable
/*    */ {
/* 17 */   public static final Parcelable.Creator<NdefMessage> CREATOR = null;
/*    */ 
/*    */   public NdefMessage(byte[] data)
/*    */     throws FormatException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public NdefMessage(NdefRecord record, NdefRecord[] records) { throw new RuntimeException("Stub!"); } 
/*  7 */   public NdefMessage(NdefRecord[] records) { throw new RuntimeException("Stub!"); } 
/*  8 */   public NdefRecord[] getRecords() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getByteArrayLength() { throw new RuntimeException("Stub!"); } 
/* 10 */   public byte[] toByteArray() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 15 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.nfc.NdefMessage
 * JD-Core Version:    0.6.2
 */