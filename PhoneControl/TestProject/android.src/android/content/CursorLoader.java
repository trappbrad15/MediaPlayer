/*    */ package android.content;
/*    */ 
/*    */ import android.database.Cursor;
/*    */ import android.net.Uri;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public class CursorLoader extends AsyncTaskLoader<Cursor>
/*    */ {
/*    */   public CursorLoader(Context context)
/*    */   {
/*  5 */     super((Context)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public CursorLoader(Context context, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) { super((Context)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public Cursor loadInBackground() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void cancelLoadInBackground() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void deliverResult(Cursor cursor) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected void onStartLoading() { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void onStopLoading() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void onCanceled(Cursor cursor) { throw new RuntimeException("Stub!"); } 
/* 13 */   protected void onReset() { throw new RuntimeException("Stub!"); } 
/* 14 */   public Uri getUri() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setUri(Uri uri) { throw new RuntimeException("Stub!"); } 
/* 16 */   public String[] getProjection() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setProjection(String[] projection) { throw new RuntimeException("Stub!"); } 
/* 18 */   public String getSelection() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setSelection(String selection) { throw new RuntimeException("Stub!"); } 
/* 20 */   public String[] getSelectionArgs() { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setSelectionArgs(String[] selectionArgs) { throw new RuntimeException("Stub!"); } 
/* 22 */   public String getSortOrder() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setSortOrder(String sortOrder) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.CursorLoader
 * JD-Core Version:    0.6.2
 */