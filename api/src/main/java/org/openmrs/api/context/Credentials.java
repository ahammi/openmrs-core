package org.openmrs.api.context;

import org.openmrs.User;
import org.openmrs.api.db.ContextDAO;

/*
 * Authentication schemes define their own credentials.
 * Any client authenticating against a given scheme must
 * supply appropriate credentials.
 */
public interface Credentials {
	
	/*
	 * Credentials will contains scheme-specific properties, but all credentials
	 * must declare their scheme.
	 */
	public String getAuthenticationScheme();
	
	public User authenticate(ContextDAO contextDao);
	
	public String getUsername();
	
	public String getPassword();
}
