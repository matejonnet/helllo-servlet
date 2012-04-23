/**
 *
 */
package org.alterjoc.sample.servlet.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author <a href="mailto:matejonnet@gmail.com">Matej Lazar</a>
 */
@Entity
@Table(name="user")
public class User
{

	private String host;
	private String user;

	@Id
	@Column(name="Host")
	public String getHost()
	{
		return host;
	}

	/**
	 * @param host the host to set
	 */
	public void setHost(String host)
	{
		this.host = host;
	}

	@Column(name="User")
	public String getUser()
	{
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user)
	{
		this.user = user;
	}








//
//	thread_id
//	| server_id
}
