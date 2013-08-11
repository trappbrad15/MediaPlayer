/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.nio.channels.SocketChannel;
/*    */ 
/*    */ public class Socket
/*    */ {
/*    */   public Socket()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public Socket(Proxy proxy) { throw new RuntimeException("Stub!"); } 
/*  6 */   public Socket(String dstName, int dstPort) throws UnknownHostException, IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public Socket(String dstName, int dstPort, InetAddress localAddress, int localPort) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   @Deprecated
/*    */   public Socket(String hostName, int port, boolean streaming) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public Socket(InetAddress dstAddress, int dstPort) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public Socket(InetAddress dstAddress, int dstPort, InetAddress localAddress, int localPort) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   @Deprecated
/*    */   public Socket(InetAddress addr, int port, boolean streaming) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   protected Socket(SocketImpl impl) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 15 */   public synchronized void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public InetAddress getInetAddress() { throw new RuntimeException("Stub!"); } 
/* 17 */   public InputStream getInputStream() throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean getKeepAlive() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 19 */   public InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); } 
/* 20 */   public int getLocalPort() { throw new RuntimeException("Stub!"); } 
/* 21 */   public OutputStream getOutputStream() throws IOException { throw new RuntimeException("Stub!"); } 
/* 22 */   public int getPort() { throw new RuntimeException("Stub!"); } 
/* 23 */   public int getSoLinger() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 24 */   public synchronized int getReceiveBufferSize() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 25 */   public synchronized int getSendBufferSize() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 26 */   public synchronized int getSoTimeout() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean getTcpNoDelay() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setKeepAlive(boolean keepAlive) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 29 */   public static synchronized void setSocketImplFactory(SocketImplFactory fac) throws IOException { throw new RuntimeException("Stub!"); } 
/* 30 */   public synchronized void setSendBufferSize(int size) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 31 */   public synchronized void setReceiveBufferSize(int size) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setSoLinger(boolean on, int timeout) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 33 */   public synchronized void setSoTimeout(int timeout) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 34 */   public void setTcpNoDelay(boolean on) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 35 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 36 */   public void shutdownInput() throws IOException { throw new RuntimeException("Stub!"); } 
/* 37 */   public void shutdownOutput() throws IOException { throw new RuntimeException("Stub!"); } 
/* 38 */   public SocketAddress getLocalSocketAddress() { throw new RuntimeException("Stub!"); } 
/* 39 */   public SocketAddress getRemoteSocketAddress() { throw new RuntimeException("Stub!"); } 
/* 40 */   public boolean isBound() { throw new RuntimeException("Stub!"); } 
/* 41 */   public boolean isConnected() { throw new RuntimeException("Stub!"); } 
/* 42 */   public boolean isClosed() { throw new RuntimeException("Stub!"); } 
/* 43 */   public void bind(SocketAddress localAddr) throws IOException { throw new RuntimeException("Stub!"); } 
/* 44 */   public void connect(SocketAddress remoteAddr) throws IOException { throw new RuntimeException("Stub!"); } 
/* 45 */   public void connect(SocketAddress remoteAddr, int timeout) throws IOException { throw new RuntimeException("Stub!"); } 
/* 46 */   public boolean isInputShutdown() { throw new RuntimeException("Stub!"); } 
/* 47 */   public boolean isOutputShutdown() { throw new RuntimeException("Stub!"); } 
/* 48 */   public void setReuseAddress(boolean reuse) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 49 */   public boolean getReuseAddress() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 50 */   public void setOOBInline(boolean oobinline) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 51 */   public boolean getOOBInline() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 52 */   public void setTrafficClass(int value) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 53 */   public int getTrafficClass() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 54 */   public void sendUrgentData(int value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 55 */   public SocketChannel getChannel() { throw new RuntimeException("Stub!"); } 
/* 56 */   public void setPerformancePreferences(int connectionTime, int latency, int bandwidth) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.net.Socket
 * JD-Core Version:    0.6.2
 */