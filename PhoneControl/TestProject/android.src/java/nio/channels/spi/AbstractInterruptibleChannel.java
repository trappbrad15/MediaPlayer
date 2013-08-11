/*   */ package java.nio.channels.spi;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.nio.channels.AsynchronousCloseException;
/*   */ import java.nio.channels.Channel;
/*   */ import java.nio.channels.InterruptibleChannel;
/*   */ 
/*   */ public abstract class AbstractInterruptibleChannel
/*   */   implements Channel, InterruptibleChannel
/*   */ {
/*   */   protected AbstractInterruptibleChannel()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public final synchronized boolean isOpen() { throw new RuntimeException("Stub!"); } 
/* 7 */   public final void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 8 */   protected final void begin() { throw new RuntimeException("Stub!"); } 
/* 9 */   protected final void end(boolean success) throws AsynchronousCloseException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   protected abstract void implCloseChannel()
/*   */     throws IOException;
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.nio.channels.spi.AbstractInterruptibleChannel
 * JD-Core Version:    0.6.2
 */