/*     */ package android.renderscript;
/*     */ 
/*     */ public class Element extends BaseObj
/*     */ {
/*     */   Element()
/*     */   {
/*  55 */     throw new RuntimeException("Stub!"); } 
/*  56 */   public int getBytesSize() { throw new RuntimeException("Stub!"); } 
/*  57 */   public int getVectorSize() { throw new RuntimeException("Stub!"); } 
/*  58 */   public boolean isComplex() { throw new RuntimeException("Stub!"); } 
/*  59 */   public int getSubElementCount() { throw new RuntimeException("Stub!"); } 
/*  60 */   public Element getSubElement(int index) { throw new RuntimeException("Stub!"); } 
/*  61 */   public String getSubElementName(int index) { throw new RuntimeException("Stub!"); } 
/*  62 */   public int getSubElementArraySize(int index) { throw new RuntimeException("Stub!"); } 
/*  63 */   public int getSubElementOffsetBytes(int index) { throw new RuntimeException("Stub!"); } 
/*  64 */   public DataType getDataType() { throw new RuntimeException("Stub!"); } 
/*  65 */   public DataKind getDataKind() { throw new RuntimeException("Stub!"); } 
/*  66 */   public static Element BOOLEAN(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  67 */   public static Element U8(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  68 */   public static Element I8(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  69 */   public static Element U16(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  70 */   public static Element I16(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  71 */   public static Element U32(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  72 */   public static Element I32(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  73 */   public static Element U64(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  74 */   public static Element I64(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  75 */   public static Element F32(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  76 */   public static Element F64(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  77 */   public static Element ELEMENT(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  78 */   public static Element TYPE(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  79 */   public static Element ALLOCATION(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  80 */   public static Element SAMPLER(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  81 */   public static Element SCRIPT(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  82 */   public static Element MESH(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  83 */   public static Element PROGRAM_FRAGMENT(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  84 */   public static Element PROGRAM_VERTEX(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  85 */   public static Element PROGRAM_RASTER(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  86 */   public static Element PROGRAM_STORE(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  87 */   public static Element FONT(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  88 */   public static Element A_8(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  89 */   public static Element RGB_565(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  90 */   public static Element RGB_888(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  91 */   public static Element RGBA_5551(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  92 */   public static Element RGBA_4444(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  93 */   public static Element RGBA_8888(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  94 */   public static Element F32_2(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  95 */   public static Element F32_3(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  96 */   public static Element F32_4(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  97 */   public static Element F64_2(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  98 */   public static Element F64_3(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/*  99 */   public static Element F64_4(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 100 */   public static Element U8_2(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 101 */   public static Element U8_3(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 102 */   public static Element U8_4(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 103 */   public static Element I8_2(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 104 */   public static Element I8_3(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 105 */   public static Element I8_4(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 106 */   public static Element U16_2(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 107 */   public static Element U16_3(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 108 */   public static Element U16_4(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 109 */   public static Element I16_2(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 110 */   public static Element I16_3(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 111 */   public static Element I16_4(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 112 */   public static Element U32_2(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 113 */   public static Element U32_3(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 114 */   public static Element U32_4(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 115 */   public static Element I32_2(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 116 */   public static Element I32_3(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 117 */   public static Element I32_4(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 118 */   public static Element U64_2(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 119 */   public static Element U64_3(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 120 */   public static Element U64_4(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 121 */   public static Element I64_2(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 122 */   public static Element I64_3(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 123 */   public static Element I64_4(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 124 */   public static Element MATRIX_4X4(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 126 */   @Deprecated
/*     */   public static Element MATRIX4X4(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 127 */   public static Element MATRIX_3X3(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 128 */   public static Element MATRIX_2X2(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 129 */   public static Element createVector(RenderScript rs, DataType dt, int size) { throw new RuntimeException("Stub!"); } 
/* 130 */   public static Element createPixel(RenderScript rs, DataType dt, DataKind dk) { throw new RuntimeException("Stub!"); } 
/* 131 */   public boolean isCompatible(Element e) { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */ 
/*     */   public static class Builder
/*     */   {
/*     */     public Builder(RenderScript rs)
/*     */     {
/*  50 */       throw new RuntimeException("Stub!"); } 
/*  51 */     public Builder add(Element element, String name, int arraySize) { throw new RuntimeException("Stub!"); } 
/*  52 */     public Builder add(Element element, String name) { throw new RuntimeException("Stub!"); } 
/*  53 */     public Element create() { throw new RuntimeException("Stub!"); }
/*     */ 
/*     */   }
/*     */ 
/*     */   public static enum DataKind
/*     */   {
/*  39 */     PIXEL_A, 
/*  40 */     PIXEL_DEPTH, 
/*  41 */     PIXEL_L, 
/*  42 */     PIXEL_LA, 
/*  43 */     PIXEL_RGB, 
/*  44 */     PIXEL_RGBA, 
/*  45 */     PIXEL_YUV, 
/*  46 */     USER;
/*     */   }
/*     */ 
/*     */   public static enum DataType
/*     */   {
/*   7 */     BOOLEAN, 
/*   8 */     FLOAT_32, 
/*   9 */     FLOAT_64, 
/*  10 */     MATRIX_2X2, 
/*  11 */     MATRIX_3X3, 
/*  12 */     MATRIX_4X4, 
/*  13 */     NONE, 
/*  14 */     RS_ALLOCATION, 
/*  15 */     RS_ELEMENT, 
/*  16 */     RS_FONT, 
/*  17 */     RS_MESH, 
/*  18 */     RS_PROGRAM_FRAGMENT, 
/*  19 */     RS_PROGRAM_RASTER, 
/*  20 */     RS_PROGRAM_STORE, 
/*  21 */     RS_PROGRAM_VERTEX, 
/*  22 */     RS_SAMPLER, 
/*  23 */     RS_SCRIPT, 
/*  24 */     RS_TYPE, 
/*  25 */     SIGNED_16, 
/*  26 */     SIGNED_32, 
/*  27 */     SIGNED_64, 
/*  28 */     SIGNED_8, 
/*  29 */     UNSIGNED_16, 
/*  30 */     UNSIGNED_32, 
/*  31 */     UNSIGNED_4_4_4_4, 
/*  32 */     UNSIGNED_5_5_5_1, 
/*  33 */     UNSIGNED_5_6_5, 
/*  34 */     UNSIGNED_64, 
/*  35 */     UNSIGNED_8;
/*     */   }
/*     */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.renderscript.Element
 * JD-Core Version:    0.6.2
 */