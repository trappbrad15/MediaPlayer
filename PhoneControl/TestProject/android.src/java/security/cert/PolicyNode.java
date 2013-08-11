package java.security.cert;

import java.util.Iterator;
import java.util.Set;

public abstract interface PolicyNode
{
  public abstract Iterator<? extends PolicyNode> getChildren();

  public abstract int getDepth();

  public abstract Set<String> getExpectedPolicies();

  public abstract PolicyNode getParent();

  public abstract Set<? extends PolicyQualifierInfo> getPolicyQualifiers();

  public abstract String getValidPolicy();

  public abstract boolean isCritical();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.cert.PolicyNode
 * JD-Core Version:    0.6.2
 */