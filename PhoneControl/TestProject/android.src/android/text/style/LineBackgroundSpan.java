package android.text.style;

import android.graphics.Canvas;
import android.graphics.Paint;

public abstract interface LineBackgroundSpan extends ParagraphStyle
{
  public abstract void drawBackground(Canvas paramCanvas, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CharSequence paramCharSequence, int paramInt6, int paramInt7, int paramInt8);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.style.LineBackgroundSpan
 * JD-Core Version:    0.6.2
 */