/*    */ package android.content;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class RestrictionEntry
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int TYPE_NULL = 0;
/*    */   public static final int TYPE_BOOLEAN = 1;
/*    */   public static final int TYPE_CHOICE = 2;
/*    */   public static final int TYPE_MULTI_SELECT = 4;
/* 38 */   public static final Parcelable.Creator<RestrictionEntry> CREATOR = null;
/*    */ 
/*    */   public RestrictionEntry(String key, String selectedString)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public RestrictionEntry(String key, boolean selectedState) { throw new RuntimeException("Stub!"); } 
/*  7 */   public RestrictionEntry(String key, String[] selectedStrings) { throw new RuntimeException("Stub!"); } 
/*  8 */   public RestrictionEntry(Parcel in) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setType(int type) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getType() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getSelectedString() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String[] getAllSelectedStrings() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean getSelectedState() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setSelectedString(String selectedString) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setSelectedState(boolean state) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setAllSelectedStrings(String[] allSelectedStrings) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setChoiceValues(String[] choiceValues) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setChoiceValues(Context context, int stringArrayResId) { throw new RuntimeException("Stub!"); } 
/* 19 */   public String[] getChoiceValues() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setChoiceEntries(String[] choiceEntries) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setChoiceEntries(Context context, int stringArrayResId) { throw new RuntimeException("Stub!"); } 
/* 22 */   public String[] getChoiceEntries() { throw new RuntimeException("Stub!"); } 
/* 23 */   public String getDescription() { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setDescription(String description) { throw new RuntimeException("Stub!"); } 
/* 25 */   public String getKey() { throw new RuntimeException("Stub!"); } 
/* 26 */   public String getTitle() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setTitle(String title) { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 29 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 30 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 32 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.RestrictionEntry
 * JD-Core Version:    0.6.2
 */