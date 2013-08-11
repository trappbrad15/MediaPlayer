/*    */ package android.content;
/*    */ 
/*    */ import android.content.res.AssetFileDescriptor;
/*    */ import android.database.Cursor;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.CancellationSignal;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import android.os.RemoteException;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class ContentProviderClient
/*    */ {
/*    */   ContentProviderClient()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public Cursor query(Uri url, String[] projection, String selection, String[] selectionArgs, String sortOrder) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  6 */   public Cursor query(Uri url, String[] projection, String selection, String[] selectionArgs, String sortOrder, CancellationSignal cancellationSignal) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getType(Uri url) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  8 */   public String[] getStreamTypes(Uri url, String mimeTypeFilter) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  9 */   public Uri insert(Uri url, ContentValues initialValues) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 10 */   public int bulkInsert(Uri url, ContentValues[] initialValues) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 11 */   public int delete(Uri url, String selection, String[] selectionArgs) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 12 */   public int update(Uri url, ContentValues values, String selection, String[] selectionArgs) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 13 */   public ParcelFileDescriptor openFile(Uri url, String mode) throws RemoteException, FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 14 */   public AssetFileDescriptor openAssetFile(Uri url, String mode) throws RemoteException, FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 15 */   public final AssetFileDescriptor openTypedAssetFileDescriptor(Uri uri, String mimeType, Bundle opts) throws RemoteException, FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 16 */   public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> operations) throws RemoteException, OperationApplicationException { throw new RuntimeException("Stub!"); } 
/* 17 */   public Bundle call(String method, String arg, Bundle extras) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean release() { throw new RuntimeException("Stub!"); } 
/* 19 */   public ContentProvider getLocalContentProvider() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.ContentProviderClient
 * JD-Core Version:    0.6.2
 */