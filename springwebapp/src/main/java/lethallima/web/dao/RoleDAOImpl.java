package lethallima.web.dao;

import lethallima.web.entities.Role;
import lethallima.web.helpers.Const;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by LethalLima on 10/16/16.
 */
@Repository
public class RoleDAOImpl extends AbstractCommonDAO implements RoleDAO {

    @SuppressWarnings("unchecked")
    public List<String> getAllRoles() {
        return session().createCriteria(Role.class)
                .setProjection(Projections.property(Const.USER_ROLE))
                .list();
    }
}