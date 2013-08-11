/*   */ package java.nio.channels;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.net.ServerSocket;
/*   */ import java.nio.channels.spi.AbstractSelectableChannel;
/*   */ import java.nio.channels.spi.SelectorProvider;
/*   */ 
/*   */ public abstract class ServerSocketChannel extends AbstractSelectableChannel
/*   */ {
/*   */   protected ServerSocketChannel(SelectorProvider selectorProvider)
/*   */   {
/* 5 */     super((SelectorProvider)null); throw new RuntimeException("Stub!"); } 
/* 6 */   public static ServerSocketChannel open() throws IOException { throw new RuntimeException("Stub!"); } 
/* 7 */   public final int validOps() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public abstract ServerSocket socket();
/*   */ 
/*   */   public abstract SocketChannel accept()
/*   */     throws IOException;
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.nio.channels.ServerSocketChannel
 * JD-Core Version:    0.6.2
 */