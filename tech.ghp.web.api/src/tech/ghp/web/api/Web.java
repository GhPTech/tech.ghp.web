package tech.ghp.web.api;

import org.osgi.annotation.versioning.ProviderType;

/**
 * A service that turns a string to upper case
 */
@ProviderType
public interface Web {
	
	/**
	 * Turn a string into upper case
	 */
	String upper(String input);
	
}
