package java.security.acl;

import java.security.Principal;
import java.util.Enumeration;

public abstract interface Group extends Principal
{
  public abstract boolean addMember(Principal paramPrincipal);

  public abstract boolean removeMember(Principal paramPrincipal);

  public abstract boolean isMember(Principal paramPrincipal);

  public abstract Enumeration<? extends Principal> members();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.acl.Group
 * JD-Core Version:    0.6.2
 */