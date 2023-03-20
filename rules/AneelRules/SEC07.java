package rules.AneelRules;

import java.security.CodeSource;
import java.security.PermissionCollection;
import java.net.URL;
import java.net.URLClassLoader;

public class SEC07<ApplyPermissions> extends URLClassLoader {
  public SEC07(URL[] urls) {
    super(urls);
  }

  protected PermissionCollection getPermissions(CodeSource cs) {
    PermissionCollection appPerm = super.getPermissions(cs);
    /**
     * By calling the super class in line 14, we ensure that the
     * proper security policies are followed. This will reduce the
     * chances of untrusted classes receiving elevated privileges
     */
    return (PermissionCollection) appPerm;
  }

}
