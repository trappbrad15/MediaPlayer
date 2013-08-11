/*    */ package android.content;
/*    */ 
/*    */ import android.content.pm.PathPermission;
/*    */ import android.content.pm.ProviderInfo;
/*    */ import android.content.res.AssetFileDescriptor;
/*    */ import android.content.res.Configuration;
/*    */ import android.database.Cursor;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.CancellationSignal;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.PrintWriter;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public abstract class ContentProvider
/*    */   implements ComponentCallbacks2
/*    */ {
/*    */   public ContentProvider()
/*    */   {
/*  9 */     throw new RuntimeException("Stub!"); } 
/* 10 */   public final Context getContext() { throw new RuntimeException("Stub!"); } 
/* 11 */   protected final void setReadPermission(String permission) { throw new RuntimeException("Stub!"); } 
/* 12 */   public final String getReadPermission() { throw new RuntimeException("Stub!"); } 
/* 13 */   protected final void setWritePermission(String permission) { throw new RuntimeException("Stub!"); } 
/* 14 */   public final String getWritePermission() { throw new RuntimeException("Stub!"); } 
/* 15 */   protected final void setPathPermissions(PathPermission[] permissions) { throw new RuntimeException("Stub!"); } 
/* 16 */   public final PathPermission[] getPathPermissions() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean onCreate();
/*    */ 
/* 18 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void onLowMemory() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void onTrimMemory(int level) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2);
/*    */ 
/* 22 */   public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder, CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract String getType(Uri paramUri);
/*    */ 
/*    */   public abstract Uri insert(Uri paramUri, ContentValues paramContentValues);
/*    */ 
/* 25 */   public int bulkInsert(Uri uri, ContentValues[] values) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int delete(Uri paramUri, String paramString, String[] paramArrayOfString);
/*    */ 
/*    */   public abstract int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString);
/*    */ 
/* 28 */   public ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 29 */   public AssetFileDescriptor openAssetFile(Uri uri, String mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 30 */   protected final ParcelFileDescriptor openFileHelper(Uri uri, String mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 31 */   public String[] getStreamTypes(Uri uri, String mimeTypeFilter) { throw new RuntimeException("Stub!"); } 
/* 32 */   public AssetFileDescriptor openTypedAssetFile(Uri uri, String mimeTypeFilter, Bundle opts) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 33 */   public <T> ParcelFileDescriptor openPipeHelper(Uri uri, String mimeType, Bundle opts, T args, PipeDataWriter<T> func) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 34 */   protected boolean isTemporary() { throw new RuntimeException("Stub!"); } 
/* 35 */   public void attachInfo(Context context, ProviderInfo info) { throw new RuntimeException("Stub!"); } 
/* 36 */   public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> operations) throws OperationApplicationException { throw new RuntimeException("Stub!"); } 
/* 37 */   public Bundle call(String method, String arg, Bundle extras) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void shutdown() { throw new RuntimeException("Stub!"); } 
/* 39 */   public void dump(FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface PipeDataWriter<T>
/*    */   {
/*    */     public abstract void writeDataToPipe(ParcelFileDescriptor paramParcelFileDescriptor, Uri paramUri, String paramString, Bundle paramBundle, T paramT);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.ContentProvider
 * JD-Core Version:    0.6.2
 */