/**
 *
 */
package org.alterjoc.sample.servlet.domain.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.alterjoc.sample.servlet.domain.User;

/**
 * @author <a href="mailto:matejonnet@gmail.com">Matej Lazar</a>
 */
@Stateless
public class DbSelect
{
	@PersistenceContext
	EntityManager entityManager;

	public String getFromDb()
	{
		String result = "";
//		TypedQuery<GeneralLog> q = entityManager.createQuery("select g from GeneralLog g", GeneralLog.class);
//		List<GeneralLog> r = q.getResultList();
//		for (GeneralLog gl : r) {
//			result += gl.getThreadId() + " - " + gl.getServerId();
//		}
		TypedQuery<User> q = entityManager.createQuery("from User", User.class);
		List<User> r = q.getResultList();
		for (User u : r) {
			result += u.getHost() + " - " + u.getUser() + "\n";
		}


		return result;
	}
}
