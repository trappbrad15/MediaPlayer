/*    */ package android.net;
/*    */ 
/*    */ import java.net.Socket;
/*    */ import java.net.SocketException;
/*    */ 
/*    */ public class TrafficStats
/*    */ {
/*    */   public static final int UNSUPPORTED = -1;
/*    */ 
/*    */   public TrafficStats()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static void setThreadStatsTag(int tag) { throw new RuntimeException("Stub!"); } 
/*  6 */   public static int getThreadStatsTag() { throw new RuntimeException("Stub!"); } 
/*  7 */   public static void clearThreadStatsTag() { throw new RuntimeException("Stub!"); } 
/*  8 */   public static void tagSocket(Socket socket) throws SocketException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static void untagSocket(Socket socket) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 10 */   public static void incrementOperationCount(int operationCount) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static void incrementOperationCount(int tag, int operationCount) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static long getMobileTxPackets() { throw new RuntimeException("Stub!"); } 
/* 13 */   public static long getMobileRxPackets() { throw new RuntimeException("Stub!"); } 
/* 14 */   public static long getMobileTxBytes() { throw new RuntimeException("Stub!"); } 
/* 15 */   public static long getMobileRxBytes() { throw new RuntimeException("Stub!"); } 
/* 16 */   public static long getTotalTxPackets() { throw new RuntimeException("Stub!"); } 
/* 17 */   public static long getTotalRxPackets() { throw new RuntimeException("Stub!"); } 
/* 18 */   public static long getTotalTxBytes() { throw new RuntimeException("Stub!"); } 
/* 19 */   public static long getTotalRxBytes() { throw new RuntimeException("Stub!"); } 
/* 20 */   public static long getUidTxBytes(int uid) { throw new RuntimeException("Stub!"); } 
/* 21 */   public static long getUidRxBytes(int uid) { throw new RuntimeException("Stub!"); } 
/* 22 */   public static long getUidTxPackets(int uid) { throw new RuntimeException("Stub!"); } 
/* 23 */   public static long getUidRxPackets(int uid) { throw new RuntimeException("Stub!"); } 
/* 25 */   @Deprecated
/*    */   public static long getUidTcpTxBytes(int uid) { throw new RuntimeException("Stub!"); } 
/* 27 */   @Deprecated
/*    */   public static long getUidTcpRxBytes(int uid) { throw new RuntimeException("Stub!"); } 
/* 29 */   @Deprecated
/*    */   public static long getUidUdpTxBytes(int uid) { throw new RuntimeException("Stub!"); } 
/* 31 */   @Deprecated
/*    */   public static long getUidUdpRxBytes(int uid) { throw new RuntimeException("Stub!"); } 
/* 33 */   @Deprecated
/*    */   public static long getUidTcpTxSegments(int uid) { throw new RuntimeException("Stub!"); } 
/* 35 */   @Deprecated
/*    */   public static long getUidTcpRxSegments(int uid) { throw new RuntimeException("Stub!"); } 
/* 37 */   @Deprecated
/*    */   public static long getUidUdpTxPackets(int uid) { throw new RuntimeException("Stub!"); } 
/* 39 */   @Deprecated
/*    */   public static long getUidUdpRxPackets(int uid) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.TrafficStats
 * JD-Core Version:    0.6.2
 */