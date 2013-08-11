/*    */ package android.nfc;
/*    */ 
/*    */ import android.net.Uri;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class NdefRecord
/*    */   implements Parcelable
/*    */ {
/*    */   public static final short TNF_EMPTY = 0;
/*    */   public static final short TNF_WELL_KNOWN = 1;
/*    */   public static final short TNF_MIME_MEDIA = 2;
/*    */   public static final short TNF_ABSOLUTE_URI = 3;
/*    */   public static final short TNF_EXTERNAL_TYPE = 4;
/*    */   public static final short TNF_UNKNOWN = 5;
/*    */   public static final short TNF_UNCHANGED = 6;
/* 33 */   public static final byte[] RTD_TEXT = null;
/* 34 */   public static final byte[] RTD_URI = null;
/* 35 */   public static final byte[] RTD_SMART_POSTER = null;
/* 36 */   public static final byte[] RTD_ALTERNATIVE_CARRIER = null;
/* 37 */   public static final byte[] RTD_HANDOVER_CARRIER = null;
/* 38 */   public static final byte[] RTD_HANDOVER_REQUEST = null;
/* 39 */   public static final byte[] RTD_HANDOVER_SELECT = null;
/*    */ 
/* 41 */   public static final Parcelable.Creator<NdefRecord> CREATOR = null;
/*    */ 
/*    */   public NdefRecord(short tnf, byte[] type, byte[] id, byte[] payload)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  7 */   @Deprecated
/*    */   public NdefRecord(byte[] data) throws FormatException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static NdefRecord createApplicationRecord(String packageName) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static NdefRecord createUri(Uri uri) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static NdefRecord createUri(String uriString) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static NdefRecord createMime(String mimeType, byte[] mimeData) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static NdefRecord createExternal(String domain, String type, byte[] data) { throw new RuntimeException("Stub!"); } 
/* 13 */   public short getTnf() { throw new RuntimeException("Stub!"); } 
/* 14 */   public byte[] getType() { throw new RuntimeException("Stub!"); } 
/* 15 */   public byte[] getId() { throw new RuntimeException("Stub!"); } 
/* 16 */   public byte[] getPayload() { throw new RuntimeException("Stub!"); } 
/* 18 */   @Deprecated
/*    */   public byte[] toByteArray() { throw new RuntimeException("Stub!"); } 
/* 19 */   public String toMimeType() { throw new RuntimeException("Stub!"); } 
/* 20 */   public Uri toUri() { throw new RuntimeException("Stub!"); } 
/* 21 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 23 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 25 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.nfc.NdefRecord
 * JD-Core Version:    0.6.2
 */