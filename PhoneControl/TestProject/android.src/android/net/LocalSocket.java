/*    */ package android.net;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class LocalSocket
/*    */   implements Closeable
/*    */ {
/*    */   public LocalSocket()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void connect(LocalSocketAddress endpoint) throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void bind(LocalSocketAddress bindpoint) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public LocalSocketAddress getLocalSocketAddress() { throw new RuntimeException("Stub!"); } 
/* 10 */   public InputStream getInputStream() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public OutputStream getOutputStream() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void shutdownInput() throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void shutdownOutput() throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setReceiveBufferSize(int size) throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public int getReceiveBufferSize() throws IOException { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setSoTimeout(int n) throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */   public int getSoTimeout() throws IOException { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setSendBufferSize(int n) throws IOException { throw new RuntimeException("Stub!"); } 
/* 20 */   public int getSendBufferSize() throws IOException { throw new RuntimeException("Stub!"); } 
/* 21 */   public LocalSocketAddress getRemoteSocketAddress() { throw new RuntimeException("Stub!"); } 
/* 22 */   public synchronized boolean isConnected() { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean isClosed() { throw new RuntimeException("Stub!"); } 
/* 24 */   public synchronized boolean isBound() { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean isOutputShutdown() { throw new RuntimeException("Stub!"); } 
/* 26 */   public boolean isInputShutdown() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void connect(LocalSocketAddress endpoint, int timeout) throws IOException { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setFileDescriptorsForSend(FileDescriptor[] fds) { throw new RuntimeException("Stub!"); } 
/* 29 */   public FileDescriptor[] getAncillaryFileDescriptors() throws IOException { throw new RuntimeException("Stub!"); } 
/* 30 */   public Credentials getPeerCredentials() throws IOException { throw new RuntimeException("Stub!"); } 
/* 31 */   public FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.LocalSocket
 * JD-Core Version:    0.6.2
 */