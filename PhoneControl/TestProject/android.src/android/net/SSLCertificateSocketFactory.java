/*    */ package android.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.InetAddress;
/*    */ import java.net.Socket;
/*    */ import javax.net.SocketFactory;
/*    */ import javax.net.ssl.KeyManager;
/*    */ import javax.net.ssl.TrustManager;
/*    */ 
/*    */ public class SSLCertificateSocketFactory extends javax.net.ssl.SSLSocketFactory
/*    */ {
/*    */   @Deprecated
/*    */   public SSLCertificateSocketFactory(int handshakeTimeoutMillis)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public static SocketFactory getDefault(int handshakeTimeoutMillis) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static javax.net.ssl.SSLSocketFactory getDefault(int handshakeTimeoutMillis, SSLSessionCache cache) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static javax.net.ssl.SSLSocketFactory getInsecure(int handshakeTimeoutMillis, SSLSessionCache cache) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static org.apache.http.conn.ssl.SSLSocketFactory getHttpSocketFactory(int handshakeTimeoutMillis, SSLSessionCache cache) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setTrustManagers(TrustManager[] trustManager) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setNpnProtocols(byte[][] npnProtocols) { throw new RuntimeException("Stub!"); } 
/* 13 */   public byte[] getNpnSelectedProtocol(Socket socket) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setKeyManagers(KeyManager[] keyManagers) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setUseSessionTickets(Socket socket, boolean useSessionTickets) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setHostname(Socket socket, String hostName) { throw new RuntimeException("Stub!"); } 
/* 17 */   public Socket createSocket(Socket k, String host, int port, boolean close) throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */   public Socket createSocket() throws IOException { throw new RuntimeException("Stub!"); } 
/* 19 */   public Socket createSocket(InetAddress addr, int port, InetAddress localAddr, int localPort) throws IOException { throw new RuntimeException("Stub!"); } 
/* 20 */   public Socket createSocket(InetAddress addr, int port) throws IOException { throw new RuntimeException("Stub!"); } 
/* 21 */   public Socket createSocket(String host, int port, InetAddress localAddr, int localPort) throws IOException { throw new RuntimeException("Stub!"); } 
/* 22 */   public Socket createSocket(String host, int port) throws IOException { throw new RuntimeException("Stub!"); } 
/* 23 */   public String[] getDefaultCipherSuites() { throw new RuntimeException("Stub!"); } 
/* 24 */   public String[] getSupportedCipherSuites() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.SSLCertificateSocketFactory
 * JD-Core Version:    0.6.2
 */