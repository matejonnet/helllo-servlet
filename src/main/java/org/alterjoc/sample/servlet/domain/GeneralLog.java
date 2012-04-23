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
@Table(name="general_log")
public class GeneralLog
{

	private int threadId;
	private int serverId;

	/**
	 * @return the threadId
	 */
	@Id
	@Column(name="thread_id")
	public int getThreadId()
	{
		return threadId;
	}

	/**
	 * @param threadId the threadId to set
	 */
	public void setThreadId(int threadId)
	{
		this.threadId = threadId;
	}


	/**
	 * @return the serverId
	 */
	@Column(name="server_id")
	public int getServerId()
	{
		return serverId;
	}

	/**
	 * @param serverId the serverId to set
	 */
	public void setServerId(int serverId)
	{
		this.serverId = serverId;
	}




//
//	thread_id
//	| server_id
}
