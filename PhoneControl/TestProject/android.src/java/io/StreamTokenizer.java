/*    */ package java.io;
/*    */ 
/*    */ public class StreamTokenizer
/*    */ {
/*    */   public double nval;
/*    */   public String sval;
/*    */   public static final int TT_EOF = -1;
/*    */   public static final int TT_EOL = 10;
/*    */   public static final int TT_NUMBER = -2;
/*    */   public static final int TT_WORD = -3;
/*    */   public int ttype;
/*    */ 
/*    */   @Deprecated
/*    */   public StreamTokenizer(InputStream is)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public StreamTokenizer(Reader r) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void commentChar(int ch) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void eolIsSignificant(boolean flag) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int lineno() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void lowerCaseMode(boolean flag) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int nextToken() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void ordinaryChar(int ch) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void ordinaryChars(int low, int hi) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void parseNumbers() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void pushBack() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void quoteChar(int ch) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void resetSyntax() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void slashSlashComments(boolean flag) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void slashStarComments(boolean flag) { throw new RuntimeException("Stub!"); } 
/* 20 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 21 */   public void whitespaceChars(int low, int hi) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void wordChars(int low, int hi) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.io.StreamTokenizer
 * JD-Core Version:    0.6.2
 */