/*    */ package android.net;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ import android.app.Service;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import java.net.DatagramSocket;
/*    */ import java.net.InetAddress;
/*    */ import java.net.Socket;
/*    */ 
/*    */ public class VpnService extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.net.VpnService";
/*    */ 
/*    */   public VpnService()
/*    */   {
/* 20 */     throw new RuntimeException("Stub!"); } 
/* 21 */   public static Intent prepare(Context context) { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean protect(int socket) { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean protect(Socket socket) { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean protect(DatagramSocket socket) { throw new RuntimeException("Stub!"); } 
/* 25 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void onRevoke() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public class Builder
/*    */   {
/*    */     public Builder()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public Builder setSession(String session) { throw new RuntimeException("Stub!"); } 
/*  9 */     public Builder setConfigureIntent(PendingIntent intent) { throw new RuntimeException("Stub!"); } 
/* 10 */     public Builder setMtu(int mtu) { throw new RuntimeException("Stub!"); } 
/* 11 */     public Builder addAddress(InetAddress address, int prefixLength) { throw new RuntimeException("Stub!"); } 
/* 12 */     public Builder addAddress(String address, int prefixLength) { throw new RuntimeException("Stub!"); } 
/* 13 */     public Builder addRoute(InetAddress address, int prefixLength) { throw new RuntimeException("Stub!"); } 
/* 14 */     public Builder addRoute(String address, int prefixLength) { throw new RuntimeException("Stub!"); } 
/* 15 */     public Builder addDnsServer(InetAddress address) { throw new RuntimeException("Stub!"); } 
/* 16 */     public Builder addDnsServer(String address) { throw new RuntimeException("Stub!"); } 
/* 17 */     public Builder addSearchDomain(String domain) { throw new RuntimeException("Stub!"); } 
/* 18 */     public ParcelFileDescriptor establish() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.VpnService
 * JD-Core Version:    0.6.2
 */