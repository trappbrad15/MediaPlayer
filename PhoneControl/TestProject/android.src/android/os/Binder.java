/*    */ package android.os;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public class Binder
/*    */   implements IBinder
/*    */ {
/*    */   public Binder()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*    */   public static final native int getCallingPid();
/*    */ 
/*    */   public static final native int getCallingUid();
/*    */ 
/*  8 */   public static final UserHandle getCallingUserHandle() { throw new RuntimeException("Stub!"); } 
/*    */   public static final native long clearCallingIdentity();
/*    */ 
/*    */   public static final native void restoreCallingIdentity(long paramLong);
/*    */ 
/*    */   public static final native void flushPendingCommands();
/*    */ 
/*    */   public static final native void joinThreadPool();
/*    */ 
/* 13 */   public void attachInterface(IInterface owner, String descriptor) { throw new RuntimeException("Stub!"); } 
/* 14 */   public String getInterfaceDescriptor() { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean pingBinder() { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean isBinderAlive() { throw new RuntimeException("Stub!"); } 
/* 17 */   public IInterface queryLocalInterface(String descriptor) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 19 */   public void dump(FileDescriptor fd, String[] args) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void dumpAsync(FileDescriptor fd, String[] args) { throw new RuntimeException("Stub!"); } 
/* 21 */   protected void dump(FileDescriptor fd, PrintWriter fout, String[] args) { throw new RuntimeException("Stub!"); } 
/* 22 */   public final boolean transact(int code, Parcel data, Parcel reply, int flags) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 23 */   public void linkToDeath(IBinder.DeathRecipient recipient, int flags) { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean unlinkToDeath(IBinder.DeathRecipient recipient, int flags) { throw new RuntimeException("Stub!"); } 
/* 25 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.os.Binder
 * JD-Core Version:    0.6.2
 */